package com.binfile.opener.viewer.reader.pdf.converter.utils

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.OverScroller
import android.view.VelocityTracker
import android.view.ViewConfiguration
import android.view.MotionEvent
import android.view.View

/*from  w  w  w. j a v a 2  s .  c  o  m*/ open class ScrollViewwoDimension : FrameLayout {
    //Fling components
    private var mScroller: OverScroller? = null
    private var mVelocityTracker: VelocityTracker? = null

    /* Positions of the last motion event */
    private var mLastTouchX = 0f
    private var mLastTouchY = 0f

    /* Drag threshold */
    private var mTouchSlop = 0

    /* Fling Velocity */
    private var mMaximumVelocity = 0
    private var mMinimumVelocity = 0

    /* Drag Lock */
    private var mDragging = false

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init(context)
    }

    private fun init(context: Context) {
        mScroller = OverScroller(context)
        mVelocityTracker = VelocityTracker.obtain()
        //Get system constants for touch thresholds
        mTouchSlop = ViewConfiguration.get(context).scaledTouchSlop
        mMaximumVelocity = ViewConfiguration.get(context).scaledMaximumFlingVelocity
        mMinimumVelocity = ViewConfiguration.get(context).scaledMinimumFlingVelocity
    }

    /*
     * Override the measureChild... implementations to guarantee that the child view
     * gets measured to be as large as it wants to be.  The default implementation will
     * force some children to be only as large as this view.
     */
    override fun measureChild(
        child: View,
        parentWidthMeasureSpec: Int,
        parentHeightMeasureSpec: Int
    ) {
        val childWidthMeasureSpec: Int
        val childHeightMeasureSpec: Int
        childWidthMeasureSpec = MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED)
        childHeightMeasureSpec = MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED)
        child.measure(childWidthMeasureSpec, childHeightMeasureSpec)
    }

    override fun measureChildWithMargins(
        child: View, parentWidthMeasureSpec: Int, widthUsed: Int,
        parentHeightMeasureSpec: Int, heightUsed: Int
    ) {
        val lp = child.layoutParams as MarginLayoutParams
        val childWidthMeasureSpec = MeasureSpec.makeMeasureSpec(
            lp.leftMargin + lp.rightMargin, MeasureSpec.UNSPECIFIED
        )
        val childHeightMeasureSpec = MeasureSpec.makeMeasureSpec(
            lp.topMargin + lp.bottomMargin, MeasureSpec.UNSPECIFIED
        )
        child.measure(childWidthMeasureSpec, childHeightMeasureSpec)
    }

    override fun computeScroll() {
        if (mScroller!!.computeScrollOffset()) {
            // This is called at drawing time by ViewGroup.  We use
            // this method to keep the fling animation going through
            // to completion.
            val oldX = scrollX
            val oldY = scrollY
            var x = mScroller!!.currX
            var y = mScroller!!.currY
            if (childCount > 0) {
                val child = getChildAt(0)
                x = clamp(x, width - paddingRight - paddingLeft, child.width)
                y = clamp(y, height - paddingBottom - paddingTop, child.height)
                if (x != oldX || y != oldY) {
                    scrollTo(x, y)
                }
            }

            // Keep on drawing until the animation has finished.
            postInvalidate()
        }
    }

    //Override scrollTo to do bounds checks on any scrolling request
    override fun scrollTo(x: Int, y: Int) {
        // we rely on the fact the View.scrollBy calls scrollTo.
        var x = x
        var y = y
        if (childCount > 0) {
            val child = getChildAt(0)
            x = clamp(x, width - paddingRight - paddingLeft, child.width)
            y = clamp(y, height - paddingBottom - paddingTop, child.height)
            if (x != scrollX || y != scrollY) {
                super.scrollTo(x, y)
            }
        }
    }

    /*
     * Utility method to initialize the Scroller and start redrawing
     */
    fun fling(velocityX: Int, velocityY: Int) {
        if (childCount > 0) {
            val height = height - paddingBottom - paddingTop
            val width = width - paddingLeft - paddingRight
            val bottom = getChildAt(0).height
            val right = getChildAt(0).width
            mScroller!!.fling(
                scrollX, scrollY, velocityX, velocityY,
                0, Math.max(0, right - width),
                0, Math.max(0, bottom - height)
            )
            invalidate()
        }
    }

    /*
     * Utility method to assist in doing bounds checking
     */
    private fun clamp(n: Int, my: Int, child: Int): Int {
        if (my >= child || n < 0) {
            /* my >= child is this case:
             *                    |--------------- me ---------------|
             *     |------ child ------|
             * or
             *     |--------------- me ---------------|
             *            |------ child ------|
             * or
             *     |--------------- me ---------------|
             *                                  |------ child ------|
             *
             * n < 0 is this case:
             *     |------ me ------|
             *                    |-------- child --------|
             *     |-- mScrollX --|
             */
            return 0
        }
        return if (my + n > child) {
            /* this case:
             *                    |------ me ------|
             *     |------ child ------|
             *     |-- mScrollX --|
             */
            child - my
        } else n
    }

    /*
     * Monitor touch events passed down to the children and
     * intercept as soon as it is determined we are dragging.  This
     * allows child views to still receive touch events if they are
     * interactive (i.e. Buttons)
     */
    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                //Stop any flinging in progress
                if (!mScroller!!.isFinished) {
                    mScroller!!.abortAnimation()
                }
                //Reset the velocity tracker
                mVelocityTracker!!.clear()
                mVelocityTracker!!.addMovement(event)
                //Save the initial touch point
                mLastTouchX = event.x
                mLastTouchY = event.y
            }
            MotionEvent.ACTION_MOVE -> {
                val x = event.x
                val y = event.y
                val yDiff = Math.abs(y - mLastTouchY).toInt()
                val xDiff = Math.abs(x - mLastTouchX).toInt()
                //Verify that either difference is enough to be a drag
                if (yDiff > mTouchSlop || xDiff > mTouchSlop) {
                    mDragging = true
                    mVelocityTracker!!.addMovement(event)
                    //Start capturing events ourselves
                    return true
                }
            }
            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP -> {
                mDragging = false
                mVelocityTracker!!.clear()
            }
        }
        return super.onInterceptTouchEvent(event)
    }

    /*
     * Feed all touch events we receive to the detector for
     * processing.
     */
    override fun onTouchEvent(event: MotionEvent): Boolean {
        mVelocityTracker!!.addMovement(event)
        when (event.action) {
            MotionEvent.ACTION_DOWN ->                 // We've already stored the initial point,
                // but if we got here a child view didn't capture
                // the event, so we need to.
                return true
            MotionEvent.ACTION_MOVE -> {
                val x = event.x
                val y = event.y
                val deltaY = mLastTouchY - y
                val deltaX = mLastTouchX - x
                //Check for slop on direct events
                if (!mDragging && (Math.abs(deltaY) > mTouchSlop || Math.abs(deltaX) > mTouchSlop)) {
                    mDragging = true
                }
                if (mDragging) {
                    //Scroll the view
                    scrollBy(deltaX.toInt(), deltaY.toInt())
                    //Update the last touch event
                    mLastTouchX = x
                    mLastTouchY = y
                }
            }
            MotionEvent.ACTION_CANCEL -> {
                mDragging = false
                //Stop any flinging in progress
                if (!mScroller!!.isFinished) {
                    mScroller!!.abortAnimation()
                }
            }
            MotionEvent.ACTION_UP -> {
                mDragging = false
                // Compute the current velocity and start a fling if it is above
                // the minimum threshold.
                mVelocityTracker!!.computeCurrentVelocity(1000, mMaximumVelocity.toFloat())
                val velocityX = mVelocityTracker!!.xVelocity.toInt()
                val velocityY = mVelocityTracker!!.yVelocity.toInt()
                if (Math.abs(velocityX) > mMinimumVelocity || Math.abs(velocityY) > mMinimumVelocity) {
                    fling(-velocityX, -velocityY)
                }
            }
        }
        return super.onTouchEvent(event)
    }

    override fun draw(canvas: Canvas) {
        super.draw(canvas)
    }
}
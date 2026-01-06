
package com.binfile.opener.viewer.reader.pdf.converter.utils

import androidx.annotation.RequiresApi
import android.os.Build
import kotlin.jvm.JvmOverloads
import com.binfile.opener.viewer.reader.pdf.converter.utils.CmdHandlerCodeArea.CodeAreaCommandHandlerFactory
import android.view.ViewGroup
import org.exbin.bined.CodeAreaControl
import org.exbin.auxiliary.paged_data.BinaryData
import org.exbin.bined.DataChangedListener
import org.exbin.bined.capability.SelectionCapable
import android.app.Activity
import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import org.exbin.bined.capability.ScrollingCapable
import android.widget.RelativeLayout
import com.binfile.opener.viewer.reader.pdf.converter.utils.basics.CodeAreaCmdHandlerCodeAreaDefault

import java.util.ArrayList

/**
 * Hexadecimal viewer/editor component.

 */
@RequiresApi(api = Build.VERSION_CODES.N)

abstract class CoreCodeArea @JvmOverloads constructor(
    context: Context?,
    attrs: AttributeSet?,
    commandHandlerFactory: CodeAreaCommandHandlerFactory? = null
) : ViewGroup(context, attrs), CodeAreaControl {
    private var contentData: BinaryData? = null

    
    protected val primaryView: PrimaryView


    
    var commandHandler: CmdHandlerCodeArea = if (commandHandlerFactory == null) com.binfile.opener.viewer.reader.pdf.converter.utils.basics.CodeAreaCmdHandlerCodeAreaDefault(
        context,
        this
    ) else commandHandlerFactory.createCommandHandler(this)!!
    private val dataChangedListeners: MutableList<DataChangedListener> = ArrayList()
    private fun init() {
        // TODO: Use swing color instead
//        setBackgroundColor(ColorUtils.WHITE);
//        setFocusable(true);
//        setSystemUiVisibility(getSystemUiVisibility() | View.FOCUSABLE);
//        setFocusTraversalKeysEnabled(false);
    }

    override fun copy() {
        commandHandler.copy()
    }

    fun copyAsCode() {
        commandHandler.copyAsCode()
    }

    override fun cut() {
        commandHandler.cut()
    }

    override fun paste() {
        commandHandler.paste()
    }

    fun pasteFromCode() {
        commandHandler.pasteFromCode()
    }

    override fun delete() {
        commandHandler.delete()
    }

    override fun selectAll() {
        commandHandler.selectAll()
    }

    override fun clearSelection() {
        commandHandler.clearSelection()
    }

    override fun canPaste(): Boolean {
        return commandHandler.canPaste()
    }

    override fun hasSelection(): Boolean {
        return if (this is SelectionCapable) {
            (this as SelectionCapable).hasSelection()
        } else false
    }

    override fun getContentData(): BinaryData? {
        return contentData
    }

    fun setContentData(contentData: BinaryData?) {
        this.contentData = contentData
        notifyDataChanged()
        repaint()
    }

    override fun getDataSize(): Long {
        return if (contentData == null) 0 else contentData!!.dataSize
    }

    /**
     * Notifies component, that internal data was changed.
     */
    fun notifyDataChanged() {
        resetPainter()
        for (listener in dataChangedListeners) {
            listener.dataChanged()
        }
    }

    fun addDataChangedListener(dataChangedListener: DataChangedListener) {
        dataChangedListeners.add(dataChangedListener)
    }

    fun removeDataChangedListener(dataChangedListener: DataChangedListener) {
        dataChangedListeners.remove(dataChangedListener)
    }

    open fun repaint() {
        val activity = context as Activity
        activity.runOnUiThread {
            invalidate()
            primaryView.invalidate()
        }
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        if (changed) {
            primaryView.layout(left, top, right, bottom)
            resetPainter()
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        commandHandler.moveCaret(
            event.x.toInt(),
            event.y.toInt(),
            CmdHandlerCodeArea.SelectingMode.NONE
        )
        (this as ScrollingCapable).revealCursor()
        return true
    }

    abstract fun resetPainter()
    abstract fun updateLayout()
    abstract fun paintView(g: Canvas?)
    inner class PrimaryView @JvmOverloads constructor(
        context: Context?,
        attrs: AttributeSet?,
        commandHandlerFactory: CodeAreaCommandHandlerFactory? = null
    ) : View(context, attrs) {
        override fun onDraw(g: Canvas) {
            super.onDraw(g)
            if (g == null) {
                return
            }
            paintView(g)
        }

        override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        }

        override fun onSizeChanged(width: Int, height: Int, oldWidth: Int, oldHeight: Int) {
            super.onSizeChanged(width, height, oldWidth, oldHeight)
            // TODO reset layout instead
            resetPainter()
        }

        override fun onKeyDown(keyCode: Int, keyEvent: KeyEvent): Boolean {
            commandHandler.keyTyped(keyCode, keyEvent)
            return super.onKeyDown(keyCode, keyEvent)
        }

        override fun onKeyUp(keyCode: Int, keyEvent: KeyEvent): Boolean {
            commandHandler.keyPressed(keyEvent)
            return super.onKeyUp(keyCode, keyEvent)
        }

        override fun onFocusChanged(
            gainFocus: Boolean,
            direction: Int,
            previouslyFocusedRect: Rect?
        ) {
            super.onFocusChanged(gainFocus, direction, previouslyFocusedRect)
            repaint()
        }

        override fun onTouchEvent(event: MotionEvent): Boolean {
            if (event.isButtonPressed(MotionEvent.BUTTON_PRIMARY)) {
                performClick()
            }
            this@CoreCodeArea.onTouchEvent(event)
            return false
        }

        override fun performClick(): Boolean {
            return super.performClick()
        }
        /**
         * Creates new instance with provided command handler and codeArea factory
         * methods.
         *
         * @param commandHandlerFactory command handler or null for default handler
         */
        /**
         * Creates new instance with default command handler and painter.
         */
        init {
            isFocusable = true
        }
    }
    /**
     * Creates new instance with provided command handler factory method.
     *
     * @param commandHandlerFactory command handler or null for default handler
     */
    /**
     * Creates new instance with default command handler and painter.
     */
    init {
        init()
        primaryView = PrimaryView(context, attrs)
        val wrapLayout = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.MATCH_PARENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )
        addView(primaryView, wrapLayout)
    }
}

package com.binfile.opener.viewer.reader.pdf.converter.utils.basics;

import android.content.Context;
import android.util.AttributeSet;

import com.binfile.opener.viewer.reader.pdf.converter.utils.ScrollViewwoDimension;

/**
 * Default scroll pane for binary component.

 */

public class CodeAreaScrollPanesDefault extends ScrollViewwoDimension {

    private volatile boolean scrollingByUser = false;
    private volatile boolean scrollingUpdate = false;

    public CodeAreaScrollPanesDefault(Context context) {
        super(context);
        init();
    }

    public CodeAreaScrollPanesDefault(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CodeAreaScrollPanesDefault(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        setScrollContainer(true);
    }

    public void updateScrollBars(int verticalScrollValue, int horizontalScrollValue) {
//        scrollingUpdate = true;
//        verticalScrollBar.setValue(verticalScrollValue);
//        horizontalScrollBar.setValue(horizontalScrollValue);
//        scrollingUpdate = false;
    }
}

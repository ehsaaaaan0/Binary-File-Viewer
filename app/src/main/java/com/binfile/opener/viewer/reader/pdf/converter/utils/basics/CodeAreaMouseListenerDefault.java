
package com.binfile.opener.viewer.reader.pdf.converter.utils.basics;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.RequiresApi;

import com.binfile.opener.viewer.reader.pdf.converter.utils.CmdHandlerCodeArea.SelectingMode;
import com.binfile.opener.viewer.reader.pdf.converter.utils.CoreCodeArea;
import org.exbin.bined.capability.ScrollingCapable;


/**
 * Component mouse listener for code area.

 */

public class CodeAreaMouseListenerDefault implements View.OnTouchListener {

    public static final int MOUSE_SCROLL_LINES = 3;

    private final CoreCodeArea codeArea;
    private final CodeAreaScrollPanesDefault view;

    private final int defaultCursor = 0;
    private final int textCursor = 1;
    private int currentCursor;
    private boolean mouseDown = false;

    public CodeAreaMouseListenerDefault(CoreCodeArea codeArea, CodeAreaScrollPanesDefault view) {
        this.codeArea = codeArea;
        this.view = view;
        currentCursor = 0;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.isButtonPressed(MotionEvent.BUTTON_PRIMARY)) {
            performClick();
        }

        if (codeArea.isEnabled() && motionEvent.getAction() == MotionEvent.ACTION_UP) {
            moveCaret(motionEvent);
            return true;
        }

        return false;
    }

    private void performClick() {
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void moveCaret(MotionEvent me) {
        SelectingMode selecting = SelectingMode.NONE; //SELECTING(me.getActionButton()getModifiersEx() & KeyEvent.SHIFT_DOWN_MASK) > 0 ? SelectingMode.SELECTING : SelectingMode.NONE;
        codeArea.getCommandHandler().moveCaret((int) computeRelativeX(me), (int) computeRelativeY(me), selecting);
        ((ScrollingCapable) codeArea).revealCursor();
    }

    private float computeRelativeX(MotionEvent me) {
        return me.getX() - view.getScrollX() + view.getX();
//        boolean isDataView = true; // me.getSource() != codeArea;
//        return isDataView ? me.getX() - view.getX() : me.getX();
    }

    private float computeRelativeY(MotionEvent me) {
        return me.getY() - view.getScrollY() + view.getY();
//        boolean isDataView = true; // me.getSource() != codeArea;
//        return isDataView ? me.getY() - view.getY() : me.getY();
    }
}

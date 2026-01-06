
package com.binfile.opener.viewer.reader.pdf.converter.utils

import android.view.KeyEvent

/**
 * Interface for code area data manipulation.
 */

interface CmdHandlerCodeArea {
    /**
     * Notifies command handler about end of sequence of appendable commands.
     */
    fun undoSequenceBreak()

    /**
     * Keyboard key was pressed.
     *
     * @param keyEvent key event
     */
    fun keyPressed(keyEvent: KeyEvent?)

    /**
     * Keyboard key was typed.
     *
     * @param keyCode key code
     * @param keyEvent key event
     */
    fun keyTyped(keyCode: Int, keyEvent: KeyEvent?)

    /**
     * Enter key was pressed.
     */
    fun enterPressed()

    /**
     * Backspace key was pressed.
     */
    fun backSpacePressed()

    /**
     * Delete key was pressed.
     */
    fun deletePressed()

    /**
     * Deletes selection.
     */
    fun delete()

    /**
     * Copies selection to clipboard.
     */
    fun copy()

    /**
     * Copies selection to clipboard as code string.
     */
    fun copyAsCode()

    /**
     * Cuts selection to clipboard.
     */
    fun cut()

    /**
     * Pastes content of clipboard to cursor area.
     */
    fun paste()

    /**
     * Expands selection to all data.
     */
    fun selectAll()

    /**
     * Clears data selection.
     */
    fun clearSelection()

    /**
     * Pastes content of clipboard to cursor area analyzing string code.
     */
    fun pasteFromCode()

    /**
     * Returns true if paste action is possible.
     *
     * @return true if paste is possible
     */
    fun canPaste(): Boolean

    /**
     * Move caret with mouse event.
     *
     * @param positionX relative position X
     * @param positionY relative position Y
     * @param selecting selection selecting
     */
    fun moveCaret(positionX: Int, positionY: Int, selecting: SelectingMode?)

    /**
     * Performs scrolling.
     *
     * @param scrollSize number of scroll units (positive or negative)
     * @param orientation scrollbar orientation
     */
    fun wheelScroll(scrollSize: Int, orientation: ScrollbarOrientation?)

    /**
     * Checks whether edit is allowed.
     *
     * @return true if allowed
     */
    fun checkEditAllowed(): Boolean
    enum class ScrollbarOrientation {
        HORIZONTAL, VERTICAL
    }

    enum class SelectingMode {
        NONE, SELECTING
    }

    
    interface CodeAreaCommandHandlerFactory {
        
        fun createCommandHandler(codeArea: CoreCodeArea?): CmdHandlerCodeArea?
    }
}

package com.binfile.opener.viewer.reader.pdf.converter.utils

import android.graphics.Canvas
import org.exbin.bined.CaretOverlapMode
import org.exbin.bined.CodeAreaCaretPosition
import org.exbin.bined.basic.*
import java.util.Optional

/**
 * Binary editor painter interface.
 */

interface CodeAreaPainter {
    /**
     * Returns true if painter was initialized.
     *
     * @return true if initialized
     */
    val initialized: Boolean

    /**
     * Attaches painter to code area.
     */
    fun attach()

    /**
     * Detaches painter to code area.
     */
    fun detach()

    /**
     * Paints the main component.
     *
     * @param g Canvas
     */
    fun paintComponent(g: Canvas?)

    /**
     * Paints main hexadecimal data section of the component.
     *
     * @param g Canvas
     */
    fun paintMainArea(g: Canvas?)

    /**
     * Paints cursor symbol.
     *
     * @param g Canvas
     */
    fun paintCursor(g: Canvas?)

    /**
     * Resets complete painter state for new painting.
     */
    fun reset()

    /**
     * Resets painter font state for new painting.
     */
    fun resetFont()

    /**
     * Rebuilds colors after UIManager change.
     */
    fun resetColors()

    /**
     * Resets painter layout state for new painting.
     */
    fun resetLayout()

    /**
     * Resets caret state.
     */
    fun resetCaret()

    /**
     * Calls rebuild of the colors profile.
     */
    fun rebuildColors()

    /**
     * Returns type of cursor for given painter relative position.
     *
     * @param positionX component relative position X
     * @param positionY component relative position Y
     * @return java.awt.Cursor cursor type value
     */
    fun getMouseCursorShape(positionX: Int, positionY: Int): Int

    /**
     * Returns zone type for given position.
     *
     * @param x x-coordinate
     * @param y y-coordinate
     * @return specific zone in component
     */
    
    fun getPositionZone(x: Int, y: Int): BasicCodeAreaZone?

    /**
     * Returns closest caret position for provided component relative mouse
     * position.
     *
     * @param positionX component relative position X
     * @param positionY component relative position Y
     * @param overflowMode overflow mode
     * @return closest caret position
     */
    
    fun mousePositionToClosestCaretPosition(
        positionX: Int,
        positionY: Int,
        overflowMode: CaretOverlapMode?
    ): CodeAreaCaretPosition?

    /**
     * Performs update of scrollbars after change in data size or position.
     */
    fun updateScrollBars()

    /**
     * Returns state of the visibility of given caret position within current
     * scrolling window.
     *
     * @param caretPosition caret position
     * @return visibility state
     */
    
    fun computePositionScrollVisibility(caretPosition: CodeAreaCaretPosition?): PositionScrollVisibility?

    /**
     * Returns scroll position so that provided caret position is visible in
     * scrolled area.
     *
     *
     * Performs minimal scrolling and tries to preserve current vertical /
     * horizontal scrolling if possible. If given position cannot be fully
     * shown, top left corner is preferred.
     *
     * @param caretPosition caret position
     * @return scroll position or null if caret position is already visible /
     * scrolled to the best fit
     */
    
    fun computeRevealScrollPosition(caretPosition: CodeAreaCaretPosition?): java.util.Optional<CodeAreaScrollPosition>?

    /**
     * Returns scroll position so that provided caret position is visible in the
     * center of the scrolled area.
     *
     *
     * Attempts to center as much as possible while preserving scrolling limits.
     *
     * @param caretPosition caret position
     * @return scroll position or null if desired scroll position is the same as
     * current scroll position.
     */
    
    fun computeCenterOnScrollPosition(caretPosition: CodeAreaCaretPosition?): Optional<CodeAreaScrollPosition>?

    /**
     * Computes position for movement action.
     *
     * @param position  source position
     * @param direction movement direction
     * @return target position
     */
    
    fun computeMovePosition(
        position: CodeAreaCaretPosition?,
        direction: MovementDirection?
    ): CodeAreaCaretPosition?

    /**
     * Computes scrolling position for given shift action.
     *
     * @param startPosition start position
     * @param direction     scrolling direction
     * @return target position
     */
    
    fun computeScrolling(
        startPosition: CodeAreaScrollPosition?,
        direction: ScrollingDirection?
    ): CodeAreaScrollPosition?

    /**
     * Notify scroll position was modified.
     *
     * This is to assist detection of scrolling from outside compare to
     * scrolling by scrollbar controls.
     */
    fun scrollPositionModified()

    /**
     * Notify scroll position was changed outside of scrolling.
     */
    fun scrollPositionChanged()
}
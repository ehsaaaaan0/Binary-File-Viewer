package com.binfile.opener.viewer.reader.pdf.converter.utils;

import java.lang.System;

/**
 * Binary editor painter interface.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001e\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001a\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0016H&J\b\u0010\u0017\u001a\u00020\u0007H&J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H&J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019H&J$\u0010 \u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"H&J\u0012\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%H&J\u0012\u0010&\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%H&J\u0012\u0010\'\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%H&J\b\u0010(\u001a\u00020\u0007H&J\b\u0010)\u001a\u00020\u0007H&J\b\u0010*\u001a\u00020\u0007H&J\b\u0010+\u001a\u00020\u0007H&J\b\u0010,\u001a\u00020\u0007H&J\b\u0010-\u001a\u00020\u0007H&J\b\u0010.\u001a\u00020\u0007H&J\b\u0010/\u001a\u00020\u0007H&J\b\u00100\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u00061"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CodeAreaPainter;", "", "initialized", "", "getInitialized", "()Z", "attach", "", "computeCenterOnScrollPosition", "Ljava/util/Optional;", "Lorg/exbin/bined/basic/CodeAreaScrollPosition;", "caretPosition", "Lorg/exbin/bined/CodeAreaCaretPosition;", "computeMovePosition", "position", "direction", "Lorg/exbin/bined/basic/MovementDirection;", "computePositionScrollVisibility", "Lorg/exbin/bined/basic/PositionScrollVisibility;", "computeRevealScrollPosition", "computeScrolling", "startPosition", "Lorg/exbin/bined/basic/ScrollingDirection;", "detach", "getMouseCursorShape", "", "positionX", "positionY", "getPositionZone", "Lorg/exbin/bined/basic/BasicCodeAreaZone;", "x", "y", "mousePositionToClosestCaretPosition", "overflowMode", "Lorg/exbin/bined/CaretOverlapMode;", "paintComponent", "g", "Landroid/graphics/Canvas;", "paintCursor", "paintMainArea", "rebuildColors", "reset", "resetCaret", "resetColors", "resetFont", "resetLayout", "scrollPositionChanged", "scrollPositionModified", "updateScrollBars", "Bin File Viewer - 1.0-1_debug"})
public abstract interface CodeAreaPainter {
    
    /**
     * Returns true if painter was initialized.
     *
     * @return true if initialized
     */
    public abstract boolean getInitialized();
    
    /**
     * Attaches painter to code area.
     */
    public abstract void attach();
    
    /**
     * Detaches painter to code area.
     */
    public abstract void detach();
    
    /**
     * Paints the main component.
     *
     * @param g Canvas
     */
    public abstract void paintComponent(@org.jetbrains.annotations.Nullable
    android.graphics.Canvas g);
    
    /**
     * Paints main hexadecimal data section of the component.
     *
     * @param g Canvas
     */
    public abstract void paintMainArea(@org.jetbrains.annotations.Nullable
    android.graphics.Canvas g);
    
    /**
     * Paints cursor symbol.
     *
     * @param g Canvas
     */
    public abstract void paintCursor(@org.jetbrains.annotations.Nullable
    android.graphics.Canvas g);
    
    /**
     * Resets complete painter state for new painting.
     */
    public abstract void reset();
    
    /**
     * Resets painter font state for new painting.
     */
    public abstract void resetFont();
    
    /**
     * Rebuilds colors after UIManager change.
     */
    public abstract void resetColors();
    
    /**
     * Resets painter layout state for new painting.
     */
    public abstract void resetLayout();
    
    /**
     * Resets caret state.
     */
    public abstract void resetCaret();
    
    /**
     * Calls rebuild of the colors profile.
     */
    public abstract void rebuildColors();
    
    /**
     * Returns type of cursor for given painter relative position.
     *
     * @param positionX component relative position X
     * @param positionY component relative position Y
     * @return java.awt.Cursor cursor type value
     */
    public abstract int getMouseCursorShape(int positionX, int positionY);
    
    /**
     * Returns zone type for given position.
     *
     * @param x x-coordinate
     * @param y y-coordinate
     * @return specific zone in component
     */
    @org.jetbrains.annotations.Nullable
    public abstract org.exbin.bined.basic.BasicCodeAreaZone getPositionZone(int x, int y);
    
    /**
     * Returns closest caret position for provided component relative mouse
     * position.
     *
     * @param positionX component relative position X
     * @param positionY component relative position Y
     * @param overflowMode overflow mode
     * @return closest caret position
     */
    @org.jetbrains.annotations.Nullable
    public abstract org.exbin.bined.CodeAreaCaretPosition mousePositionToClosestCaretPosition(int positionX, int positionY, @org.jetbrains.annotations.Nullable
    org.exbin.bined.CaretOverlapMode overflowMode);
    
    /**
     * Performs update of scrollbars after change in data size or position.
     */
    public abstract void updateScrollBars();
    
    /**
     * Returns state of the visibility of given caret position within current
     * scrolling window.
     *
     * @param caretPosition caret position
     * @return visibility state
     */
    @org.jetbrains.annotations.Nullable
    public abstract org.exbin.bined.basic.PositionScrollVisibility computePositionScrollVisibility(@org.jetbrains.annotations.Nullable
    org.exbin.bined.CodeAreaCaretPosition caretPosition);
    
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
    @org.jetbrains.annotations.Nullable
    public abstract java.util.Optional<org.exbin.bined.basic.CodeAreaScrollPosition> computeRevealScrollPosition(@org.jetbrains.annotations.Nullable
    org.exbin.bined.CodeAreaCaretPosition caretPosition);
    
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
    @org.jetbrains.annotations.Nullable
    public abstract java.util.Optional<org.exbin.bined.basic.CodeAreaScrollPosition> computeCenterOnScrollPosition(@org.jetbrains.annotations.Nullable
    org.exbin.bined.CodeAreaCaretPosition caretPosition);
    
    /**
     * Computes position for movement action.
     *
     * @param position  source position
     * @param direction movement direction
     * @return target position
     */
    @org.jetbrains.annotations.Nullable
    public abstract org.exbin.bined.CodeAreaCaretPosition computeMovePosition(@org.jetbrains.annotations.Nullable
    org.exbin.bined.CodeAreaCaretPosition position, @org.jetbrains.annotations.Nullable
    org.exbin.bined.basic.MovementDirection direction);
    
    /**
     * Computes scrolling position for given shift action.
     *
     * @param startPosition start position
     * @param direction     scrolling direction
     * @return target position
     */
    @org.jetbrains.annotations.Nullable
    public abstract org.exbin.bined.basic.CodeAreaScrollPosition computeScrolling(@org.jetbrains.annotations.Nullable
    org.exbin.bined.basic.CodeAreaScrollPosition startPosition, @org.jetbrains.annotations.Nullable
    org.exbin.bined.basic.ScrollingDirection direction);
    
    /**
     * Notify scroll position was modified.
     *
     * This is to assist detection of scrolling from outside compare to
     * scrolling by scrollbar controls.
     */
    public abstract void scrollPositionModified();
    
    /**
     * Notify scroll position was changed outside of scrolling.
     */
    public abstract void scrollPositionChanged();
}
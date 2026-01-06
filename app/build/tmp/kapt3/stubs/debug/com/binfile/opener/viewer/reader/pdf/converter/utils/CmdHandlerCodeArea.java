package com.binfile.opener.viewer.reader.pdf.converter.utils;

import java.lang.System;

/**
 * Interface for code area data manipulation.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003!\"#J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001a\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\"\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\u001a\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010 H&\u00a8\u0006$"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea;", "", "backSpacePressed", "", "canPaste", "", "checkEditAllowed", "clearSelection", "copy", "copyAsCode", "cut", "delete", "deletePressed", "enterPressed", "keyPressed", "keyEvent", "Landroid/view/KeyEvent;", "keyTyped", "keyCode", "", "moveCaret", "positionX", "positionY", "selecting", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea$SelectingMode;", "paste", "pasteFromCode", "selectAll", "undoSequenceBreak", "wheelScroll", "scrollSize", "orientation", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea$ScrollbarOrientation;", "CodeAreaCommandHandlerFactory", "ScrollbarOrientation", "SelectingMode", "Bin File Viewer - 1.0-1_debug"})
public abstract interface CmdHandlerCodeArea {
    
    /**
     * Notifies command handler about end of sequence of appendable commands.
     */
    public abstract void undoSequenceBreak();
    
    /**
     * Keyboard key was pressed.
     *
     * @param keyEvent key event
     */
    public abstract void keyPressed(@org.jetbrains.annotations.Nullable
    android.view.KeyEvent keyEvent);
    
    /**
     * Keyboard key was typed.
     *
     * @param keyCode key code
     * @param keyEvent key event
     */
    public abstract void keyTyped(int keyCode, @org.jetbrains.annotations.Nullable
    android.view.KeyEvent keyEvent);
    
    /**
     * Enter key was pressed.
     */
    public abstract void enterPressed();
    
    /**
     * Backspace key was pressed.
     */
    public abstract void backSpacePressed();
    
    /**
     * Delete key was pressed.
     */
    public abstract void deletePressed();
    
    /**
     * Deletes selection.
     */
    public abstract void delete();
    
    /**
     * Copies selection to clipboard.
     */
    public abstract void copy();
    
    /**
     * Copies selection to clipboard as code string.
     */
    public abstract void copyAsCode();
    
    /**
     * Cuts selection to clipboard.
     */
    public abstract void cut();
    
    /**
     * Pastes content of clipboard to cursor area.
     */
    public abstract void paste();
    
    /**
     * Expands selection to all data.
     */
    public abstract void selectAll();
    
    /**
     * Clears data selection.
     */
    public abstract void clearSelection();
    
    /**
     * Pastes content of clipboard to cursor area analyzing string code.
     */
    public abstract void pasteFromCode();
    
    /**
     * Returns true if paste action is possible.
     *
     * @return true if paste is possible
     */
    public abstract boolean canPaste();
    
    /**
     * Move caret with mouse event.
     *
     * @param positionX relative position X
     * @param positionY relative position Y
     * @param selecting selection selecting
     */
    public abstract void moveCaret(int positionX, int positionY, @org.jetbrains.annotations.Nullable
    com.binfile.opener.viewer.reader.pdf.converter.utils.CmdHandlerCodeArea.SelectingMode selecting);
    
    /**
     * Performs scrolling.
     *
     * @param scrollSize number of scroll units (positive or negative)
     * @param orientation scrollbar orientation
     */
    public abstract void wheelScroll(int scrollSize, @org.jetbrains.annotations.Nullable
    com.binfile.opener.viewer.reader.pdf.converter.utils.CmdHandlerCodeArea.ScrollbarOrientation orientation);
    
    /**
     * Checks whether edit is allowed.
     *
     * @return true if allowed
     */
    public abstract boolean checkEditAllowed();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea$ScrollbarOrientation;", "", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "Bin File Viewer - 1.0-1_debug"})
    public static enum ScrollbarOrientation {
        /*public static final*/ HORIZONTAL /* = new HORIZONTAL() */,
        /*public static final*/ VERTICAL /* = new VERTICAL() */;
        
        ScrollbarOrientation() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea$SelectingMode;", "", "(Ljava/lang/String;I)V", "NONE", "SELECTING", "Bin File Viewer - 1.0-1_debug"})
    public static enum SelectingMode {
        /*public static final*/ NONE /* = new NONE() */,
        /*public static final*/ SELECTING /* = new SELECTING() */;
        
        SelectingMode() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea$CodeAreaCommandHandlerFactory;", "", "createCommandHandler", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea;", "codeArea", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CoreCodeArea;", "Bin File Viewer - 1.0-1_debug"})
    public static abstract interface CodeAreaCommandHandlerFactory {
        
        @org.jetbrains.annotations.Nullable
        public abstract com.binfile.opener.viewer.reader.pdf.converter.utils.CmdHandlerCodeArea createCommandHandler(@org.jetbrains.annotations.Nullable
        com.binfile.opener.viewer.reader.pdf.converter.utils.CoreCodeArea codeArea);
    }
}
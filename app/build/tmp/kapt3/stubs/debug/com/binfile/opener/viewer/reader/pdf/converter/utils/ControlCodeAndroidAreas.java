package com.binfile.opener.viewer.reader.pdf.converter.utils;

import java.lang.System;

/**
 * Code area swing control.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/ControlCodeAndroidAreas;", "", "paintComponent", "", "g", "Landroid/graphics/Canvas;", "reset", "resetColors", "updateLayout", "Bin File Viewer - 1.0-1_debug"})
public abstract interface ControlCodeAndroidAreas {
    
    /**
     * Paints the main component.
     */
    public abstract void paintComponent(@org.jetbrains.annotations.Nullable
    android.graphics.Canvas g);
    
    /**
     * Rebuilds colors after UIManager change.
     */
    public abstract void resetColors();
    
    /**
     * Resets painter state for new painting.
     */
    public abstract void reset();
    
    /**
     * Requests update of the component layout.
     *
     * Notifies code area, that change of parameters will affect layout and it
     * should be recomputed and updated if necessary.
     */
    public abstract void updateLayout();
}
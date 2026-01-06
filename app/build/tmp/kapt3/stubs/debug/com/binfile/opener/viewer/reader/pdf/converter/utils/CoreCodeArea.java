package com.binfile.opener.viewer.reader.pdf.converter.utils;

import java.lang.System;

/**
 * Hexadecimal viewer/editor component.
 */
@androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.N)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001>B\'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\u0006\u0010 \u001a\u00020\u001aJ\b\u0010!\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020\u001aH\u0016J\n\u0010#\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010\'\u001a\u00020\u001aH\u0002J\u0006\u0010(\u001a\u00020\u001aJ0\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020,H\u0014J\u0010\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u000202H\u0016J\u0012\u00103\u001a\u00020\u001a2\b\u00104\u001a\u0004\u0018\u000105H&J\b\u00106\u001a\u00020\u001aH\u0016J\u0006\u00107\u001a\u00020\u001aJ\u000e\u00108\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014J\b\u00109\u001a\u00020\u001aH\u0016J\b\u0010:\u001a\u00020\u001aH&J\b\u0010;\u001a\u00020\u001aH\u0016J\u0010\u0010<\u001a\u00020\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010=\u001a\u00020\u001aH&R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\u00060\u0016R\u00020\u0000X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006?"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CoreCodeArea;", "Landroid/view/ViewGroup;", "Lorg/exbin/bined/CodeAreaControl;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "commandHandlerFactory", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea$CodeAreaCommandHandlerFactory;", "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea$CodeAreaCommandHandlerFactory;)V", "commandHandler", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea;", "getCommandHandler", "()Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea;", "setCommandHandler", "(Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea;)V", "contentData", "Lorg/exbin/auxiliary/paged_data/BinaryData;", "dataChangedListeners", "", "Lorg/exbin/bined/DataChangedListener;", "primaryView", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CoreCodeArea$PrimaryView;", "getPrimaryView", "()Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CoreCodeArea$PrimaryView;", "addDataChangedListener", "", "dataChangedListener", "canPaste", "", "clearSelection", "copy", "copyAsCode", "cut", "delete", "getContentData", "getDataSize", "", "hasSelection", "init", "notifyDataChanged", "onLayout", "changed", "left", "", "top", "right", "bottom", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "paintView", "g", "Landroid/graphics/Canvas;", "paste", "pasteFromCode", "removeDataChangedListener", "repaint", "resetPainter", "selectAll", "setContentData", "updateLayout", "PrimaryView", "Bin File Viewer - 1.0-1_debug"})
public abstract class CoreCodeArea extends android.view.ViewGroup implements org.exbin.bined.CodeAreaControl {
    private org.exbin.auxiliary.paged_data.BinaryData contentData;
    @org.jetbrains.annotations.NotNull
    private final com.binfile.opener.viewer.reader.pdf.converter.utils.CoreCodeArea.PrimaryView primaryView = null;
    @org.jetbrains.annotations.NotNull
    private com.binfile.opener.viewer.reader.pdf.converter.utils.CmdHandlerCodeArea commandHandler;
    private final java.util.List<org.exbin.bined.DataChangedListener> dataChangedListeners = null;
    
    @kotlin.jvm.JvmOverloads
    public CoreCodeArea(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public CoreCodeArea(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @org.jetbrains.annotations.Nullable
    com.binfile.opener.viewer.reader.pdf.converter.utils.CmdHandlerCodeArea.CodeAreaCommandHandlerFactory commandHandlerFactory) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.binfile.opener.viewer.reader.pdf.converter.utils.CoreCodeArea.PrimaryView getPrimaryView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.binfile.opener.viewer.reader.pdf.converter.utils.CmdHandlerCodeArea getCommandHandler() {
        return null;
    }
    
    public final void setCommandHandler(@org.jetbrains.annotations.NotNull
    com.binfile.opener.viewer.reader.pdf.converter.utils.CmdHandlerCodeArea p0) {
    }
    
    private final void init() {
    }
    
    @java.lang.Override
    public void copy() {
    }
    
    public final void copyAsCode() {
    }
    
    @java.lang.Override
    public void cut() {
    }
    
    @java.lang.Override
    public void paste() {
    }
    
    public final void pasteFromCode() {
    }
    
    @java.lang.Override
    public void delete() {
    }
    
    @java.lang.Override
    public void selectAll() {
    }
    
    @java.lang.Override
    public void clearSelection() {
    }
    
    @java.lang.Override
    public boolean canPaste() {
        return false;
    }
    
    @java.lang.Override
    public boolean hasSelection() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public org.exbin.auxiliary.paged_data.BinaryData getContentData() {
        return null;
    }
    
    public final void setContentData(@org.jetbrains.annotations.Nullable
    org.exbin.auxiliary.paged_data.BinaryData contentData) {
    }
    
    @java.lang.Override
    public long getDataSize() {
        return 0L;
    }
    
    /**
     * Notifies component, that internal data was changed.
     */
    public final void notifyDataChanged() {
    }
    
    public final void addDataChangedListener(@org.jetbrains.annotations.NotNull
    org.exbin.bined.DataChangedListener dataChangedListener) {
    }
    
    public final void removeDataChangedListener(@org.jetbrains.annotations.NotNull
    org.exbin.bined.DataChangedListener dataChangedListener) {
    }
    
    public void repaint() {
    }
    
    @java.lang.Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent event) {
        return false;
    }
    
    public abstract void resetPainter();
    
    public abstract void updateLayout();
    
    public abstract void paintView(@org.jetbrains.annotations.Nullable
    android.graphics.Canvas g);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\"\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0014J(\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0014J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u000fH\u0016\u00a8\u0006%"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CoreCodeArea$PrimaryView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "commandHandlerFactory", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea$CodeAreaCommandHandlerFactory;", "(Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CoreCodeArea;Landroid/content/Context;Landroid/util/AttributeSet;Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea$CodeAreaCommandHandlerFactory;)V", "onDraw", "", "g", "Landroid/graphics/Canvas;", "onFocusChanged", "gainFocus", "", "direction", "", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onKeyDown", "keyCode", "keyEvent", "Landroid/view/KeyEvent;", "onKeyUp", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "width", "height", "oldWidth", "oldHeight", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "performClick", "Bin File Viewer - 1.0-1_debug"})
    public final class PrimaryView extends android.view.View {
        
        @kotlin.jvm.JvmOverloads
        public PrimaryView(@org.jetbrains.annotations.Nullable
        android.content.Context context, @org.jetbrains.annotations.Nullable
        android.util.AttributeSet attrs) {
            super(null);
        }
        
        @kotlin.jvm.JvmOverloads
        public PrimaryView(@org.jetbrains.annotations.Nullable
        android.content.Context context, @org.jetbrains.annotations.Nullable
        android.util.AttributeSet attrs, @org.jetbrains.annotations.Nullable
        com.binfile.opener.viewer.reader.pdf.converter.utils.CmdHandlerCodeArea.CodeAreaCommandHandlerFactory commandHandlerFactory) {
            super(null);
        }
        
        @java.lang.Override
        protected void onDraw(@org.jetbrains.annotations.NotNull
        android.graphics.Canvas g) {
        }
        
        @java.lang.Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        }
        
        @java.lang.Override
        protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        }
        
        @java.lang.Override
        public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull
        android.view.KeyEvent keyEvent) {
            return false;
        }
        
        @java.lang.Override
        public boolean onKeyUp(int keyCode, @org.jetbrains.annotations.NotNull
        android.view.KeyEvent keyEvent) {
            return false;
        }
        
        @java.lang.Override
        protected void onFocusChanged(boolean gainFocus, int direction, @org.jetbrains.annotations.Nullable
        android.graphics.Rect previouslyFocusedRect) {
        }
        
        @java.lang.Override
        public boolean onTouchEvent(@org.jetbrains.annotations.NotNull
        android.view.MotionEvent event) {
            return false;
        }
        
        @java.lang.Override
        public boolean performClick() {
            return false;
        }
    }
}
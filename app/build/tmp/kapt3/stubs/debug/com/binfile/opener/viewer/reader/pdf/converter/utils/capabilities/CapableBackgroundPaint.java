package com.binfile.opener.viewer.reader.pdf.converter.utils.capabilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/capabilities/CapableBackgroundPaint;", "", "backgroundPaintMode", "Lorg/exbin/bined/basic/BasicBackgroundPaintMode;", "getBackgroundPaintMode", "()Lorg/exbin/bined/basic/BasicBackgroundPaintMode;", "setBackgroundPaintMode", "(Lorg/exbin/bined/basic/BasicBackgroundPaintMode;)V", "Bin File Viewer - 1.0-1_debug"})
public abstract interface CapableBackgroundPaint {
    
    @org.jetbrains.annotations.Nullable
    public abstract org.exbin.bined.basic.BasicBackgroundPaintMode getBackgroundPaintMode();
    
    public abstract void setBackgroundPaintMode(@org.jetbrains.annotations.Nullable
    org.exbin.bined.basic.BasicBackgroundPaintMode p0);
}
package com.binfile.opener.viewer.reader.pdf.converter.model;

import java.lang.System;

@androidx.room.Entity
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/model/AdapterModelClass;", "", "mId", "", "myPath", "", "fileName", "fileSize", "", "mDate", "mboolean", "", "(ILjava/lang/String;Ljava/lang/String;JJZ)V", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getFileSize", "()J", "setFileSize", "(J)V", "getMDate", "setMDate", "getMId", "()I", "setMId", "(I)V", "getMboolean", "()Z", "setMboolean", "(Z)V", "getMyPath", "setMyPath", "Bin File Viewer - 1.0-1_debug"})
public final class AdapterModelClass {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int mId;
    @org.jetbrains.annotations.NotNull
    private java.lang.String myPath;
    @org.jetbrains.annotations.NotNull
    private java.lang.String fileName;
    private long fileSize;
    private long mDate;
    private boolean mboolean;
    
    public AdapterModelClass(int mId, @org.jetbrains.annotations.NotNull
    java.lang.String myPath, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, long fileSize, long mDate, boolean mboolean) {
        super();
    }
    
    public final int getMId() {
        return 0;
    }
    
    public final void setMId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMyPath() {
        return null;
    }
    
    public final void setMyPath(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFileName() {
        return null;
    }
    
    public final void setFileName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final long getFileSize() {
        return 0L;
    }
    
    public final void setFileSize(long p0) {
    }
    
    public final long getMDate() {
        return 0L;
    }
    
    public final void setMDate(long p0) {
    }
    
    public final boolean getMboolean() {
        return false;
    }
    
    public final void setMboolean(boolean p0) {
    }
}
package com.binfile.opener.viewer.reader.pdf.converter.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/UtilFiles;", "", "()V", "Companion", "Bin File Viewer - 1.0-1_debug"})
public final class UtilFiles {
    @org.jetbrains.annotations.NotNull
    public static final com.binfile.opener.viewer.reader.pdf.converter.utils.UtilFiles.Companion Companion = null;
    private static final int EOF = -1;
    private static final int BUFFER_SIZE = 4096;
    
    public UtilFiles() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013J\u001d\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/UtilFiles$Companion;", "", "()V", "BUFFER_SIZE", "", "EOF", "copy", "", "input", "Ljava/io/InputStream;", "output", "Ljava/io/OutputStream;", "from", "Ljava/io/File;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getFileName", "", "rename", "file", "newName", "splitFileName", "", "fileName", "(Ljava/lang/String;)[Ljava/lang/String;", "Bin File Viewer - 1.0-1_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        public final java.io.File from(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        android.net.Uri uri) throws java.io.IOException {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String[] splitFileName(@org.jetbrains.annotations.Nullable
        java.lang.String fileName) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getFileName(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        android.net.Uri uri) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.io.File rename(@org.jetbrains.annotations.NotNull
        java.io.File file, @org.jetbrains.annotations.Nullable
        java.lang.String newName) {
            return null;
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        public final long copy(@org.jetbrains.annotations.NotNull
        java.io.InputStream input, @org.jetbrains.annotations.Nullable
        java.io.OutputStream output) throws java.io.IOException {
            return 0L;
        }
    }
}
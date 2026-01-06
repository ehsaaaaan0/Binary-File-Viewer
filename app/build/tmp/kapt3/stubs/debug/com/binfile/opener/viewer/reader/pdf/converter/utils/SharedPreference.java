package com.binfile.opener.viewer.reader.pdf.converter.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0017\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u0013J\u0018\u0010\u0019\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u0015J\u001a\u0010\u001a\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/SharedPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "MY_PREF", "", "editor", "Landroid/content/SharedPreferences$Editor;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "clear", "", "key", "getBool", "", "getInt", "", "getString", "putBool", "value", "putInt", "putString", "Bin File Viewer - 1.0-1_debug"})
public final class SharedPreference {
    private final java.lang.String MY_PREF = "MyPreferences";
    @org.jetbrains.annotations.NotNull
    private android.content.SharedPreferences sharedPreferences;
    private android.content.SharedPreferences.Editor editor;
    
    public SharedPreference(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences p0) {
    }
    
    public final void putString(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getString(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return null;
    }
    
    public final void putBool(@org.jetbrains.annotations.Nullable
    java.lang.String key, boolean value) {
    }
    
    public final boolean getBool(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return false;
    }
    
    public final void putInt(@org.jetbrains.annotations.Nullable
    java.lang.String key, int value) {
    }
    
    public final int getInt(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return 0;
    }
    
    public final void clear(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
    }
    
    public final void clear() {
    }
}
package com.binfile.opener.viewer.reader.pdf.converter.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J+\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\'\u001a\u00020(H\u0017\u00a2\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u001eH\u0002J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006."}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/activities/PP;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/binfile/opener/viewer/reader/pdf/converter/databinding/ActivityPPBinding;", "getBinding", "()Lcom/binfile/opener/viewer/reader/pdf/converter/databinding/ActivityPPBinding;", "setBinding", "(Lcom/binfile/opener/viewer/reader/pdf/converter/databinding/ActivityPPBinding;)V", "pos", "", "getPos", "()Ljava/lang/Boolean;", "setPos", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "resultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "getResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "setSharedPref", "(Landroid/content/SharedPreferences;)V", "checkPermission", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestPermission", "showMessageOKCancel", "onClickListener", "Landroid/content/DialogInterface$OnClickListener;", "Bin File Viewer - 1.0-1_debug"})
public final class PP extends androidx.appcompat.app.AppCompatActivity {
    public com.binfile.opener.viewer.reader.pdf.converter.databinding.ActivityPPBinding binding;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean pos;
    public android.content.SharedPreferences sharedPref;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncher = null;
    
    public PP() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.binfile.opener.viewer.reader.pdf.converter.databinding.ActivityPPBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.binfile.opener.viewer.reader.pdf.converter.databinding.ActivityPPBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getPos() {
        return null;
    }
    
    public final void setPos(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getSharedPref() {
        return null;
    }
    
    public final void setSharedPref(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getResultLauncher() {
        return null;
    }
    
    private final boolean checkPermission() {
        return false;
    }
    
    private final void requestPermission() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    private final void showMessageOKCancel(android.content.DialogInterface.OnClickListener onClickListener) {
    }
}
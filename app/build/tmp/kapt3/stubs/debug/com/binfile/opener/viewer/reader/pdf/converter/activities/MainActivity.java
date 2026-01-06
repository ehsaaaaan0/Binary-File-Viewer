package com.binfile.opener.viewer.reader.pdf.converter.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\u0006\u0010\u0017\u001a\u00020\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\"\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010 \u001a\u00020\u0014H\u0016J\u0012\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0016J-\u0010\'\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0)2\u0006\u0010*\u001a\u00020+H\u0016\u00a2\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u0014H\u0002J\b\u0010.\u001a\u00020\u0014H\u0002J\b\u0010/\u001a\u00020\u0014H\u0002J\b\u00100\u001a\u00020\u0014H\u0002J\u0010\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u000203H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u00064"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "()V", "binding", "Lcom/binfile/opener/viewer/reader/pdf/converter/databinding/ActivityMainBinding;", "getBinding", "()Lcom/binfile/opener/viewer/reader/pdf/converter/databinding/ActivityMainBinding;", "setBinding", "(Lcom/binfile/opener/viewer/reader/pdf/converter/databinding/ActivityMainBinding;)V", "fileResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "fileType", "", "getFileType", "()Ljava/lang/String;", "setFileType", "(Ljava/lang/String;)V", "browseForFile", "", "callFileIntent", "feedback", "fileintent", "mcheckPermission", "", "moreApps", "onActivityResult", "requestCode", "", "resultCode", "data", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "privacyPolicy", "rateUs", "requestPermission", "shareApp", "showDialogCancelMessage", "onClickListener", "Landroid/content/DialogInterface$OnClickListener;", "Bin File Viewer - 1.0-1_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener {
    public com.binfile.opener.viewer.reader.pdf.converter.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.NotNull
    private java.lang.String fileType = "";
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> fileResultLauncher;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.binfile.opener.viewer.reader.pdf.converter.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.binfile.opener.viewer.reader.pdf.converter.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFileType() {
        return null;
    }
    
    public final void setFileType(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean mcheckPermission() {
        return false;
    }
    
    private final void requestPermission() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    private final void showDialogCancelMessage(android.content.DialogInterface.OnClickListener onClickListener) {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    public final void fileintent() {
    }
    
    @java.lang.Override
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    public final void browseForFile() {
    }
    
    public final void callFileIntent() {
    }
    
    private final void privacyPolicy() {
    }
    
    private final void shareApp() {
    }
    
    private final void feedback() {
    }
    
    private final void rateUs() {
    }
    
    private final void moreApps() {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
}
package com.binfile.opener.viewer.reader.pdf.converter.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001,B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001fH\u0016J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u001fH\u0016J\u0016\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0004\u001a\u00020\u0005R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006-"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/adapter/MainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/Filterable;", "context", "Landroid/content/Context;", "arrayListApp", "Ljava/util/ArrayList;", "Lcom/binfile/opener/viewer/reader/pdf/converter/model/AdapterModelClass;", "type", "", "(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)V", "appListArraySelected", "getAppListArraySelected", "()Ljava/util/ArrayList;", "setAppListArraySelected", "(Ljava/util/ArrayList;)V", "getArrayListApp", "setArrayListApp", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "searchFilter", "Landroid/widget/Filter;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getFilter", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "share", "file", "Ljava/io/File;", "MyViewHolder2", "Bin File Viewer - 1.0-1_debug"})
public final class MainAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> implements android.widget.Filterable {
    @org.jetbrains.annotations.NotNull
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass> arrayListApp;
    @org.jetbrains.annotations.NotNull
    private java.lang.String type;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass> appListArraySelected;
    private final android.widget.Filter searchFilter = null;
    
    public MainAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass> arrayListApp, @org.jetbrains.annotations.NotNull
    java.lang.String type) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass> getArrayListApp() {
        return null;
    }
    
    public final void setArrayListApp(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass> getAppListArraySelected() {
        return null;
    }
    
    public final void setAppListArraySelected(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.widget.Filter getFilter() {
        return null;
    }
    
    public final void share(@org.jetbrains.annotations.NotNull
    java.io.File file, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/adapter/MainAdapter$MyViewHolder2;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "file_name2", "Landroid/widget/TextView;", "getFile_name2", "()Landroid/widget/TextView;", "icon2", "Landroid/widget/ImageView;", "getIcon2", "()Landroid/widget/ImageView;", "setIcon2", "(Landroid/widget/ImageView;)V", "mdate", "getMdate", "menu", "getMenu", "setMenu", "msize", "getMsize", "Bin File Viewer - 1.0-1_debug"})
    public static final class MyViewHolder2 extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView file_name2 = null;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView icon2;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView mdate = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView msize = null;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView menu;
        
        public MyViewHolder2(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getFile_name2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getIcon2() {
            return null;
        }
        
        public final void setIcon2(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getMdate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getMsize() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getMenu() {
            return null;
        }
        
        public final void setMenu(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
    }
}
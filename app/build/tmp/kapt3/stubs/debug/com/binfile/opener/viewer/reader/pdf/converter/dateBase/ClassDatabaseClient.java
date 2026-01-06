package com.binfile.opener.viewer.reader.pdf.converter.dateBase;

import java.lang.System;

@androidx.room.Database(entities = {com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/dateBase/ClassDatabaseClient;", "Landroidx/room/RoomDatabase;", "()V", "getDBDao", "Lcom/binfile/opener/viewer/reader/pdf/converter/dateBase/DBDao;", "Companion", "Bin File Viewer - 1.0-1_debug"})
public abstract class ClassDatabaseClient extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.binfile.opener.viewer.reader.pdf.converter.dateBase.ClassDatabaseClient.Companion Companion = null;
    @org.jetbrains.annotations.Nullable
    private static com.binfile.opener.viewer.reader.pdf.converter.dateBase.ClassDatabaseClient mInstance;
    
    public ClassDatabaseClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.binfile.opener.viewer.reader.pdf.converter.dateBase.DBDao getDBDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/dateBase/ClassDatabaseClient$Companion;", "", "()V", "mInstance", "Lcom/binfile/opener/viewer/reader/pdf/converter/dateBase/ClassDatabaseClient;", "getMInstance", "()Lcom/binfile/opener/viewer/reader/pdf/converter/dateBase/ClassDatabaseClient;", "setMInstance", "(Lcom/binfile/opener/viewer/reader/pdf/converter/dateBase/ClassDatabaseClient;)V", "databaseClient", "mCtx", "Landroid/content/Context;", "Bin File Viewer - 1.0-1_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.binfile.opener.viewer.reader.pdf.converter.dateBase.ClassDatabaseClient getMInstance() {
            return null;
        }
        
        public final void setMInstance(@org.jetbrains.annotations.Nullable
        com.binfile.opener.viewer.reader.pdf.converter.dateBase.ClassDatabaseClient p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.binfile.opener.viewer.reader.pdf.converter.dateBase.ClassDatabaseClient databaseClient(@org.jetbrains.annotations.NotNull
        android.content.Context mCtx) {
            return null;
        }
    }
}
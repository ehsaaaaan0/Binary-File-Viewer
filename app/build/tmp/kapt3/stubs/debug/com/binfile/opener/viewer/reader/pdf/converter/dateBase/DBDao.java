package com.binfile.opener.viewer.reader.pdf.converter.dateBase;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\'J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\'J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\'J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/dateBase/DBDao;", "", "all", "", "Lcom/binfile/opener/viewer/reader/pdf/converter/model/AdapterModelClass;", "getAll", "()Ljava/util/List;", "deleteByUserId", "", "userId", "", "insert", "quizAdapterModelClass", "insertIgnore", "AdapterModelClass", "insertReplace", "update", "Bin File Viewer - 1.0-1_debug"})
public abstract interface DBDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM AdapterModelClass")
    public abstract java.util.List<com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass> getAll();
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass quizAdapterModelClass);
    
    @androidx.room.Query(value = "DELETE FROM AdapterModelClass WHERE mId = :userId")
    public abstract void deleteByUserId(int userId);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertReplace(@org.jetbrains.annotations.NotNull
    com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass AdapterModelClass);
    
    @androidx.room.Insert(onConflict = 5)
    public abstract void insertIgnore(@org.jetbrains.annotations.NotNull
    com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass AdapterModelClass);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass quizAdapterModelClass);
}
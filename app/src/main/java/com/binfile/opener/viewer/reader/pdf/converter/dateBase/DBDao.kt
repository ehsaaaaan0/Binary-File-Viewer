package com.binfile.opener.viewer.reader.pdf.converter.dateBase

import androidx.room.*
import com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass


@Dao
interface DBDao {
    @get:Query("SELECT * FROM AdapterModelClass")
    val all: List<AdapterModelClass>


    @Insert
    fun insert(quizAdapterModelClass: AdapterModelClass)


    @Query("DELETE FROM AdapterModelClass WHERE mId = :userId")
    fun deleteByUserId(userId: Int)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertReplace(AdapterModelClass: AdapterModelClass)
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertIgnore(AdapterModelClass: AdapterModelClass)
    @Update
    fun update(quizAdapterModelClass: AdapterModelClass)
}

package com.binfile.opener.viewer.reader.pdf.converter.dateBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass

@Database(entities = [AdapterModelClass::class], version = 1)
abstract class ClassDatabaseClient : RoomDatabase() {
    abstract fun getDBDao(): DBDao
    companion object {
        var mInstance: ClassDatabaseClient? = null

        fun databaseClient(mCtx: Context): ClassDatabaseClient? {
            mInstance = Room.databaseBuilder(
                mCtx.applicationContext,
                ClassDatabaseClient::class.java,
                "BinDB"
            ).allowMainThreadQueries().build()
            return mInstance
        }
    }
}
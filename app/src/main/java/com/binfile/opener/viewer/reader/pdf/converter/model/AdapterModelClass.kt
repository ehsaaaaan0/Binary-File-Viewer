package com.binfile.opener.viewer.reader.pdf.converter.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class AdapterModelClass(@PrimaryKey(autoGenerate = true)var mId:Int, var myPath: String, var fileName: String, var fileSize: Long, var mDate: Long, var mboolean: Boolean) {

}
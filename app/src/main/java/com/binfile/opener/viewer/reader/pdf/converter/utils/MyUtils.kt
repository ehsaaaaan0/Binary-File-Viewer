package com.binfile.opener.viewer.reader.pdf.converter.utils

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.binfile.opener.viewer.reader.pdf.converter.dateBase.ClassDatabaseClient
import com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass
import java.io.File
import java.text.DecimalFormat
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class MyUtils {
    companion object {

        fun updateToShPr(context: Context, path: String, boolean: Boolean) {
            val file = File(path)
            val mDao = ClassDatabaseClient.databaseClient(context.applicationContext)!!.getDBDao()
            val executor: Executor = Executors.newSingleThreadExecutor()

            val handler = Handler(Looper.getMainLooper())
            executor.execute {
                for (item in mDao.all) {
                    if (item.myPath == path && item.mboolean == boolean) {
                        mDao.deleteByUserId(item.mId)
                    }
                }
                handler.post {
                    mDao.insertIgnore(
                        AdapterModelClass(
                            0,
                            file.absolutePath,
                            file.name,
                            file.length(),
                            file.lastModified(),
                            boolean
                        )
                    )
                }

            }


        }

        fun deleteFromRecent(position: Int, context: Context) {
            val mDao = ClassDatabaseClient.databaseClient(context.applicationContext)!!.getDBDao()
            mDao.deleteByUserId(position)
        }

        fun listrecvent(context: Context, type: String): ArrayList<AdapterModelClass> {
            val mDao = ClassDatabaseClient.databaseClient(context.applicationContext)!!.getDBDao()
            val RecentArray: ArrayList<AdapterModelClass> = ArrayList()
            val RecentArray2: ArrayList<AdapterModelClass> = ArrayList()
            val mList = mDao.all
            if (mList.isNotEmpty()) {
                for (element in mList) {
                    val file2 = File(element.myPath)
                    if (file2.exists()) {
                        val path = file2.absolutePath
                        val name = file2.name
                        val size = file2.length()
                        val date = file2.lastModified()
                        val mymodel =
                            AdapterModelClass(element.mId, path, name, size, date, element.mboolean)
                        RecentArray.add(mymodel)
                    }
                }
            }

            RecentArray.reverse()

            return if (type == "yes") {
                for (i in 0 until RecentArray.size) {
                    if (i < 4) {
                        RecentArray2.add(RecentArray[i])
                    }
                }
                RecentArray2
            } else {
                RecentArray
            }
        }

        fun getStringSizeLengthFile(size: Long): String {
            val df = DecimalFormat("0.00")
            val sizeKb = 1024.0f
            val sizeMb = sizeKb * sizeKb
            val sizeGb = sizeMb * sizeKb
            val sizeTerra = sizeGb * sizeKb
            if (size < sizeMb) return df.format((size / sizeKb).toDouble()) + " Kb" else if (size < sizeGb) return df.format(
                (size / sizeMb).toDouble()
            ) + " Mb" else if (size < sizeTerra) return df.format((size / sizeGb).toDouble()) + " Gb"
            return ""
        }

        fun listconvert(context: Context, type: String): ArrayList<AdapterModelClass> {

            val convertedPdfArray: ArrayList<AdapterModelClass> = ArrayList()
            val convertedPdfArray2: ArrayList<AdapterModelClass> = ArrayList()
            val directoryName = context.getExternalFilesDir("/bintopdf")!!.absolutePath
            val directory = File(directoryName)
            val files = directory.listFiles()
            if (files != null) {
                Log.d("Files", "Size: " + files.size)
                for (i in files.indices) {
                    val path = files[i].absolutePath
                    val name = files[i].name
                    val size = files[i].length()
                    val date = files[i].lastModified()
                    val Files = AdapterModelClass(
                        0,
                        path,
                        name, size,
                        date, false
                    )
                    convertedPdfArray.add(Files)

                }
            }
            convertedPdfArray.reverse()

            return if (type == "yes") {
                for (i in 0 until convertedPdfArray.size) {
                    if (i < 4) {
                        convertedPdfArray2.add(convertedPdfArray[i])
                    }
                }
                convertedPdfArray2
            } else {
                convertedPdfArray
            }

        }
    }
}
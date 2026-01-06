package com.binfile.opener.viewer.reader.pdf.converter.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import com.binfile.opener.viewer.reader.pdf.converter.adapter.MainAdapter
import com.binfile.opener.viewer.reader.pdf.converter.adapter.ConvertedFilesAdapter
import com.binfile.opener.viewer.reader.pdf.converter.databinding.ActivityListFileBinding
import com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass
import com.binfile.opener.viewer.reader.pdf.converter.utils.MyUtils
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class ListFile : AppCompatActivity() {
    lateinit var binding: ActivityListFileBinding
    var type: String = ""
    var globelIntent: Intent? = null
    private var retryAttempt = 0
    val executor: Executor = Executors.newSingleThreadExecutor()
    val handler = Handler(Looper.getMainLooper())
    lateinit var myArray: ArrayList<AdapterModelClass>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListFileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        if (extras == null) {
            type = ""
        } else {
            type = intent!!.extras!!.getString("fileType", "")
        }
        binding.backIv.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        binding.filerv.layoutManager = LinearLayoutManager(
            this@ListFile,
            LinearLayoutManager.VERTICAL,
            false
        )
        myArray = ArrayList()
        if (type == "recent") {
            binding.toolbartext.text = "Recent Files"
            executor.execute {
                myArray = MyUtils.listrecvent(this@ListFile, "")

                handler.post {
                    val recentadapter = MainAdapter(this@ListFile, myArray, "2")
                    binding.filerv.adapter = recentadapter

                    if (myArray.size == 0) {
                        binding.nofile.visibility = View.VISIBLE
                    }
                }
            }

        } else if (type == "convert") {
            binding.toolbartext.text = "Converted Files"
            executor.execute {
                myArray = MyUtils.listconvert(this@ListFile, "")
                handler.post {
                    val convertadapter = ConvertedFilesAdapter(this@ListFile, myArray, "2")
                    binding.filerv.adapter = convertadapter

                    if (myArray.size == 0) {
                        binding.nofile.visibility = View.VISIBLE
                    }
                }
            }

        }

    }


    fun furtherCall(intent: Intent?) {

            startActivity(intent)

    }


}
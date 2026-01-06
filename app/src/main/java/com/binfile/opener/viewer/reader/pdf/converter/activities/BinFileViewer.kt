package com.binfile.opener.viewer.reader.pdf.converter.activities

import android.app.ActionBar
import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.InsetDrawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.Window
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.FileProvider
import at.favre.lib.bytes.Bytes

import com.binfile.opener.viewer.reader.pdf.converter.R
import com.binfile.opener.viewer.reader.pdf.converter.databinding.ActivityBinfileviewerBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader
import com.tom_roush.pdfbox.pdmodel.PDDocument
import com.tom_roush.pdfbox.pdmodel.PDPage
import com.tom_roush.pdfbox.pdmodel.PDPageContentStream
import com.tom_roush.pdfbox.pdmodel.font.PDFont
import com.tom_roush.pdfbox.pdmodel.font.PDType1Font
import org.exbin.auxiliary.paged_data.ByteArrayEditableData
import org.exbin.bined.CodeType
import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class BinFileViewer : AppCompatActivity(){
    private val executor: Executor = Executors.newSingleThreadExecutor()
    private val handler = Handler(Looper.getMainLooper())
    lateinit var binding: ActivityBinfileviewerBinding
    var fileType: String = ""
    var filePath: String = ""
    var valueChecked = ""
    lateinit var etFileName: EditText
    private var constValue = 52
    lateinit var fileConvertpath: String
    private lateinit var dialog: Dialog
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBinfileviewerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extras = intent.extras
        if (extras == null) {
            fileType = ""
            filePath = ""
        } else {
            fileType = intent!!.extras!!.getString("getFileID", "")
            filePath = intent!!.extras!!.getString("shareFile", "")
        }
        binding.backIv.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val file = File(filePath)

        if (fileType == "view") {
            val selectCodeViewArray = resources.getStringArray(R.array.SelectCodeView)
            val selectCodeRowsArray = resources.getStringArray(R.array.SelectCodeRows)

            //select code spinner
            val itemSelectedListener: AdapterView.OnItemSelectedListener =
                object : AdapterView.OnItemSelectedListener {
                    @RequiresApi(Build.VERSION_CODES.N)
                    override fun onItemSelected(
                        parent: AdapterView<*>?, view: View?,
                        position: Int, id: Long
                    ) {
                        val selectedItem = binding.selectCodeSpinner.selectedItem.toString()

                        if (selectedItem == "Binary") {
                            binding.includeContent.codeArea.codeType = CodeType.BINARY

                        } else if (selectedItem == "Decimal") {

                            binding.includeContent.codeArea.codeType = CodeType.DECIMAL

                        } else if (selectedItem == "Octal") {
                            binding.includeContent.codeArea.codeType = CodeType.OCTAL

                        } else {
                            binding.includeContent.codeArea.codeType = CodeType.HEXADECIMAL
                        }
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {

                    }
                }

            val adapter =
                ArrayAdapter(this@BinFileViewer, R.layout.spinners, selectCodeViewArray)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.selectCodeSpinner.adapter = adapter
            binding.selectCodeSpinner.onItemSelectedListener = itemSelectedListener


            var bool = false
            //for code rows
            val itemSelectedListener1: AdapterView.OnItemSelectedListener =
                object : AdapterView.OnItemSelectedListener {
                    @RequiresApi(Build.VERSION_CODES.N)
                    override fun onItemSelected(
                        parent: AdapterView<*>?, view: View?,
                        position: Int, id: Long
                    ) {

                        if (!bool) {
                            binding.selectRowsSpinner.setSelection(1)
                        }
                        val selectedItem = binding.selectRowsSpinner.selectedItem.toString()

                        if (selectedItem == "4") {
                            bool = true
                            binding.includeContent.codeArea.maxBytesPerRow = 4
                        } else if (selectedItem == "12") {
                            bool = true
                            binding.includeContent.codeArea.maxBytesPerRow = 12
                        } else if (selectedItem == "16") {
                            bool = true
                            binding.includeContent.codeArea.maxBytesPerRow = 16
                        } else {
                            bool = true
                            binding.includeContent.codeArea.maxBytesPerRow = 8
                        }
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {

                    }
                }

            val adapter1 =
                ArrayAdapter(this@BinFileViewer, R.layout.spinners, selectCodeRowsArray)
            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.selectRowsSpinner.adapter = adapter1
            binding.selectRowsSpinner.onItemSelectedListener = itemSelectedListener1



            executor.execute {

                try {
                    if (file.exists()){
                        com.binfile.opener.viewer.reader.pdf.converter.activities.BinFileViewer.Companion.fileData = ByteArrayEditableData()
                        val fileInputStream = FileInputStream(file)
                        com.binfile.opener.viewer.reader.pdf.converter.activities.BinFileViewer.Companion.fileData!!.loadFromStream(fileInputStream)
                        Log.d(ContentValues.TAG, "onActivityResult:myfiledata${com.binfile.opener.viewer.reader.pdf.converter.activities.BinFileViewer.Companion.fileData}")
                        fileInputStream.close()
                        runOnUiThread {
                            binding.includeContent.codeArea.contentData =
                                com.binfile.opener.viewer.reader.pdf.converter.activities.BinFileViewer.Companion.fileData
                        }
                    }else{
                        finish()
                    }

                } catch (e: OutOfMemoryError) {
                    e.printStackTrace()
                    runOnUiThread {
                        Toast.makeText(
                            this@BinFileViewer,
                            "File size may be too large",
                            Toast.LENGTH_SHORT
                        ).show()
                        finish()
                    }
                }

                handler.post {
                    binding.progressLinear.visibility = View.GONE
                }
            }
        } else if (fileType == "convert") {

            binding.progressLinear.visibility = View.GONE
            PDFBoxResourceLoader.init(applicationContext)
            binding.selectCodeSpinner.visibility = View.GONE
            binding.toolbartext.text = "Converted File"
            binding.includeContent.codeArea.visibility = View.GONE
            fileConversionDialogue(this@BinFileViewer)

        }
    }


    private fun convertByteIs(filePathhh: String, destpath: String) {
        val file = File(filePathhh)

        try {
            var byteString = ""
            try {
                val fin = FileInputStream(file)
                val byte = Bytes.from(fin)

                try {
                    if (valueChecked == "binary") {
                        byteString = byte.encodeBinary()
                    } else if (valueChecked == "hexa") {
                        byteString = byte.encodeHex()
                    } else if (valueChecked == "decimal") {
                        byteString = byte.encodeDec()
                    } else if (valueChecked == "octal") {
                        byteString = byte.encodeOctal()
                    }
                } catch (e: ArithmeticException) {
                    e.printStackTrace()
                }

            } catch (e: OutOfMemoryError) {
                e.printStackTrace()
                runOnUiThread {
                    Toast.makeText(
                        this@BinFileViewer,
                        "File size may be too large",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                finish()
            }

            val filee = File(destpath)

            val textArray = byteString
            val list = ArrayList<String>()
            var i = 0
            while (i < textArray.length) {
                if ((i + constValue) <= textArray.length) {
                    val oldIVale = i
                    i += constValue
                    list.add(textArray.substring(oldIVale, i))
                } else {
                    val oldIVale = i
                    i = textArray.length
                    list.add(textArray.substring(oldIVale, i))
                }
            }
            Log.d("TAG", "byteIs: logggg" + list)
            if (file.length() > 0) {
                try {

                    if (list.size > 0) {
                        convertPdf(list, filee.absolutePath)
                    } else {
                        finish()
                    }

                } catch (e: NullPointerException) {
                    e.printStackTrace()
                }
            } else {
                runOnUiThread {
                    Toast.makeText(this, "Your file size is too short", Toast.LENGTH_SHORT).show()
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    private fun dialogue(context: Context) {
        dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_alert_dialogue)


        val back = ColorDrawable(Color.TRANSPARENT)
        val inset = InsetDrawable(back, 15)
        dialog.window!!.setBackgroundDrawable(inset)
        dialog.show()
        val window = dialog.window
        window!!.setLayout(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
    }

    private fun fileConversionDialogue(context: Context) {

        val simpleDateFormat = SimpleDateFormat("mmddyyyyhhmmss", Locale.ENGLISH)
        val date = simpleDateFormat.format(Date())
        var mFilename = "PDF_$date"

        val dialog = Dialog(this@BinFileViewer)
        dialog.setContentView(R.layout.file_conversion_dialogue)
        val exit: CardView = dialog.findViewById(R.id.cancelbtn)
        val enter: CardView = dialog.findViewById(R.id.mconvertbtn)
        val hexa: RadioButton = dialog.findViewById(R.id.hexa_check)
        val bin: RadioButton = dialog.findViewById(R.id.bin_check)
        val dec: RadioButton = dialog.findViewById(R.id.dec_check)
        val octal: RadioButton = dialog.findViewById(R.id.octal_check)
        etFileName = dialog.findViewById(R.id.nameEdt)

        etFileName.setText(mFilename)

        bin.setOnClickListener {
            hexa.isChecked = false
            octal.isChecked = false
            dec.isChecked = false
        }
        hexa.setOnClickListener {
            bin.isChecked = false
            octal.isChecked = false
            dec.isChecked = false
        }
        octal.setOnClickListener {
            bin.isChecked = false
            hexa.isChecked = false
            dec.isChecked = false
        }
        dec.setOnClickListener {
            bin.isChecked = false
            hexa.isChecked = false
            octal.isChecked = false
        }
        enter.setOnClickListener {
            if (bin.isChecked) {
                valueChecked = "binary"
            } else if (hexa.isChecked) {

                valueChecked = "hexa"
            } else if (octal.isChecked) {

                valueChecked = "octal"
            } else if (dec.isChecked) {

                valueChecked = "decimal"
            }

            mFilename = etFileName.text.toString().trim { it <= ' ' }
            fileConvertpath = createDirFile(this, "/bintopdf").toString()
            val destPath = "$fileConvertpath/$mFilename.pdf"
            val file = File(destPath)
            if (file.exists()) {
                Toast.makeText(
                    context,
                    "File name already exist, Please try with other name",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                dialog.dismiss()
                if (!isFinishing) {
                    dialogue(this@BinFileViewer)
                }
                executor.execute {
                    try {
                        convertByteIs(filePath, destPath)
                    } catch (e: OutOfMemoryError) {
                        e.printStackTrace()
                        runOnUiThread {
                            Toast.makeText(
                                this@BinFileViewer,
                                "File size is too large",
                                Toast.LENGTH_SHORT
                            ).show()
                            dialog.dismiss()
                            finish()
                        }
                    }
                    handler.post {
                        dialog.dismiss()
                        finish()
                    }
                }
            }


        }
        dialog.setCancelable(true)
        dialog.window!!.setBackgroundDrawableResource(R.color.transparent)
        val window = dialog.window
        window!!.setLayout(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT)
        exit.setOnClickListener {
            dialog.dismiss()
            finish()

        }
        dialog.show()
    }
    fun createDirFile(context: Context, dirName: String?): String? {
        val path = context.getExternalFilesDir(dirName).toString()
        val folder = File(path)
        if (!folder.exists()) {
            if (!folder.mkdirs()) {
                Log.e("DirectoryLog :: ", "Problem creating folder")
            }
        }
        Log.e("FT :: ", "creating folder" + folder.path)
        return folder.path
    }

    fun convertPdf(texts: List<String>, mDestFile: String) {
        val font: PDFont = PDType1Font.TIMES_ROMAN
        val fontSize = 19f
        val leading = 20f

        val doc = PDDocument()
        var page: PDPage
        var contentStream: PDPageContentStream? = null
        var yCordinate = 30f
        var startX = 5f

        for (i in texts.indices) {
            try {
                if ((i % constValue) == 0) {
                    try {
                        contentStream!!.close()
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }

                    page = PDPage()
                    doc.addPage(page)
                    contentStream =
                        PDPageContentStream(doc, page, PDPageContentStream.AppendMode.APPEND, false)
                    contentStream.setFont(font, fontSize)
                    contentStream.setLeading(leading)
                    yCordinate = page.cropBox.upperRightY - 30
                    startX = page.cropBox.lowerLeftX + 30
                }
            } catch (e: Exception) {
                e.printStackTrace()
                Log.e("***value", "exception 1 ")
            }
            try {
                contentStream!!.beginText()
                contentStream.newLineAtOffset(startX, yCordinate)
                contentStream.showText(texts[i])
                contentStream.endText()

                yCordinate -= fontSize //This line is to track the yCordinate
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        contentStream!!.close()
        doc.save(mDestFile)

        runOnUiThread {
            binding.progressLinear.visibility = View.VISIBLE
        }

        executor.execute {

            try {
                val path = Uri.parse(mDestFile)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    val uri = FileProvider.getUriForFile(
                        this@BinFileViewer,
                        this.packageName.toString() + ".provider",
                        File(mDestFile)
                    )
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.setData(uri)
                    intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                    startActivity(intent)
                } else {
                    var intent = Intent(Intent.ACTION_VIEW)
                    intent.setDataAndType(path, "application/pdf")
                    intent = Intent.createChooser(intent, "Open File")
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)
                }
            } catch (e: ActivityNotFoundException) {
                e.printStackTrace()
                runOnUiThread {
                    binding.progressLinear.visibility = View.GONE
                }
                finish()
            }

            handler.post {
                binding.progressLinear.visibility = View.GONE
                finish()
            }
        }
    }


    companion object {
        var fileData: ByteArrayEditableData? = null
    }
    override fun onBackPressed() {
        val builder = MaterialAlertDialogBuilder(this, R.style.AlertDialogTheme)
        builder.setTitle("Alert:")
        builder.setMessage("Do you want to go back ? ")
        builder.setPositiveButton("Yes") { dialog, id ->
            dialog.dismiss()
            startActivity(Intent(this@BinFileViewer, com.binfile.opener.viewer.reader.pdf.converter.activities.MainActivity::class.java))
            finish()
        }
        builder.setNegativeButton(
            "No"
        ) { dialog, id -> dialog.cancel() }
        builder.show()
    }

}
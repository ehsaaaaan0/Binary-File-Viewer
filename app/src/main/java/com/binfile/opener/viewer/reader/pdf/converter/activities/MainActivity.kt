package com.binfile.opener.viewer.reader.pdf.converter.activities

import android.Manifest
import android.app.Activity
import android.app.Dialog
import android.bluetooth.BluetoothGattCharacteristic
import android.content.*
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import android.provider.Settings
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.view.Window
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.binfile.opener.viewer.reader.pdf.converter.BuildConfig

import com.binfile.opener.viewer.reader.pdf.converter.R
import com.binfile.opener.viewer.reader.pdf.converter.databinding.ActivityMainBinding
import com.binfile.opener.viewer.reader.pdf.converter.utils.UtilFiles
import com.binfile.opener.viewer.reader.pdf.converter.utils.MyUtils

import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.navigation.NavigationView
import java.io.File
import java.io.FileNotFoundException

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{
    lateinit var binding: ActivityMainBinding
    var fileType = ""

    private var fileResultLauncher: ActivityResultLauncher<Intent> =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                if (result.data != null) {
                    val uri: Uri = result.data!!.data!!
                    try {
                        val filePath = UtilFiles.from(this@MainActivity, uri).absolutePath
                        if (filePath != null && filePath.isNotEmpty()) {
                            MyUtils.updateToShPr(this, filePath, true)

                            startActivity(
                                Intent(
                                    this,
                                    com.binfile.opener.viewer.reader.pdf.converter.activities.BinFileViewer::class.java
                                ).putExtra("getFileID", fileType).putExtra("shareFile", filePath)
                            )
                        }
                    } catch (e: FileNotFoundException) {
                        e.printStackTrace()
                        Toast.makeText(
                            this,
                            "File may not found please try with another file",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                } else {
                    Log.d("TAG", "fail:")
                }
            }
        }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.appbarLayout.fab.setOnClickListener {

            fileType = "browse"
            browseForFile()
        }

        binding.appbarLayout.binViewer.setOnClickListener {

            fileType = "view"
                fileintent()
        }
        binding.appbarLayout.bin.setOnClickListener {

            fileType = "view"
                fileintent()
        }
        binding.appbarLayout.binToPdf.setOnClickListener {

            fileType = "convert"

                fileintent()

        }
        binding.appbarLayout.pdf.setOnClickListener {
            fileType = "convert"
                fileintent()
        }

        binding.appbarLayout.recentall.setOnClickListener {
            fileType = "recent"
                startActivity(
                    Intent(this, ListFile::class.java).putExtra("fileType", "recent")
                )
        }

        binding.appbarLayout.rencetNotext.setOnClickListener {
            fileType = "recent"
                startActivity(
                    Intent(this, ListFile::class.java).putExtra("fileType", "recent")
                )
        }

        binding.appbarLayout.convertall.setOnClickListener {

            fileType = "converted"
                startActivity(
                    Intent(this, ListFile::class.java).putExtra("fileType", "convert")
                )

        }
        binding.appbarLayout.convertedNotext.setOnClickListener {

            fileType = "converted"
                startActivity(
                    Intent(this, ListFile::class.java).putExtra("fileType", "convert")
                )

        }

        val toggleDrawer = ActionBarDrawerToggle(
            this,
            binding.drawerLayout, binding.appbarLayout.toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        toggleDrawer.drawerArrowDrawable.color = ContextCompat.getColor(this, R.color.white)
        binding.drawerLayout.addDrawerListener(toggleDrawer)
        toggleDrawer.syncState()
        binding.navView.setNavigationItemSelectedListener(this)
    }

    private fun mcheckPermission(): Boolean {
        val result =
            ContextCompat.checkSelfPermission(
                applicationContext,
                Manifest.permission.READ_EXTERNAL_STORAGE
            )
        val result1 =
            ContextCompat.checkSelfPermission(
                applicationContext,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            )
        return result == PackageManager.PERMISSION_GRANTED && result1 == PackageManager.PERMISSION_GRANTED
    }

    private fun requestPermission() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
            ),
            BluetoothGattCharacteristic.PERMISSION_READ
        )
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == BluetoothGattCharacteristic.PERMISSION_READ) {
            if (grantResults.isNotEmpty()) {
                val locationAccepted = grantResults[0] == PackageManager.PERMISSION_GRANTED
                if (locationAccepted) {
                } else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        if (shouldShowRequestPermissionRationale(Manifest.permission.READ_EXTERNAL_STORAGE)) {
                            showDialogCancelMessage { dialog: DialogInterface?, which: Int ->
                                requestPermissions(
                                    arrayOf(
                                        Manifest.permission.READ_EXTERNAL_STORAGE,
                                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                                    ),
                                    BluetoothGattCharacteristic.PERMISSION_READ
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    private fun showDialogCancelMessage(onClickListener: DialogInterface.OnClickListener) {
        MaterialAlertDialogBuilder(this@MainActivity, R.style.AlertDialogTheme)
            .setMessage("You need to allow access to both the permissions")
            .setPositiveButton("OK", onClickListener)
            .setNegativeButton("Cancel", null)
            .create()
            .show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && data != null) {
            val getFiles = data.getStringArrayListExtra("filePaths")

            if (getFiles != null && getFiles.size > 0) {
                val fileee = File(getFiles[0])

                val myfile = UtilFiles.from(this@MainActivity, Uri.fromFile(fileee)).absolutePath

                if (fileType == "view") {
                    Toast.makeText(this,"View",Toast.LENGTH_SHORT).show()
                    MyUtils.updateToShPr(this, myfile!!, true)
                    startActivity(
                        Intent(
                            this,
                            com.binfile.opener.viewer.reader.pdf.converter.activities.BinFileViewer::class.java
                        ).putExtra("getFileID", fileType).putExtra("shareFile", myfile)
                    )

                } else if (fileType == "convert") {
                    Toast.makeText(this,"Converted",Toast.LENGTH_SHORT).show()
                    startActivity(
                        Intent(
                            this,
                            com.binfile.opener.viewer.reader.pdf.converter.activities.BinFileViewer::class.java
                        ).putExtra("getFileID", fileType).putExtra("shareFile", myfile)
                    )
                }
            }
        }

    }



    fun fileintent() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            if (!Environment.isExternalStorageManager()) {

                Toast.makeText(
                    this@MainActivity,
                    "You must need to allow storage permission.",
                    Toast.LENGTH_SHORT
                ).show()

                try {
                    val intent =
                        Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION)
                    intent.addCategory("android.intent.category.DEFAULT")
                    intent.data = Uri.parse(
                        String.format(
                            "package:%s",
                            applicationContext.packageName
                        )
                    )
                    startActivity(intent)

                } catch (e: Exception) {
                    try {
                        val intent = Intent()
                        intent.action = Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION
                        startActivity(intent)
                    } catch (e: ActivityNotFoundException) {
                        e.printStackTrace()
                    }
                }
            } else {
                callFileIntent()
            }
        } else {
            if (!mcheckPermission()) {
                requestPermission()
            } else {
                callFileIntent()
            }
        }

    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val id: Int = item.getItemId()
        val drawer: DrawerLayout = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        if (id == R.id.shareApp) {
            drawer.closeDrawer(GravityCompat.START)
            shareApp()
        }
        if (id == R.id.moreApps) {
            drawer.closeDrawer(GravityCompat.START)
            moreApps()
        }
        if (id == R.id.rateUsNow) {
            drawer.closeDrawer(GravityCompat.START)
            rateUs()
        }
        if (id == R.id.viewPrivacy) {
            drawer.closeDrawer(GravityCompat.START)
            privacyPolicy()
        }
        if (id == R.id.feedbackUs) {
            drawer.closeDrawer(GravityCompat.START)
            feedback()
        }

        return false
    }

    fun browseForFile() {
        fileType = "view"
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "*/*"
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        intent.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION)
        val i = Intent.createChooser(intent, "Open File")
        fileResultLauncher.launch(i)
    }

    fun callFileIntent() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "*/*"
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        intent.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION)
        val i = Intent.createChooser(intent, "Open File")
        fileResultLauncher.launch(i)
    }
    private fun privacyPolicy() {
        try {
            val url =
                "https://smarttech0507.blogspot.com/2022/03/list-of-permissions-we-get-1.html"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    private fun shareApp() {
        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(
            Intent.EXTRA_TEXT,
            "Hey check out this app at: https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID
        )
        sendIntent.type = "text/plain"
        startActivity(sendIntent)
    }



    private fun feedback() {
        try {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("apps.smarttech05@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.putExtra(
                Intent.EXTRA_SUBJECT,
                getString(R.string.feed_back) + " " + getString(R.string.app_name)
            )
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }


    private fun rateUs() {
        try {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=" + BuildConfig.APPLICATION_ID)
                )
            )
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    private fun moreApps() {
        try {
            val url = "https://play.google.com/store/apps/developer?id=SmartTech+Applications"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    override fun onBackPressed() {

        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            val dialog = Dialog(this@MainActivity)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(true)
            dialog.setContentView(R.layout.exit_backpress)
            dialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)
            val rateBtn: CardView = dialog.findViewById(R.id.rate_us)
            val exitBtn: CardView = dialog.findViewById(R.id.exit)
            val cross: ImageView = dialog.findViewById(R.id.cross)
            // showMREC(dialog.findViewById(R.id.mrec_container), this@MainActivity)

            exitBtn.setOnClickListener {
                dialog.dismiss()
                this@MainActivity.finishAffinity()
            }
            rateBtn.setOnClickListener {
                dialog.dismiss()
                rateUs()
            }
            cross.setOnClickListener {
                dialog.dismiss()
            }

            dialog.show()
        }

    }
}
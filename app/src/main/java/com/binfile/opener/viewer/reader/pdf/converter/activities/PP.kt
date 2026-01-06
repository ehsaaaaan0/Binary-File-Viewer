package com.binfile.opener.viewer.reader.pdf.converter.activities

import android.Manifest
import android.app.AlertDialog
import android.bluetooth.BluetoothGattCharacteristic
import android.content.*
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.Settings
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.binfile.opener.viewer.reader.pdf.converter.databinding.ActivityPPBinding

class PP : AppCompatActivity() {
    lateinit var binding: ActivityPPBinding
    var pos: Boolean? = null
    lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            sharedPref = getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE)

            pos = sharedPref.getBoolean("score", false)

            if (pos == false) {
                Log.d("TAG", "onCreate:" + getExternalFilesDir(""))
                binding = ActivityPPBinding.inflate(layoutInflater)
                setContentView(binding.root)

                binding.agree.setOnClickListener {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                        if (!Environment.isExternalStorageManager()) {

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
                                resultLauncher.launch(intent)

                            } catch (e: Exception) {
                                try {
                                    val intent = Intent()
                                    intent.action = Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION
                                    resultLauncher.launch(intent)
                                } catch (e: ActivityNotFoundException) {
                                    e.printStackTrace()
                                }
                            }
//                            val intent = Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION)
//                            val uri = Uri.fromParts("package", packageName, null)
//                            intent.data = uri
//                            resultLauncher.launch(intent)
                        } else {
                            sharedPref.edit().putBoolean("score", true).apply()
                            val intent = Intent(this, SplashScreen::class.java)
                            startActivity(intent)
                            finish()
                        }
                    } else {
                        if (!checkPermission()) {
                            requestPermission()
                        }
                    }
                }
            } else {
                val intent = Intent(this, SplashScreen::class.java)
                startActivity(intent)
                finish()
            }
        } catch (e: ActivityNotFoundException) {
            e.printStackTrace()
        }

    }

    val resultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                if (Environment.isExternalStorageManager()) {
                    sharedPref.edit().putBoolean("score", true).apply()
                    val intent = Intent(this, SplashScreen::class.java)
                    startActivity(intent)
                    finish()
                }

            }
        }

    private fun checkPermission(): Boolean {
        val result = ContextCompat.checkSelfPermission(
            applicationContext,
            Manifest.permission.READ_EXTERNAL_STORAGE
        )
        val result1 = ContextCompat.checkSelfPermission(
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


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == BluetoothGattCharacteristic.PERMISSION_READ) {
            if (grantResults.isNotEmpty()) {
                val locationAccepted = grantResults[0] == PackageManager.PERMISSION_GRANTED
                if (locationAccepted) {
                    sharedPref.edit().putBoolean("score", true).apply()
                    val intent = Intent(this, SplashScreen::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    if (shouldShowRequestPermissionRationale(Manifest.permission.READ_EXTERNAL_STORAGE)) {
                        showMessageOKCancel { _: DialogInterface?, _: Int ->
                            requestPermissions(
                                arrayOf(
                                    Manifest.permission.READ_EXTERNAL_STORAGE,
                                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                                ),
                                BluetoothGattCharacteristic.PERMISSION_READ
                            )
                        }
                    }
                }
            }
        }
    }

    private fun showMessageOKCancel(onClickListener: DialogInterface.OnClickListener) {
        AlertDialog.Builder(this@PP)
            .setMessage("You need to allow access to both the permissions")
            .setPositiveButton("OK", onClickListener)
            .setNegativeButton("Cancel", null)
            .create()
            .show()
    }
}
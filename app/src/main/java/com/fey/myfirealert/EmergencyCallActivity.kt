package com.fey.myfirealert

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class EmergencyCallActivity : AppCompatActivity() {
    var buttoncall: Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency_call)
        buttoncall = findViewById(R.id.mBtncall)

        buttoncall!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254785513748"))
            if (ContextCompat.checkSelfPermission(
                    this@EmergencyCallActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@EmergencyCallActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            }


        }
    }
}
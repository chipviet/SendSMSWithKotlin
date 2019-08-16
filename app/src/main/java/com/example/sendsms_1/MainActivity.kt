package com.example.sendsms_1

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ActivityCompat.requestPermissions(
            this@MainActivity,
            arrayOf(Manifest.permission.SEND_SMS, Manifest.permission.READ_SMS),
            PackageManager.PERMISSION_GRANTED
        )
        button.setOnClickListener () {
            sendSMS()
        }
    }
//    fun sendSMS(view: View) {
//        val message = "cccc"+ editText.getText().toString()
//        val number = editTextNumber.text.toString()
//
//        val mySmsManager = SmsManager.getDefault()
//        mySmsManager.sendTextMessage(number, null, message, null, null)
//    }
    private fun sendSMS() {
    val message = "cccc"+ editText.getText().toString()
    val number = editTextNumber.text.toString()

    val mySmsManager = SmsManager.getDefault()
    mySmsManager.sendTextMessage(number, null, message, null, null)
}
}

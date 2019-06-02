package org.niralmehta.camerauploadexample.screens

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_report.*
import org.niralmehta.camerauploadexample.R
import org.niralmehta.camerauploadexample.data.WalletActivity
import org.niralmehta.camerauploadexample.di.Injectable
import org.niralmehta.camerauploadexample.main.MainActivity
import org.niralmehta.camerauploadexample.utils.interfaces.OnBackPressedListener


class ReportActivity : AppCompatActivity() , Injectable, OnBackPressedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)
        all.setOnClickListener {
            startActivity (Intent(this@ReportActivity, WalletActivity::class.java))
        }
    }

}

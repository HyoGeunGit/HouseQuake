package org.niralmehta.camerauploadexample.modules.upload.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import org.niralmehta.camerauploadexample.R
import org.niralmehta.camerauploadexample.main.MainActivity
import org.niralmehta.camerauploadexample.screens.ReportActivity

class LodingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loding)

        val handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this@LodingActivity, ReportActivity::class.java))
            finish()
        }, 2000)
    }
}

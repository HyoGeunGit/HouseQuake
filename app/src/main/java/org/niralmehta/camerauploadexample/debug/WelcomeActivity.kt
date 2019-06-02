package org.niralmehta.camerauploadexample.debug

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*
import kotlinx.android.synthetic.main.activity_welcome.*
import org.niralmehta.camerauploadexample.R
import org.niralmehta.camerauploadexample.screens.LoginActivity
import org.niralmehta.camerauploadexample.screens.SignUpActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        sign_btn.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        accountText.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}

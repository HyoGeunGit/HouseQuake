package org.niralmehta.camerauploadexample.data


import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomappbar.BottomAppBar
import kotlinx.android.synthetic.main.activity_wallet.*
import kotlinx.android.synthetic.main.screen_notify.*
import org.niralmehta.camerauploadexample.R
import org.niralmehta.camerauploadexample.adapter.RecyclerAdapter
import org.niralmehta.camerauploadexample.data.User
import org.niralmehta.camerauploadexample.di.Injectable
import org.niralmehta.camerauploadexample.main.MainActivity
import org.niralmehta.camerauploadexample.main.NotifyActivity
import org.niralmehta.camerauploadexample.screens.LoginActivity
import org.niralmehta.camerauploadexample.utils.interfaces.OnBackPressedListener
import org.niralmehta.camerauploadexample.utils.view.getAppBarFab
import org.niralmehta.camerauploadexample.utils.view.setFabIcon


class WalletActivity : AppCompatActivity() , Injectable, OnBackPressedListener {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)
        inst.setImageResource(R.drawable.inst)
        sender.setOnClickListener {
           startActivity(Intent( Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=piuk.blockchain.android"))))
        }
        senders.setOnClickListener {
            startActivity(Intent(this@WalletActivity, MainActivity::class.java))
        }
        senderss.setOnClickListener {
            startActivity(Intent(this@WalletActivity, NotifyActivity::class.java))
        }
    }

}


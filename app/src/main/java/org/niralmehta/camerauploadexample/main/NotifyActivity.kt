package org.niralmehta.camerauploadexample.main


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomappbar.BottomAppBar
import kotlinx.android.synthetic.main.screen_notify.*
import org.niralmehta.camerauploadexample.R
import org.niralmehta.camerauploadexample.adapter.RecyclerAdapter
import org.niralmehta.camerauploadexample.data.User
import org.niralmehta.camerauploadexample.di.Injectable
import org.niralmehta.camerauploadexample.utils.interfaces.OnBackPressedListener
import org.niralmehta.camerauploadexample.utils.view.getAppBarFab
import org.niralmehta.camerauploadexample.utils.view.setFabIcon


class NotifyActivity : AppCompatActivity() , Injectable, OnBackPressedListener {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_notify)
        //임시로 사용할 데이터 실제로는 서버통신을 통해 db나 json에서 가져옵니다. 이름들은 걍 떠오르는 이름 아무거나 썼어요
        val userList = arrayListOf(
                User("Maru180", "Breakable:82%", "Now Able Money: 2000$/1400$"),
                User("Maru180", "Breakable:82%", "Now Able Money: 2000$/1400$"),
                User("Maru180", "Breakable:82%", "Now Able Money: 2000$/1400$"),
                User("Maru180", "Breakable:82%", "Now Able Money: 2000$/1400$"),
                User("Maru180", "Breakable:82%", "Now Able Money: 2000$/1400$"),
                User("Maru180", "Breakable:82%", "Now Able Money: 2000$/1400$"),
                User("Maru180", "Breakable:82%", "Now Able Money: 2000$/1400$"),
                User("Maru180", "Breakable:82%", "Now Able Money: 2000$/1400$")
        )

        //레이아웃매니저를 설정해줍니다.
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recyclerView.setHasFixedSize(true)

        //어댑터도 설정해줍니다.
        recyclerView.adapter = RecyclerAdapter(userList)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

}

package org.niralmehta.camerauploadexample


import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    private var instance: BaseActivity? = null
    private var mToolbarHeight = 0
    private var mAnimDuration = 0

    private var mVaActionBar: ValueAnimator? = null

    protected abstract var viewId: Int

    protected abstract fun onCreate()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        instance = this

        setContentView(viewId)
        onCreate()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
    // <- 버튼 누를 시 뒤로가기

}
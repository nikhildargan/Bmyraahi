package com.bmyraahi.vendor.onboarding

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.bmyraahi.vendor.BmrConstants.KEY_TOKEN
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.utils.PreferenceHelper

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val mHandler = Handler()
        val runnable = Runnable {
            val token = PreferenceHelper.defaultPrefs(this@SplashActivity).getString(KEY_TOKEN, null)
            var dashBoardIntent: Intent
            dashBoardIntent = if (token != null)
                Intent(this@SplashActivity, MenuActivity::class.java)
            else
                Intent(this@SplashActivity, GetOtpActivity::class.java)
            startActivity(dashBoardIntent)
            finish()
        }

        mHandler?.postDelayed(runnable, 500)
    }

}

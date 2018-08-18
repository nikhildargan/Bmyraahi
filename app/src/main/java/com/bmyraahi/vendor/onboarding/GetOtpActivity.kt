package com.bmyraahi.vendor.onboarding

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.activity_get_otp.*

class GetOtpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_otp)

        btnGetOtp.setOnClickListener {

            val intent = Intent(this@GetOtpActivity, VerifyOtpActivity::class.java)
            startActivity(intent)
        }
    }
}

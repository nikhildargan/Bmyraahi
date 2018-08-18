package com.bmyraahi.vendor.onboarding

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.activity_verify_otp.*

class VerifyOtpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_otp)

        btnVerifyOtp.setOnClickListener {

            val intent = Intent(this@VerifyOtpActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}

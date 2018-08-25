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

            if(validateMobile())
            {
                requestOtp()
            }
        }


    }

    private fun requestOtp() {
        val intent = Intent(this@GetOtpActivity, VerifyOtpActivity::class.java)
        startActivity(intent)


    }


    private fun validateMobile(): Boolean {
        if (etMobile.getText().toString().trim({ it <= ' ' }).isEmpty()) {
            etMobile.setError("Please enter mobile number")
            etMobile.requestFocus()
            return false
        } else if (etMobile.getText().toString().trim({ it <= ' ' }).length < 10) {
            etMobile.setError("Please Enter 10 digits mobile number without country code.")
            etMobile.requestFocus()
            return false
        }
        return true
    }
}

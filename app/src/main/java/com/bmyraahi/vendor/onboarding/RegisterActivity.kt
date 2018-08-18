package com.bmyraahi.vendor.onboarding

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.home.HomeActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister.setOnClickListener {

            val intent = Intent(this@RegisterActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}

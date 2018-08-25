package com.bmyraahi.vendor.onboarding

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.bmyraahi.vendor.BmrConstants
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.home.HomeActivity
import com.bmyraahi.vendor.home.Profile
import com.bmyraahi.vendor.network.BmrApiInterface
import com.bmyraahi.vendor.network.BmrApis
import kotlinx.android.synthetic.main.activity_register.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class RegisterActivity : AppCompatActivity() {

    lateinit var profile: Profile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister.setOnClickListener {
            if (validateUser()) {
                registerUser()
            }
        }
    }

    fun validateUser(): Boolean {
        profile.name = etName.text.toString()
        profile.email = etEmail.text.toString()
        profile.phone = etMobile.text.toString()


        var selectedRadioButtonID = rgVendorType.getCheckedRadioButtonId();

        // If nothing is selected from Radio Group, then it return -1
        if (selectedRadioButtonID != -1) {

            var selectedRadioButton = findViewById<RadioButton>(selectedRadioButtonID);
            var role = BmrConstants.ROLE_GUIDE
            when (selectedRadioButton) {
                rbActivity -> role = BmrConstants.ROLE_VENDOR
                rbTransport -> role = BmrConstants.ROLE_CAB
            }
            profile.role = role
        }

        if (profile.name.isNullOrEmpty() || profile.email.isNullOrEmpty() || profile.phone.isNullOrEmpty()) {
            return false
        }
        return true
    }

    fun registerUser() {

        var bmrApi = BmrApis.createService(BmrApiInterface::class.java)
        bmrApi.registerUser(profile).enqueue(object : retrofit2.Callback<Profile> {
            override fun onFailure(call: Call<Profile>, t: Throwable) {

            }

            override fun onResponse(call: Call<Profile>, response: Response<Profile>) {
                if (response.isSuccessful) {
                    val intent = Intent(this@RegisterActivity, HomeActivity::class.java)
                    startActivity(intent)
                }
            }


        })


    }
}

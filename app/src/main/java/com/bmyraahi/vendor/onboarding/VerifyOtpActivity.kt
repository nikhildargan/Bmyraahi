package com.bmyraahi.vendor.onboarding

import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.BmrConstants
import com.bmyraahi.vendor.BmrConstants.KEY_IS_LOGIN
import com.bmyraahi.vendor.BmrConstants.KEY_MOBILE
import com.bmyraahi.vendor.BmrConstants.KEY_TOKEN
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.network.ApiUrl
import com.bmyraahi.vendor.network.BmrApiInterface
import com.bmyraahi.vendor.network.BmrApis
import com.bmyraahi.vendor.utils.PreferenceHelper.defaultPrefs
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_get_otp.*
import kotlinx.android.synthetic.main.activity_verify_otp.*
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class VerifyOtpActivity : AppCompatActivity() {

    lateinit var mobile: String
    lateinit var prefs: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_otp)
        prefs = defaultPrefs(this@VerifyOtpActivity)
        intent?.let {
            mobile = intent.getStringExtra(KEY_MOBILE)
        }

        btnVerifyOtp.setOnClickListener {
            if (validateOtp())
                verifyOtp()
        }
    }

    private fun validateOtp(): Boolean {
        if (etOtp.getText().toString().trim({ it <= ' ' }).isEmpty()) {
            etOtp.setError("Please enter OTP ")
            etOtp.requestFocus()
            return false
        }
        return true
    }

    fun verifyOtp() {

        val bmrApiInterface = BmrApis.createService(BmrApiInterface::class.java)
        bmrApiInterface.verifyOtp(ApiUrl.URL_VERIFY_OTP, mobile, etOtp.text.toString())
                .enqueue(object : Callback<ResponseBody> {
                    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    }

                    override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                        if (response.isSuccessful) {
                            val body = response.body().toString()
                            var jsonObj = JSONObject(body)
                            // get toekn
                            var token = ""
                            prefs.edit().putBoolean(KEY_IS_LOGIN, true).apply()
                            prefs.edit().putString(KEY_TOKEN, "jwt " + jsonObj.getString(token)).apply()
                            // prefs.set[KEY_IS_LOGIN]=true
                            val intent = Intent(this@VerifyOtpActivity, RegisterActivity::class.java)
                            startActivity(intent)
                        }
                    }


                })
    }
}

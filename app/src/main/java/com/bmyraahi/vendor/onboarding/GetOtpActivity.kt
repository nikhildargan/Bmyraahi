package com.bmyraahi.vendor.onboarding

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.inventory.model.BmrPackage
import com.bmyraahi.vendor.network.BmrApiInterface
import com.bmyraahi.vendor.network.BmrApis
import kotlinx.android.synthetic.main.activity_get_otp.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.network.ApiUrl
import java.security.AccessController.getContext

class GetOtpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_otp)

        btnGetOtp.setOnClickListener {

            if (validateMobile()) {
                requestOtp()
            }
        }


    }

    private fun requestOtp() {


        val mobile = etMobile.text.toString()
        val bmrApiInterface = BmrApis.createService(BmrApiInterface::class.java)
        bmrApiInterface.getOtp(ApiUrl.URL_SEND_OTP, mobile)
                .enqueue(object : Callback<ResponseBody> {
                    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    }

                    override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                        if (response.isSuccessful) {
                            val intent = Intent(this@GetOtpActivity, VerifyOtpActivity::class.java)
                            intent.putExtra("key_mobile", mobile)
                            startActivity(intent)
                        }
                    }


                })
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

package com.bmyraahi.vendor.account

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.BmrConstants.KEY_PROFILE
import com.bmyraahi.vendor.BmrConstants.KEY_TOKEN
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.home.Profile
import com.bmyraahi.vendor.network.BmrApiInterface
import com.bmyraahi.vendor.network.BmrApis
import com.bmyraahi.vendor.utils.PreferenceHelper
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_edit_profile.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class EditProfileActivity : AppCompatActivity() {

    lateinit var profile: Profile
    val gson = Gson()
    lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        prefs = PreferenceHelper.defaultPrefs(this@EditProfileActivity)
        setData()

        btnUpdate.setOnClickListener {
            updateProfileData()
        }

    }

    private fun setData() {
        val profileData = prefs.getString(KEY_PROFILE, null)
        profileData?.let {

            profile = gson.fromJson(profileData, Profile::class.java)
            etFirmName.setText(profile.name)
            etEmail.setText(profile.email)
            etMobile.setText(profile.mobile)
        }
    }


    private fun updateProfileData() {
        val token = prefs.getString(KEY_TOKEN,null)
        token?.let {

            // update local model
            profile.email = etEmail.text.toString()
            profile.mobile = etMobile.text.toString()
            profile.name = etFirmName.text.toString()

            val updateProfileService: BmrApiInterface = BmrApis.createService(BmrApiInterface::class.java, token)
            updateProfileService.updateProfile(profile.id, profile)
                    .enqueue(object : Callback<Profile> {
                        override fun onFailure(call: Call<Profile>?, t: Throwable?) {
                        }

                        override fun onResponse(call: Call<Profile>?, response: Response<Profile>) {
                            if (response.isSuccessful) {
                                prefs.edit().putString(KEY_PROFILE, gson.toJson(profile)).apply()
                                finish()
                            }
                        }
                    })
        }
    }
}

package com.bmyraahi.vendor.home

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Profile {
    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("phone")
    @Expose
    var phone: String? = null
    @SerializedName("website")
    @Expose
    var website: String? = null
    @SerializedName("email")
    @Expose
    var email: String? = null
    @SerializedName("role")
    @Expose
    var role: String? = null
    @SerializedName("city")
    @Expose
    var city: Any? = null
    @SerializedName("address")
    @Expose
    var address: String? = null
    @SerializedName("kyc_done")
    @Expose
    var isKycDone: Boolean = false

}

package com.bmyraahi.vendor.network;

import com.bmyraahi.vendor.account.KycModel;
import com.bmyraahi.vendor.home.Profile;
import com.bmyraahi.vendor.inventory.model.BmrPackage;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BmrApiInterface  {

    @GET("activities/")
    Call<BmrPackage> getPackagesByVendorId(
            @Query("vendor_id") String id
    );

    @GET("cities/")
    Call<BmrPackage> getCities();

    @POST("partner-profile/{PROFILE_ID}")
    Call<Profile> updateProfile(@Path("PROFILE_ID") String profileId, @Body Profile profile);

    @POST("partner-profile/kyc-document")
    Call<Profile> updateKyc(@Header("Authorization") String credentials, KycModel kycModel);

}

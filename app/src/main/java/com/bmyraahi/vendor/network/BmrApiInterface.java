package com.bmyraahi.vendor.network;

import com.bmyraahi.vendor.account.KycModel;
import com.bmyraahi.vendor.home.Profile;
import com.bmyraahi.vendor.inventory.model.BmrPackage;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface BmrApiInterface {

    @GET("activities/")
    Call<BmrPackage> getPackagesByVendorId(
            @Query("vendor_id") String id
    );

    @FormUrlEncoded
    @POST
    Call<ResponseBody> getOtp(@Url String url,
                              @Field("phone") String phone
    );


    @FormUrlEncoded
    @POST
    Call<ResponseBody> verifyOtp(@Url String url,
                                 @Field("phone") String phone,
                                 @Field("otp") String otp
    );


    @POST("accounts/register/")
    Call<Profile> registerUser(@Body Profile profile);


    @GET("cities/")
    Call<BmrPackage> getCities();

    @POST("partner-profile/{PROFILE_ID}")
    Call<Profile> updateProfile(@Path("PROFILE_ID") String profileId, @Body Profile profile);

    @POST("partner-profile/kyc-document")
    Call<Profile> updateKyc(@Header("Authorization") String credentials, KycModel kycModel);

}

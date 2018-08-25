package com.bmyraahi.vendor.network;

/**
 * Created by yodev4 on 7/23/2017.
 */

public class ApiUrl {
    public static String BASE_URL = "https://staging-api.bmyraahi.com/api/v1/partner";
    public static String API_URL = "https://staging-api.bmyraahi.com/api/v1/";
    public static String URL_SEND_OTP = BASE_URL + "/login/get-otp/";
    public static String URL_VERIFY_OTP = BASE_URL + "/login/verify-otp/";
    public static String URL_GET_USER_INFO = BASE_URL + "/getVendorInfo";
    public static String URL_GET_ALL_CAB_INFO = BASE_URL + "/getVendorALlCabList";
    public static String URL_DELETE_CAB = BASE_URL + "/deleteCabService";
    public static String URL_GET_ALL_STATE = BASE_URL + "/getState";
    public static String URL_GET_CITY = BASE_URL + "/getCity";

    public static String URL_UPLOAD_IMAGE = BASE_URL + "/uploadFile";
    public static String URL_UPLOAD_IMAGE2 = BASE_URL + "/addService";//In Supplier to add menu list
    public static String URL_ADD_SERVICE = BASE_URL + "/guideAddActivites";//In Guide add service list

    public static String URL_CAB_SERVICE = BASE_URL + "/addCabService";
    public static String URL_CAB_RC_IMAGE = BASE_URL + "/addCabServiceFile";
    public static String URL_GET_ALL_BOOKINGS = BASE_URL + "/getAllBooking";
    public static String URL_GET_GUIDE_SERVICES = BASE_URL + "/guideActivites";
    public static String URL_DELETE_GUIDE_SERVICES = BASE_URL + "/deleteGuideActivities";
    public static String URL_UPDATE_GUIDE_SERVICES = BASE_URL + "/updateGuideActivites";
    public static String URL_DELETE_ACTIVITY_IMAGE = BASE_URL + "/deleteActivityImage";
    public static String URL_ADD_ACTIVITY_IMAGE = BASE_URL + "/addActivityImage";
    //Api to get booking on specific calendar date.
    public static String URL_DAY_EVENT = BASE_URL + "/getCalanderDateBooking";
    //Api to get all booking date(events) of a specific month of a year.
    public static String URL_MONTH_EVENTS = BASE_URL + "/getAllBookingInMonthCalander";
    //weekly leave
    public static String URL_WEEKLY_LEAVE = BASE_URL + "/addUpdateDayOff";
    //personal leave
    public static String URL_PERSONAL_LEAVE = BASE_URL + "/addUpdateLeave";
    //get all leave
    public static String URL_GET_ALL_LEAVE = BASE_URL + "/getVendorLeave";

    //delete a leave
    public static String URL_DELETE_LEAVE = BASE_URL + "/deleteVendorLeave";


    //GUIDE LANGUAGE
    public static String URL_GET_PLACE = BASE_URL + "/getPlace";
    public static String URL_GET_LANG = BASE_URL + "/getLanguage";
    public static String URL_GET_PERSON_RANGE_LIST = BASE_URL + "/getGroupOfPersons";

    public static String URL_GET_LANG_RATES = BASE_URL + "/getLanguageRates";
    public static String URL_GET_LANG_LIST = BASE_URL + "/getGuideLanguageList";
    public static String URL_ADD_LANG = BASE_URL + "/addGuideLanguage";
    public static String URL_DELETE_LANG = BASE_URL + "/deleteGuideLanguage";
    public static String URL_GET_LANG_DETAIL = BASE_URL + "/getGuideLanguageDetail";

    //Discount
    public static String URL_LIST_FOR_DISCOUNT = BASE_URL + "/getActivityList";
    public static String URL_ADD_DISCOUNT = BASE_URL + "/addDiscount";
    public static String URL_DELETE_DISCOUNT = BASE_URL + "/deleteDiscount";
    public static String URL_GET_DISCOUNT_DETAIL = BASE_URL + "/getDiscountDetail";

    //Bike
    public static String URL_GET_BIKE_LIST = BASE_URL + "/getVendorAllBykeService";
    public static String URL_ADD_BIKE = BASE_URL + "/addBykeService";
    public static String URL_DELETE_BIKE = BASE_URL + "/deleteBykeService";
    public static String URL_GET_BIKE_DETAIL = BASE_URL + "/getVendorBykeDetail";

    //
    public static String URL_REG_FIRST = "https://staging-api.bmyraahi.com/register-partner/";
    public static String URL_UPDATE_PROFILE = BASE_URL + "/updateProfile";
    public static String URL_UPDATE_PROFILE_ADVANCE = BASE_URL + "/updateVendorCertificate";



    //Cab
    public static String URL_GET_CAB_LIST = BASE_URL + "/getVendorAllCabService";
    public static String URL_ADD_CAB = BASE_URL + "/addCabService";
    public static String URL_DELETE_A_CAB = BASE_URL + "/deleteCabService";
    public static String URL_GET_CAB_DETAIL = BASE_URL + "/getVendorCabDetail";
    public static String URL_GET_OUTING_PLACE = BASE_URL + "/getOutingList";



}

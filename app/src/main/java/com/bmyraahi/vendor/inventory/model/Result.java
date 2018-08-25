package com.bmyraahi.vendor.inventory.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("parent")
    @Expose
    private Object parent;
    @SerializedName("vendor")
    @Expose
    private String vendor;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("tagline")
    @Expose
    private String tagline;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("slots")
    @Expose
    private List<String> slots = null;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("inclusion")
    @Expose
    private List<String> inclusion = null;
    @SerializedName("exclusion")
    @Expose
    private List<String> exclusion = null;
    @SerializedName("coordinate")
    @Expose
    private Object coordinate;
    @SerializedName("dfc")
    @Expose
    private Object dfc;
    @SerializedName("rating")
    @Expose
    private double rating;
    @SerializedName("recommend")
    @Expose
    private boolean recommend;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("pricing_unit")
    @Expose
    private String pricingUnit;
    @SerializedName("adult_price")
    @Expose
    private String adultPrice;
    @SerializedName("child_price")
    @Expose
    private String childPrice;
    @SerializedName("child_age")
    @Expose
    private int childAge;
    @SerializedName("item_price")
    @Expose
    private String itemPrice;
    @SerializedName("min_pax")
    @Expose
    private int minPax;
    @SerializedName("max_pax")
    @Expose
    private int maxPax;
    @SerializedName("children")
    @Expose
    private List<Object> children = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getParent() {
        return parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getSlots() {
        return slots;
    }

    public void setSlots(List<String> slots) {
        this.slots = slots;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getInclusion() {
        return inclusion;
    }

    public void setInclusion(List<String> inclusion) {
        this.inclusion = inclusion;
    }

    public List<String> getExclusion() {
        return exclusion;
    }

    public void setExclusion(List<String> exclusion) {
        this.exclusion = exclusion;
    }

    public Object getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Object coordinate) {
        this.coordinate = coordinate;
    }

    public Object getDfc() {
        return dfc;
    }

    public void setDfc(Object dfc) {
        this.dfc = dfc;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getPricingUnit() {
        return pricingUnit;
    }

    public void setPricingUnit(String pricingUnit) {
        this.pricingUnit = pricingUnit;
    }

    public String getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(String adultPrice) {
        this.adultPrice = adultPrice;
    }

    public String getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(String childPrice) {
        this.childPrice = childPrice;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getMinPax() {
        return minPax;
    }

    public void setMinPax(int minPax) {
        this.minPax = minPax;
    }

    public int getMaxPax() {
        return maxPax;
    }

    public void setMaxPax(int maxPax) {
        this.maxPax = maxPax;
    }

    public List<Object> getChildren() {
        return children;
    }

    public void setChildren(List<Object> children) {
        this.children = children;
    }

}
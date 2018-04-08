package com.arhiser.alcobrowser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Store {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_dead")
    @Expose
    private Boolean isDead;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tags")
    @Expose
    private String tags;
    @SerializedName("address_line_1")
    @Expose
    private String addressLine1;
    @SerializedName("address_line_2")
    @Expose
    private String addressLine2;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("telephone")
    @Expose
    private String telephone;
    @SerializedName("fax")
    @Expose
    private String fax;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("products_count")
    @Expose
    private Integer productsCount;
    @SerializedName("inventory_count")
    @Expose
    private Integer inventoryCount;
    @SerializedName("inventory_price_in_cents")
    @Expose
    private Integer inventoryPriceInCents;
    @SerializedName("inventory_volume_in_milliliters")
    @Expose
    private Integer inventoryVolumeInMilliliters;
    @SerializedName("has_wheelchair_accessability")
    @Expose
    private Boolean hasWheelchairAccessability;
    @SerializedName("has_bilingual_services")
    @Expose
    private Boolean hasBilingualServices;
    @SerializedName("has_product_consultant")
    @Expose
    private Boolean hasProductConsultant;
    @SerializedName("has_tasting_bar")
    @Expose
    private Boolean hasTastingBar;
    @SerializedName("has_beer_cold_room")
    @Expose
    private Boolean hasBeerColdRoom;
    @SerializedName("has_special_occasion_permits")
    @Expose
    private Boolean hasSpecialOccasionPermits;
    @SerializedName("has_vintages_corner")
    @Expose
    private Boolean hasVintagesCorner;
    @SerializedName("has_parking")
    @Expose
    private Boolean hasParking;
    @SerializedName("has_transit_access")
    @Expose
    private Boolean hasTransitAccess;
    @SerializedName("sunday_open")
    @Expose
    private Integer sundayOpen;
    @SerializedName("sunday_close")
    @Expose
    private Integer sundayClose;
    @SerializedName("monday_open")
    @Expose
    private Integer mondayOpen;
    @SerializedName("monday_close")
    @Expose
    private Integer mondayClose;
    @SerializedName("tuesday_open")
    @Expose
    private Integer tuesdayOpen;
    @SerializedName("tuesday_close")
    @Expose
    private Integer tuesdayClose;
    @SerializedName("wednesday_open")
    @Expose
    private Integer wednesdayOpen;
    @SerializedName("wednesday_close")
    @Expose
    private Integer wednesdayClose;
    @SerializedName("thursday_open")
    @Expose
    private Integer thursdayOpen;
    @SerializedName("thursday_close")
    @Expose
    private Integer thursdayClose;
    @SerializedName("friday_open")
    @Expose
    private Integer fridayOpen;
    @SerializedName("friday_close")
    @Expose
    private Integer fridayClose;
    @SerializedName("saturday_open")
    @Expose
    private Integer saturdayOpen;
    @SerializedName("saturday_close")
    @Expose
    private Integer saturdayClose;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("store_no")
    @Expose
    private Integer storeNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsDead() {
        return isDead;
    }

    public void setIsDead(Boolean isDead) {
        this.isDead = isDead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getProductsCount() {
        return productsCount;
    }

    public void setProductsCount(Integer productsCount) {
        this.productsCount = productsCount;
    }

    public Integer getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(Integer inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public Integer getInventoryPriceInCents() {
        return inventoryPriceInCents;
    }

    public void setInventoryPriceInCents(Integer inventoryPriceInCents) {
        this.inventoryPriceInCents = inventoryPriceInCents;
    }

    public Integer getInventoryVolumeInMilliliters() {
        return inventoryVolumeInMilliliters;
    }

    public void setInventoryVolumeInMilliliters(Integer inventoryVolumeInMilliliters) {
        this.inventoryVolumeInMilliliters = inventoryVolumeInMilliliters;
    }

    public Boolean getHasWheelchairAccessability() {
        return hasWheelchairAccessability;
    }

    public void setHasWheelchairAccessability(Boolean hasWheelchairAccessability) {
        this.hasWheelchairAccessability = hasWheelchairAccessability;
    }

    public Boolean getHasBilingualServices() {
        return hasBilingualServices;
    }

    public void setHasBilingualServices(Boolean hasBilingualServices) {
        this.hasBilingualServices = hasBilingualServices;
    }

    public Boolean getHasProductConsultant() {
        return hasProductConsultant;
    }

    public void setHasProductConsultant(Boolean hasProductConsultant) {
        this.hasProductConsultant = hasProductConsultant;
    }

    public Boolean getHasTastingBar() {
        return hasTastingBar;
    }

    public void setHasTastingBar(Boolean hasTastingBar) {
        this.hasTastingBar = hasTastingBar;
    }

    public Boolean getHasBeerColdRoom() {
        return hasBeerColdRoom;
    }

    public void setHasBeerColdRoom(Boolean hasBeerColdRoom) {
        this.hasBeerColdRoom = hasBeerColdRoom;
    }

    public Boolean getHasSpecialOccasionPermits() {
        return hasSpecialOccasionPermits;
    }

    public void setHasSpecialOccasionPermits(Boolean hasSpecialOccasionPermits) {
        this.hasSpecialOccasionPermits = hasSpecialOccasionPermits;
    }

    public Boolean getHasVintagesCorner() {
        return hasVintagesCorner;
    }

    public void setHasVintagesCorner(Boolean hasVintagesCorner) {
        this.hasVintagesCorner = hasVintagesCorner;
    }

    public Boolean getHasParking() {
        return hasParking;
    }

    public void setHasParking(Boolean hasParking) {
        this.hasParking = hasParking;
    }

    public Boolean getHasTransitAccess() {
        return hasTransitAccess;
    }

    public void setHasTransitAccess(Boolean hasTransitAccess) {
        this.hasTransitAccess = hasTransitAccess;
    }

    public Integer getSundayOpen() {
        return sundayOpen;
    }

    public void setSundayOpen(Integer sundayOpen) {
        this.sundayOpen = sundayOpen;
    }

    public Integer getSundayClose() {
        return sundayClose;
    }

    public void setSundayClose(Integer sundayClose) {
        this.sundayClose = sundayClose;
    }

    public Integer getMondayOpen() {
        return mondayOpen;
    }

    public void setMondayOpen(Integer mondayOpen) {
        this.mondayOpen = mondayOpen;
    }

    public Integer getMondayClose() {
        return mondayClose;
    }

    public void setMondayClose(Integer mondayClose) {
        this.mondayClose = mondayClose;
    }

    public Integer getTuesdayOpen() {
        return tuesdayOpen;
    }

    public void setTuesdayOpen(Integer tuesdayOpen) {
        this.tuesdayOpen = tuesdayOpen;
    }

    public Integer getTuesdayClose() {
        return tuesdayClose;
    }

    public void setTuesdayClose(Integer tuesdayClose) {
        this.tuesdayClose = tuesdayClose;
    }

    public Integer getWednesdayOpen() {
        return wednesdayOpen;
    }

    public void setWednesdayOpen(Integer wednesdayOpen) {
        this.wednesdayOpen = wednesdayOpen;
    }

    public Integer getWednesdayClose() {
        return wednesdayClose;
    }

    public void setWednesdayClose(Integer wednesdayClose) {
        this.wednesdayClose = wednesdayClose;
    }

    public Integer getThursdayOpen() {
        return thursdayOpen;
    }

    public void setThursdayOpen(Integer thursdayOpen) {
        this.thursdayOpen = thursdayOpen;
    }

    public Integer getThursdayClose() {
        return thursdayClose;
    }

    public void setThursdayClose(Integer thursdayClose) {
        this.thursdayClose = thursdayClose;
    }

    public Integer getFridayOpen() {
        return fridayOpen;
    }

    public void setFridayOpen(Integer fridayOpen) {
        this.fridayOpen = fridayOpen;
    }

    public Integer getFridayClose() {
        return fridayClose;
    }

    public void setFridayClose(Integer fridayClose) {
        this.fridayClose = fridayClose;
    }

    public Integer getSaturdayOpen() {
        return saturdayOpen;
    }

    public void setSaturdayOpen(Integer saturdayOpen) {
        this.saturdayOpen = saturdayOpen;
    }

    public Integer getSaturdayClose() {
        return saturdayClose;
    }

    public void setSaturdayClose(Integer saturdayClose) {
        this.saturdayClose = saturdayClose;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(Integer storeNo) {
        this.storeNo = storeNo;
    }

}

package com.arhiser.alcobrowser.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
public class Store implements Parcelable{

    @PrimaryKey
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

    public static final Creator<Store> CREATOR = new Creator<Store>() {
        @Override
        public Store createFromParcel(Parcel in) {
            return new Store(in);
        }

        @Override
        public Store[] newArray(int size) {
            return new Store[size];
        }
    };

    protected Store(Parcel in) {
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readInt();
        }
        byte tmpIsDead = in.readByte();
        isDead = tmpIsDead == 0 ? null : tmpIsDead == 1;
        name = in.readString();
        tags = in.readString();
        addressLine1 = in.readString();
        addressLine2 = in.readString();
        city = in.readString();
        postalCode = in.readString();
        telephone = in.readString();
        fax = in.readString();
        if (in.readByte() == 0) {
            latitude = null;
        } else {
            latitude = in.readDouble();
        }
        if (in.readByte() == 0) {
            longitude = null;
        } else {
            longitude = in.readDouble();
        }
        if (in.readByte() == 0) {
            productsCount = null;
        } else {
            productsCount = in.readInt();
        }
        if (in.readByte() == 0) {
            inventoryCount = null;
        } else {
            inventoryCount = in.readInt();
        }
        if (in.readByte() == 0) {
            inventoryPriceInCents = null;
        } else {
            inventoryPriceInCents = in.readInt();
        }
        if (in.readByte() == 0) {
            inventoryVolumeInMilliliters = null;
        } else {
            inventoryVolumeInMilliliters = in.readInt();
        }
        byte tmpHasWheelchairAccessability = in.readByte();
        hasWheelchairAccessability = tmpHasWheelchairAccessability == 0 ? null : tmpHasWheelchairAccessability == 1;
        byte tmpHasBilingualServices = in.readByte();
        hasBilingualServices = tmpHasBilingualServices == 0 ? null : tmpHasBilingualServices == 1;
        byte tmpHasProductConsultant = in.readByte();
        hasProductConsultant = tmpHasProductConsultant == 0 ? null : tmpHasProductConsultant == 1;
        byte tmpHasTastingBar = in.readByte();
        hasTastingBar = tmpHasTastingBar == 0 ? null : tmpHasTastingBar == 1;
        byte tmpHasBeerColdRoom = in.readByte();
        hasBeerColdRoom = tmpHasBeerColdRoom == 0 ? null : tmpHasBeerColdRoom == 1;
        byte tmpHasSpecialOccasionPermits = in.readByte();
        hasSpecialOccasionPermits = tmpHasSpecialOccasionPermits == 0 ? null : tmpHasSpecialOccasionPermits == 1;
        byte tmpHasVintagesCorner = in.readByte();
        hasVintagesCorner = tmpHasVintagesCorner == 0 ? null : tmpHasVintagesCorner == 1;
        byte tmpHasParking = in.readByte();
        hasParking = tmpHasParking == 0 ? null : tmpHasParking == 1;
        byte tmpHasTransitAccess = in.readByte();
        hasTransitAccess = tmpHasTransitAccess == 0 ? null : tmpHasTransitAccess == 1;
        if (in.readByte() == 0) {
            sundayOpen = null;
        } else {
            sundayOpen = in.readInt();
        }
        if (in.readByte() == 0) {
            sundayClose = null;
        } else {
            sundayClose = in.readInt();
        }
        if (in.readByte() == 0) {
            mondayOpen = null;
        } else {
            mondayOpen = in.readInt();
        }
        if (in.readByte() == 0) {
            mondayClose = null;
        } else {
            mondayClose = in.readInt();
        }
        if (in.readByte() == 0) {
            tuesdayOpen = null;
        } else {
            tuesdayOpen = in.readInt();
        }
        if (in.readByte() == 0) {
            tuesdayClose = null;
        } else {
            tuesdayClose = in.readInt();
        }
        if (in.readByte() == 0) {
            wednesdayOpen = null;
        } else {
            wednesdayOpen = in.readInt();
        }
        if (in.readByte() == 0) {
            wednesdayClose = null;
        } else {
            wednesdayClose = in.readInt();
        }
        if (in.readByte() == 0) {
            thursdayOpen = null;
        } else {
            thursdayOpen = in.readInt();
        }
        if (in.readByte() == 0) {
            thursdayClose = null;
        } else {
            thursdayClose = in.readInt();
        }
        if (in.readByte() == 0) {
            fridayOpen = null;
        } else {
            fridayOpen = in.readInt();
        }
        if (in.readByte() == 0) {
            fridayClose = null;
        } else {
            fridayClose = in.readInt();
        }
        if (in.readByte() == 0) {
            saturdayOpen = null;
        } else {
            saturdayOpen = in.readInt();
        }
        if (in.readByte() == 0) {
            saturdayClose = null;
        } else {
            saturdayClose = in.readInt();
        }
        updatedAt = in.readString();
        if (in.readByte() == 0) {
            storeNo = null;
        } else {
            storeNo = in.readInt();
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(id);
        }
        dest.writeByte((byte) (isDead == null ? 0 : isDead ? 1 : 2));
        dest.writeString(name);
        dest.writeString(tags);
        dest.writeString(addressLine1);
        dest.writeString(addressLine2);
        dest.writeString(city);
        dest.writeString(postalCode);
        dest.writeString(telephone);
        dest.writeString(fax);
        if (latitude == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(latitude);
        }
        if (longitude == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(longitude);
        }
        if (productsCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(productsCount);
        }
        if (inventoryCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(inventoryCount);
        }
        if (inventoryPriceInCents == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(inventoryPriceInCents);
        }
        if (inventoryVolumeInMilliliters == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(inventoryVolumeInMilliliters);
        }
        dest.writeByte((byte) (hasWheelchairAccessability == null ? 0 : hasWheelchairAccessability ? 1 : 2));
        dest.writeByte((byte) (hasBilingualServices == null ? 0 : hasBilingualServices ? 1 : 2));
        dest.writeByte((byte) (hasProductConsultant == null ? 0 : hasProductConsultant ? 1 : 2));
        dest.writeByte((byte) (hasTastingBar == null ? 0 : hasTastingBar ? 1 : 2));
        dest.writeByte((byte) (hasBeerColdRoom == null ? 0 : hasBeerColdRoom ? 1 : 2));
        dest.writeByte((byte) (hasSpecialOccasionPermits == null ? 0 : hasSpecialOccasionPermits ? 1 : 2));
        dest.writeByte((byte) (hasVintagesCorner == null ? 0 : hasVintagesCorner ? 1 : 2));
        dest.writeByte((byte) (hasParking == null ? 0 : hasParking ? 1 : 2));
        dest.writeByte((byte) (hasTransitAccess == null ? 0 : hasTransitAccess ? 1 : 2));
        if (sundayOpen == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(sundayOpen);
        }
        if (sundayClose == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(sundayClose);
        }
        if (mondayOpen == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(mondayOpen);
        }
        if (mondayClose == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(mondayClose);
        }
        if (tuesdayOpen == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(tuesdayOpen);
        }
        if (tuesdayClose == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(tuesdayClose);
        }
        if (wednesdayOpen == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(wednesdayOpen);
        }
        if (wednesdayClose == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(wednesdayClose);
        }
        if (thursdayOpen == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(thursdayOpen);
        }
        if (thursdayClose == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(thursdayClose);
        }
        if (fridayOpen == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(fridayOpen);
        }
        if (fridayClose == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(fridayClose);
        }
        if (saturdayOpen == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(saturdayOpen);
        }
        if (saturdayClose == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(saturdayClose);
        }
        dest.writeString(updatedAt);
        if (storeNo == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(storeNo);
        }
    }

//    public Store() {
//    }

    public Store(Integer id, Boolean isDead, String name, String tags, String addressLine1, String addressLine2, String city, String postalCode, String telephone, String fax, Double latitude, Double longitude, Integer productsCount, Integer inventoryCount, Integer inventoryPriceInCents, Integer inventoryVolumeInMilliliters, Boolean hasWheelchairAccessability, Boolean hasBilingualServices, Boolean hasProductConsultant, Boolean hasTastingBar, Boolean hasBeerColdRoom, Boolean hasSpecialOccasionPermits, Boolean hasVintagesCorner, Boolean hasParking, Boolean hasTransitAccess, Integer sundayOpen, Integer sundayClose, Integer mondayOpen, Integer mondayClose, Integer tuesdayOpen, Integer tuesdayClose, Integer wednesdayOpen, Integer wednesdayClose, Integer thursdayOpen, Integer thursdayClose, Integer fridayOpen, Integer fridayClose, Integer saturdayOpen, Integer saturdayClose, String updatedAt, Integer storeNo) {
        this.id = id;
        this.isDead = isDead;
        this.name = name;
        this.tags = tags;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.postalCode = postalCode;
        this.telephone = telephone;
        this.fax = fax;
        this.latitude = latitude;
        this.longitude = longitude;
        this.productsCount = productsCount;
        this.inventoryCount = inventoryCount;
        this.inventoryPriceInCents = inventoryPriceInCents;
        this.inventoryVolumeInMilliliters = inventoryVolumeInMilliliters;
        this.hasWheelchairAccessability = hasWheelchairAccessability;
        this.hasBilingualServices = hasBilingualServices;
        this.hasProductConsultant = hasProductConsultant;
        this.hasTastingBar = hasTastingBar;
        this.hasBeerColdRoom = hasBeerColdRoom;
        this.hasSpecialOccasionPermits = hasSpecialOccasionPermits;
        this.hasVintagesCorner = hasVintagesCorner;
        this.hasParking = hasParking;
        this.hasTransitAccess = hasTransitAccess;
        this.sundayOpen = sundayOpen;
        this.sundayClose = sundayClose;
        this.mondayOpen = mondayOpen;
        this.mondayClose = mondayClose;
        this.tuesdayOpen = tuesdayOpen;
        this.tuesdayClose = tuesdayClose;
        this.wednesdayOpen = wednesdayOpen;
        this.wednesdayClose = wednesdayClose;
        this.thursdayOpen = thursdayOpen;
        this.thursdayClose = thursdayClose;
        this.fridayOpen = fridayOpen;
        this.fridayClose = fridayClose;
        this.saturdayOpen = saturdayOpen;
        this.saturdayClose = saturdayClose;
        this.updatedAt = updatedAt;
        this.storeNo = storeNo;
    }
}

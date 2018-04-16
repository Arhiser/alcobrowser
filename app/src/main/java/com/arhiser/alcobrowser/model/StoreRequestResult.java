package com.arhiser.alcobrowser.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StoreRequestResult implements Parcelable {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("pager")
    @Expose
    private Pager pager;
    @SerializedName("result")
    @Expose
    private List<Store> result = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Pager getPager() {
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }

    public List<Store> getResult() {
        return result;
    }

    public void setResult(List<Store> result) {
        this.result = result;
    }

    protected StoreRequestResult(Parcel in) {
        if (in.readByte() == 0) {
            status = null;
        } else {
            status = in.readInt();
        }
        pager = in.readParcelable(Pager.class.getClassLoader());
        result = in.createTypedArrayList(Store.CREATOR);
    }

    public static final Creator<StoreRequestResult> CREATOR = new Creator<StoreRequestResult>() {
        @Override
        public StoreRequestResult createFromParcel(Parcel in) {
            return new StoreRequestResult(in);
        }

        @Override
        public StoreRequestResult[] newArray(int size) {
            return new StoreRequestResult[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (status == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(status);
        }
        dest.writeParcelable(pager, flags);
        dest.writeTypedList(result);
    }
}

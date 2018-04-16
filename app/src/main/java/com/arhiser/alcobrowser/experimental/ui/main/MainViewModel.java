package com.arhiser.alcobrowser.experimental.ui.main;

import android.os.Parcel;
import android.os.Parcelable;

import com.arhiser.alcobrowser.experimental.components.viewmodel.ViewModel;
import com.arhiser.alcobrowser.model.Pager;
import com.arhiser.alcobrowser.model.Store;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel implements Parcelable {

    private Pager pager;
    private List<Store> stores = new ArrayList<>();
    private boolean isLoadingInProgress = false;

    public MainViewModel() {
    }

    protected MainViewModel(Parcel in) {
        pager = in.readParcelable(Pager.class.getClassLoader());
        stores = in.createTypedArrayList(Store.CREATOR);
    }

    public boolean isLoadingInProgress() {
        return isLoadingInProgress;
    }

    public void setLoadingInProgress(boolean loadingInProgress) {
        isLoadingInProgress = loadingInProgress;
    }

    public Pager getPager() {
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }

    public List<Store> getStores() {
        return stores;
    }

    public static final Creator<MainViewModel> CREATOR = new Creator<MainViewModel>() {
        @Override
        public MainViewModel createFromParcel(Parcel in) {
            return new MainViewModel(in);
        }

        @Override
        public MainViewModel[] newArray(int size) {
            return new MainViewModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(pager, flags);
        dest.writeTypedList(stores);
    }
}

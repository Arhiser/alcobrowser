package com.arhiser.alcobrowser.network.service;

import com.arhiser.alcobrowser.model.StoreRequestResult;

import java.util.Map;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface Api {

    @GET("stores")
    Single<StoreRequestResult> getStores(@QueryMap Map<String, String> params);
}

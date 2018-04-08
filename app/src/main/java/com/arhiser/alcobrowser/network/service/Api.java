package com.arhiser.alcobrowser.network.service;

import com.arhiser.alcobrowser.model.StoreRequestResult;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("stores")
    Single<StoreRequestResult> getStores(@Query("page") int page, @Query("per_page") int south);
}

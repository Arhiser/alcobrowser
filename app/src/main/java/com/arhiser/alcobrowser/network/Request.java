package com.arhiser.alcobrowser.network;

import com.arhiser.alcobrowser.App;
import com.arhiser.alcobrowser.model.StoreRequestResult;
import com.arhiser.alcobrowser.network.service.RetrofitService;

import java.util.HashMap;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class Request {

    public static Single<StoreRequestResult> getStores(int page, int pageSize) {
        HashMap<String, String> params = new HashMap<>();
        params.put("page", Integer.toString(page));
        params.put("per_page", Integer.toString(pageSize));

        return RetrofitService.getApi().getStores(params)
                .subscribeOn(Schedulers.io())
                .doOnSuccess(result -> App.getInstance().getDatabase().storesDao().insert(result.getResult()))
                .observeOn(AndroidSchedulers.mainThread());
    }
}

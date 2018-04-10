package com.arhiser.alcobrowser;

import android.app.Application;

import com.arhiser.alcobrowser.network.service.RetrofitService;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        RetrofitService.init();
    }
}

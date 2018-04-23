package com.arhiser.alcobrowser;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.arhiser.alcobrowser.dao.AppDatabase;
import com.arhiser.alcobrowser.network.service.RetrofitService;

public class App extends Application {

    public static  App instance;

    private AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();

        RetrofitService.init();

        instance = this;
        database = Room.databaseBuilder(this, AppDatabase.class, "database").build();
    }

    public static App getInstance() {
        return instance;
    }

    public AppDatabase getDatabase() {
        return database;
    }
}

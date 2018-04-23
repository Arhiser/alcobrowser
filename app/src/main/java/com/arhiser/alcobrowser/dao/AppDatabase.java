package com.arhiser.alcobrowser.dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.arhiser.alcobrowser.model.Store;

@Database(entities = {Store.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract StoresDao storesDao();
}

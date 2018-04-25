package com.arhiser.alcobrowser.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.arhiser.alcobrowser.model.Store;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface StoresDao {

    @Query("SELECT * FROM store")
    Single<List<Store>> getAll();

    @Insert
    void insert(List<Store> store);

    @Query("DELETE FROM store")
    void clearTable();

    @Update
    void update(Store store);

    @Delete
    void delete(Store store);
}

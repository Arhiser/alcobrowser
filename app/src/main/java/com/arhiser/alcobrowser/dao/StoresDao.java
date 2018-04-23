package com.arhiser.alcobrowser.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.arhiser.alcobrowser.model.Store;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Maybe;

@Dao
public interface StoresDao {

    @Query("SELECT * FROM store")
    List<Store> getAll();

    @Query("SELECT * FROM store WHERE id = :id")
    Store getById(int id);

    @Insert
    void insert (Store... store);

    @Update
    void update (Store store);

    @Delete
    void delete (Store store);
}

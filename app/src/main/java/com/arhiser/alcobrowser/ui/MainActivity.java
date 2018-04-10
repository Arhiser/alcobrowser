package com.arhiser.alcobrowser.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.arhiser.alcobrowser.R;
import com.arhiser.alcobrowser.model.StoreRequestResult;
import com.arhiser.alcobrowser.network.Request;

import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    Disposable storesRequest = Disposables.empty();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storesRequest = Request.getStores(1, 20).subscribe(
                storeRequestResult -> {
                    // do something with data
                }, error -> {
                    //handle errors
                });

    }

    @Override
    protected void onDestroy() {
        storesRequest.dispose();
        super.onDestroy();
    }
}

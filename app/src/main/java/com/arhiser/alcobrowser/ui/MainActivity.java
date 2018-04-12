package com.arhiser.alcobrowser.ui;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.allattentionhere.fabulousfilter.AAH_FabulousFragment;
import com.arhiser.alcobrowser.R;
import com.arhiser.alcobrowser.adapter.MainAdapter;
import com.arhiser.alcobrowser.model.Store;
import com.arhiser.alcobrowser.network.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;

public class MainActivity extends AppCompatActivity implements AAH_FabulousFragment.Callbacks, IMainView {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private MainAdapter mMainAdapter;
    private HashMap<String, String> map;

    Disposable storesRequest = Disposables.empty();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FilterFragment filter = FilterFragment.newInstance();
                filter.setParentFab(fab);
                filter.show(getSupportFragmentManager(), filter.getTag());
            }
        });

        mRecyclerView = (RecyclerView) findViewById(R.id.main_recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mMainAdapter = new MainAdapter(MainActivity.this);
        mMainAdapter.setOnItemClickListener(MainActivity.this);
        mRecyclerView.setAdapter(mMainAdapter);

        map = new HashMap<>();
        map.put("where", "has_parking");


        storesRequest = Request.getStores(1, 20).subscribe(
                storeRequestResult -> {
                    // do something with data
                    List<Store> storeList = new ArrayList<>();
                    storeList = storeRequestResult.getResult();
                    mMainAdapter.addAll(storeList);

                }, error -> {
                    //handle errors
                });

    }

    @Override
    protected void onDestroy() {
        storesRequest.dispose();
        super.onDestroy();
    }

    @Override
    public void onResult(Object result) {
        Toast.makeText(MainActivity.this, "Here is your result :P", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnItemClick(int position, List<Store> storeList) {
        Toast.makeText(MainActivity.this, "Clicked :D", Toast.LENGTH_SHORT).show();

    }
}

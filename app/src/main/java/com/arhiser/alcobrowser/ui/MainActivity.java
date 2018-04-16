package com.arhiser.alcobrowser.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.allattentionhere.fabulousfilter.AAH_FabulousFragment;
import com.arhiser.alcobrowser.R;
import com.arhiser.alcobrowser.adapter.MainAdapter;
import com.arhiser.alcobrowser.model.Pager;
import com.arhiser.alcobrowser.model.Store;
import com.arhiser.alcobrowser.network.Request;

import java.util.List;

import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;

public class MainActivity extends AppCompatActivity implements AAH_FabulousFragment.Callbacks, IMainView {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private MainAdapter mMainAdapter;
    private ProgressBar progressBarMain;

    private Disposable storesRequest = Disposables.empty();

    private boolean isLoadingInProgress = false;
    private Pager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        progressBarMain = (ProgressBar)findViewById(R.id.progressBarMain);

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

        mMainAdapter = new MainAdapter();
        mMainAdapter.setOnItemClickListener(MainActivity.this);
        mRecyclerView.setAdapter(mMainAdapter);


        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                int visibleItemCount = mLinearLayoutManager.getChildCount();
                int totalItemCount = mLinearLayoutManager.getItemCount();
                int firstVisibleItem = mLinearLayoutManager.findFirstVisibleItemPosition();

                if (!isLoadingInProgress
                        && !isAllLoaded()
                        && (totalItemCount - visibleItemCount) <= (firstVisibleItem + 2)) {
                    loadMore(pager != null ? pager.getCurrentPage() + 1 : 1);
                }
            }
        });

        startLoad();
    }

    private void startLoad() {
        pager = null;
        loadMore(1);
    }

    private void loadMore(int pageNum) {
        isLoadingInProgress = true;
        showProgressView();
        storesRequest = Request.getStores(pageNum, 20).subscribe(
                storeRequestResult -> {
                    mMainAdapter.addAll(storeRequestResult.getResult());
                    isLoadingInProgress = false;
                    hideProgressView();
                    pager = storeRequestResult.getPager();
                }, error -> {
                    isLoadingInProgress = false;
                    showProgressView();
                    //handle errors
                });
    }

    private boolean isAllLoaded() {
        return pager != null && pager.isFinalPage();
    }

    private void showProgressView() {
        //progressBarMain.setVisibility(View.VISIBLE);
        mMainAdapter.setLoading(true);
    }

    private void hideProgressView() {
        mMainAdapter.setLoading(false);
        //progressBarMain.setVisibility(View.GONE);
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
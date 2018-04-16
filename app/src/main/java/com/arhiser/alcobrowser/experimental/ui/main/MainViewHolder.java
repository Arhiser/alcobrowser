package com.arhiser.alcobrowser.experimental.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.arhiser.alcobrowser.R;
import com.arhiser.alcobrowser.adapter.MainAdapter;
import com.arhiser.alcobrowser.experimental.components.view.ViewHolder;

public class MainViewHolder extends ViewHolder<MainViewModel, MainActionController> {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private MainAdapter mMainAdapter;

    private MainViewModel model;

    @Override
    public Class<MainActionController> getControllerClass() {
        return MainActionController.class;
    }

    public MainViewHolder(@NonNull View root, Bundle savedInstanceState) {
        super(root, savedInstanceState);

        mRecyclerView = findById(R.id.main_recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLinearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mMainAdapter = new MainAdapter(getContext());
        //mMainAdapter.setOnItemClickListener();
        mRecyclerView.setAdapter(mMainAdapter);

        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                int visibleItemCount = mLinearLayoutManager.getChildCount();
                int totalItemCount = mLinearLayoutManager.getItemCount();
                int firstVisibleItem = mLinearLayoutManager.findFirstVisibleItemPosition();

                if (model.getPager() != null
                        && !model.isLoadingInProgress()
                        && !model.getPager().isFinalPage()
                        && (totalItemCount - visibleItemCount) <= (firstVisibleItem + 2)) {
                    getActionController().loadMore();
                }
            }
        });
    }

    @Override
    public void onFirstStart() {
        getActionController().startLoading();
    }

    @Override
    public void bind(MainViewModel model) {
        this.model = model;
        if (mMainAdapter.getItemCount() < model.getStores().size()) {
            mMainAdapter.addAll(model.getStores()
                    .subList(mMainAdapter.getItemCount(), model.getStores().size()));
        }
    }

}

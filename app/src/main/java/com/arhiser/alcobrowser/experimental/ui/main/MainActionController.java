package com.arhiser.alcobrowser.experimental.ui.main;

import com.arhiser.alcobrowser.experimental.components.actions.ActionController;
import com.arhiser.alcobrowser.experimental.components.viewmodel.ModelHolder;
import com.arhiser.alcobrowser.model.Pager;
import com.arhiser.alcobrowser.network.Request;

import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;

public class MainActionController extends ActionController {

    protected Disposable storesRequest = Disposables.empty();

    public MainActionController(ModelHolder modelHolder) {
        super(modelHolder);
    }

    public void startLoading() {
        getModel(MainViewModel.class).setPager(null);
        loadMore();
    }

    public void loadMore() {
        getModelForEdit(MainViewModel.class).setLoadingInProgress(true);
        Pager pager = getModel(MainViewModel.class).getPager();
        storesRequest = Request.getStores(pager != null ? pager.getNextPage() : 1, 20).subscribe(
                storeRequestResult -> {
                    MainViewModel model = getModelForEdit(MainViewModel.class);
                    model.setPager(storeRequestResult.getPager());
                    model.getStores().addAll(storeRequestResult.getResult());
                    model.setLoadingInProgress(false);
                }, error -> {
                    MainViewModel model = getModelForEdit(MainViewModel.class);
                    model.setLoadingInProgress(false);
                });
    }

    @Override
    public void onDestroy() {
        storesRequest.dispose();
    }
}

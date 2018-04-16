package com.arhiser.alcobrowser.experimental.ui.main;

import android.os.Bundle;
import android.view.View;

import com.arhiser.alcobrowser.R;
import com.arhiser.alcobrowser.experimental.components.BaseActivity;
import com.arhiser.alcobrowser.experimental.components.actions.ActionController;
import com.arhiser.alcobrowser.experimental.components.viewmodel.ViewModel;

import java.util.Map;

import io.reactivex.subjects.BehaviorSubject;

public class AlternativeMainActivity extends BaseActivity {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void createModels() {
        registerViewModel(new MainViewModel());
    }

    @Override
    protected void createControllers(Map<Class<? extends ViewModel>, BehaviorSubject<ViewModel>> subjects) {
        registerActionController(new MainActionController(this));
    }

    @Override
    protected void createViewHolders(View view, Bundle savedInstanceState, Map<Class<? extends ActionController>, ActionController> controllers) {
        registerViewHolder(MainViewModel.class, new MainViewHolder(view, savedInstanceState));
    }
}

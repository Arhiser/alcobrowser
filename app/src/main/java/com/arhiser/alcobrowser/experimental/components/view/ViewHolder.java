package com.arhiser.alcobrowser.experimental.components.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

import com.arhiser.alcobrowser.experimental.components.actions.ActionController;
import com.arhiser.alcobrowser.experimental.components.viewmodel.ViewModel;

public abstract class ViewHolder<T extends ViewModel, I extends ActionController> {

    private View root;
    private I actionController;

    public abstract void bind(T model);

    public abstract Class<I> getControllerClass();

    public ViewHolder(@NonNull View root, Bundle savedInstanceState, I actionController) {
        this.root = root;
        this.actionController = actionController;
    }

    public ViewHolder(@NonNull View root, Bundle savedInstanceState) {
        this.root = root;
        this.actionController = actionController;
    }

    public void attachActionController(I actionController) {
        this.actionController = actionController;
    }

    public I getActionController() {
        return actionController;
    }

    public void onFirstStart() {

    }

    protected Activity getContext() {
        return (Activity) root.getContext();
    }

    protected <V extends View> V findById(int id) {
        return (V)getContext().findViewById(id);
    }
}

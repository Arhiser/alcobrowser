package com.arhiser.alcobrowser.experimental.components.actions;

import com.arhiser.alcobrowser.experimental.components.viewmodel.ModelHolder;
import com.arhiser.alcobrowser.experimental.components.viewmodel.ViewModel;

public abstract class ActionController {

    protected ModelHolder modelHolder;

    public ActionController(ModelHolder modelHolder) {
        this.modelHolder = modelHolder;
    }

    public void onDestroy() {

    }

    protected <M extends ViewModel> M getModel(Class<M> clazz) {
        return modelHolder.getModel(clazz);
    }

    protected <M extends ViewModel> M getModelForEdit(Class<M> clazz) {
        return modelHolder.getModelToEdit(clazz);
    }
}

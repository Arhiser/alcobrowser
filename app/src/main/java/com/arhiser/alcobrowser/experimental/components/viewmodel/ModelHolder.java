package com.arhiser.alcobrowser.experimental.components.viewmodel;


import io.reactivex.functions.Consumer;

public interface ModelHolder {

    <T extends ViewModel> T getModel(Class<T> clazz);

    <T extends ViewModel> T getModelToEdit(Class<T> clazz);

    <T extends ViewModel> void subscribeForModel(Class<T> clazz, Consumer<T> consumer);
}

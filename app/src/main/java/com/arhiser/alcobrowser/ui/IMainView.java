package com.arhiser.alcobrowser.ui;

import com.arhiser.alcobrowser.model.Store;

import java.util.List;

public interface IMainView {

    void OnItemClick(int position, List<Store> storeList);
}

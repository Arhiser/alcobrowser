package com.arhiser.alcobrowser.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.arhiser.alcobrowser.R;
import com.arhiser.alcobrowser.model.Store;
import com.arhiser.alcobrowser.ui.IMainView;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final int VIEW_TYPE_ITEM = 0;
    private final int VIEW_TYPE_LOADING = 1;

    private Context context;
    private List<Store> storeList = new ArrayList<>();
    private IMainView mListiner;

    public void setOnItemClickListener(IMainView mListiner) {
        this.mListiner = mListiner;
    }

    public MainAdapter(Context context) {
        this.context = context;
        setHasStableIds(true);
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_ITEM) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.store_item, parent, false);
            return new StoreViewHolder(view);
        } else if (viewType == VIEW_TYPE_LOADING) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.loading_item, parent, false);
            return new LoadingViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof StoreViewHolder) {
            Store store = storeList.get(position);

            StoreViewHolder storeViewHolder = (StoreViewHolder) holder;

            String marketName = store.getName();
            String addressFirst = store.getAddressLine1();
            String addressSecond = store.getAddressLine2();
            String city = store.getCity();
            String postalCode = store.getPostalCode();
            String telNumber = store.getTelephone();
            String faxNumber = store.getFax();

            storeViewHolder.mStoreName.setText(marketName);
            storeViewHolder.mAddressFirst.setText(addressFirst);
            if (!TextUtils.isEmpty(addressSecond)) {
                storeViewHolder.mAddressSecond.setVisibility(View.VISIBLE);
                storeViewHolder.mAddressSecond.setText(addressSecond);
            }
            storeViewHolder.mCity.setText(city);
            storeViewHolder.mPostalCode.setText(postalCode);
            storeViewHolder.mTelNumber.setText(telNumber);
            storeViewHolder.mFaxNumber.setText(faxNumber);
        } else if (holder instanceof LoadingViewHolder){
            LoadingViewHolder loadingViewHolder = (LoadingViewHolder) holder;
            loadingViewHolder.progressBar.setIndeterminate(true);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return storeList.get(position) == null ? VIEW_TYPE_LOADING : VIEW_TYPE_ITEM;
    }

    @Override
    public int getItemCount() {
        return storeList == null ? 0 : storeList.size();
    }

    class StoreViewHolder extends RecyclerView.ViewHolder {
        private TextView mStoreName, mAddressFirst, mAddressSecond,
                mCity, mPostalCode, mTelNumber, mFaxNumber;

        public StoreViewHolder(View itemView) {
            super(itemView);

            mStoreName = (TextView) itemView.findViewById(R.id.item_market_name);
            mAddressFirst = (TextView) itemView.findViewById(R.id.item_address_line_1);
            mAddressSecond = (TextView) itemView.findViewById(R.id.item_address_line_2);
            mCity = (TextView) itemView.findViewById(R.id.item_city);
            mPostalCode = (TextView) itemView.findViewById(R.id.item_postal_code);
            mTelNumber = (TextView) itemView.findViewById(R.id.item_tel);
            mFaxNumber = (TextView) itemView.findViewById(R.id.item_fax);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mListiner != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mListiner.OnItemClick(position, storeList);
                        }
                    }
                }
            });
        }
    }

    class LoadingViewHolder extends RecyclerView.ViewHolder {
        public ProgressBar progressBar;

        public LoadingViewHolder(View itemView) {
            super(itemView);

            progressBar = (ProgressBar) itemView.findViewById(R.id.progressBarItem);
        }
    }

    @Override
    public long getItemId(int position) {
        return storeList.get(position).getId();
    }

    public void addAll(List<Store> list) {
        storeList.addAll(list);
        notifyItemRangeInserted(storeList.size() - list.size(), list.size());
    }

}



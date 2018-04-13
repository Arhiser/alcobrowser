package com.arhiser.alcobrowser.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arhiser.alcobrowser.R;
import com.arhiser.alcobrowser.model.Store;
import com.arhiser.alcobrowser.ui.IMainView;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private Context context;
    private List<Store> storeList = new ArrayList<>();
    private IMainView mListiner;

    public void setOnItemClickListener(IMainView mListiner) {
        this.mListiner = mListiner;
    }

    public MainAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        Store store = storeList.get(position);

        String marketName = store.getName();
        String addressFirst = store.getAddressLine1();
        String addressSecond = store.getAddressLine2();
        String city = store.getCity();
        String postalCode = store.getPostalCode();
        String telNumber = store.getTelephone();
        String faxNumber = store.getFax();

        holder.mStoreName.setText(marketName);
        holder.mAddressFirst.setText(addressFirst);
        if (!TextUtils.isEmpty(addressSecond)) {
            holder.mAddressSecond.setVisibility(View.VISIBLE);
            holder.mAddressSecond.setText(addressSecond);
        }
        holder.mCity.setText(city);
        holder.mPostalCode.setText(postalCode);
        holder.mTelNumber.setText(telNumber);
        holder.mFaxNumber.setText(faxNumber);
    }

    @Override
    public int getItemCount() {
        return storeList.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        private TextView mStoreName, mAddressFirst, mAddressSecond,
                mCity, mPostalCode, mTelNumber, mFaxNumber;

        public MainViewHolder(View itemView) {
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

    public void addAll(List<Store> list) {
        storeList.addAll(list);
        notifyDataSetChanged();
    }
}

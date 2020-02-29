package com.quickdeal.quickdealdemo;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    private List<CustomList> userlist;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView detail,detailValues;
        public ImageView imageView,edit;
        private CardView cardView;
        public ViewHolder(View view)
        {
            super(view);
            detail = (TextView)view.findViewById(R.id.details);
            imageView = (ImageView)view.findViewById(R.id.itemicon);
            detailValues = (TextView)view.findViewById(R.id.detailsValue);
            cardView = (CardView) view.findViewById(R.id.cardview);
            edit = (ImageView)view.findViewById(R.id.editing);
        }
    }

    public CustomAdapter(Context context,List<CustomList> userlist) {
        this.context =context;
        this.userlist = userlist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.customlist, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CustomList customList = userlist.get(position);
        holder.imageView.setImageResource(customList.getImageicon());
        holder.detail.setText(customList.getDetail());
        holder.detailValues.setText(customList.getDetailValue());

    }


        @Override
    public int getItemCount() {
        return userlist.size();
    }



}

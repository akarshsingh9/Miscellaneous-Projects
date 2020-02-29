package com.codeinpython.feeds;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CustomViewholder>{

    private List<NewsList> NewsList;
    private Context context, appcontext;




    public static class CustomViewholder extends RecyclerView.ViewHolder{

        public TextView headline, source, timestamp;
        public ImageView newsImage;
        CardView cardView;
        public CustomViewholder(View view)
        {
            super(view);
            headline = (TextView)view.findViewById(R.id.headline);
            source = (TextView)view.findViewById(R.id.sourcename);
            timestamp =(TextView)view.findViewById(R.id.timestamp);
            cardView = (CardView)view.findViewById(R.id.newscard);
            newsImage = (ImageView)view.findViewById(R.id.newsImage);
        }

    }

    public RecyclerAdapter(Context context, Context appcontext, List<NewsList> newsList)
    {
        this.context = context;
        this.NewsList = newsList;
        this.appcontext = appcontext;
    }

    @Override
    public CustomViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.newlist_recycler,parent,false);
        return new CustomViewholder(view);
    }

    @Override
    public void onBindViewHolder(final CustomViewholder holder, int position) {
        final com.codeinpython.feeds.NewsList newsList = NewsList.get(position);


        Glide.with(context).load(newsList.getNewsImage()).into(holder.newsImage);

        holder.headline.setText(newsList.getHeadline());
        holder.source.setText(newsList.getSource());
        holder.timestamp.setText(newsList.getTimestamp());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),NewsWebview.class);
                intent.putExtra("url",newsList.getNewsurl());
                view.getContext().startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return NewsList.size();
    }
}


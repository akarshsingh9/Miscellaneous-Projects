package com.codeinpython.feeds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerAdapter newsAdapter;
    private RecyclerView newsRecycler;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsRecycler = (RecyclerView)findViewById(R.id.news);
        mLayoutManager = new LinearLayoutManager(this);
        newsRecycler.setLayoutManager(mLayoutManager);

        String url = "https://newsapi.org/v1/articles?source=techcrunch&apiKey=f8b68281b20045f29a1a2ed62f7884fb";

        final List<NewsList> newsLists = new ArrayList<>();




        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {

                    String source = response.getString("source");
                    JSONArray arr = response.getJSONArray("articles");
                    String title, timestamp, imageurl, newsurl;
                    for (int i = 1; i < 11; i++) {
                        JSONObject object = arr.getJSONObject(i);
                        title = object.getString("title");
                        timestamp = object.getString("publishedAt");
                        imageurl = object.getString("urlToImage");
                        newsurl = object.getString("url");
                        NewsList list = new NewsList(imageurl, title, source, timestamp, newsurl);
                        newsLists.add(list);
                        newsAdapter = new RecyclerAdapter(MainActivity.this, getApplicationContext(), newsLists);
                        newsRecycler.setAdapter(newsAdapter);
                        //newsAdapter.notifyDataSetChanged();


                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        SingletonClass.getInstance(getApplicationContext()).addToRequestQueue(jsonObjectRequest);

    }
}

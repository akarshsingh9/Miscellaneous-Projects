package com.codeinpython.feeds;


import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

public class SingletonClass {

    private static SingletonClass mInstance;
    private RequestQueue mRequestQueue;
    private static Context mContext;
    //private ImageLoader mImageLoader;

    private SingletonClass(Context context)
    {
        mContext = context;
        mRequestQueue = getRequestQueue();


    }

    public static synchronized SingletonClass getInstance(Context context)
    {
        if (mInstance == null)
        {
            mInstance = new SingletonClass(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue()
    {
        if (mRequestQueue == null)
        {
            mRequestQueue = Volley.newRequestQueue(mContext.getApplicationContext());
        }
        return mRequestQueue;
    }

    public<T> void addToRequestQueue(Request<T> request)
    {
        getRequestQueue().add(request);
    }

   /* public ImageLoader getImageLoader()
    {
        return mImageLoader;
    }
*/
}


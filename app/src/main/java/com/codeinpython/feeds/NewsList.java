package com.codeinpython.feeds;

/**
 * Created by Akarsh Singh on 04-11-2017.
 */

public class NewsList {
    private String headline;
    private String newsImage;
    private String source;
    private String timestamp;
    private String newsurl;

    NewsList(String newsImage, String headline, String source, String timestamp, String newsurl)
    {
        this.newsImage = newsImage;
        this.headline = headline;
        this.source = source;
        this.timestamp = timestamp;
        this.newsurl = newsurl;
    }

    String getNewsImage()
    {
        return newsImage;
    }
    String getHeadline()
    {
        return headline;
    }
    String getSource()
    {
        return source;
    }
    String getTimestamp()
    {
        return timestamp;
    }
    String getNewsurl()
    {
        return newsurl;
    }
}

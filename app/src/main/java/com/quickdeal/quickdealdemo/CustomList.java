package com.quickdeal.quickdealdemo;


public class CustomList {

    private  int imageicon;
    private String detail;
    private String detailValue;

    CustomList(int imageicon, String detail, String detailValue)
    {
        this.imageicon = imageicon;
        this.detail = detail;
        this.detailValue = detailValue;
    }

    public int getImageicon() {
        return imageicon;
    }

    public String getDetail() {
        return detail;
    }

    public String getDetailValue() {
        return detailValue;
    }


}

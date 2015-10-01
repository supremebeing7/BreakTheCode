package com.markjlehman.breakthecode.models;

public class Partner {
    private String mName;
    private String mDescription;
    private int mImage;
    private String mWebsite;

    public Partner(String mName, String mDescription, String mWebsite, int mImage) {
        this.mName = mName;
        this.mDescription = mDescription;
        this.mImage = mImage;
        this.mWebsite = mWebsite;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public void setmWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }
}

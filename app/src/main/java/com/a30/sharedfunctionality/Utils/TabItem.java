package com.a30.sharedfunctionality.Utils;

public class TabItem {
    public String mTitle;
    public Class mFragmentClass;

    public TabItem(String title, Class fragmentClass){
        mTitle = title;
        mFragmentClass = fragmentClass;
    }
}

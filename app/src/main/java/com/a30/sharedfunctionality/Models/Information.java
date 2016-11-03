package com.a30.sharedfunctionality.Models;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Information {
    public String key;
    public String title;
    public String description;
    public String link;

    public Information() { }

    public Information(String title, String link, String description) {
        this.title = title;
        this.link = link;
        this.description = description;
    }
}

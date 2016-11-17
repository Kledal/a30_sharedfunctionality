package com.a30.sharedfunctionality.Models;

import java.util.Calendar;

public class Food {
    public String childId;
    public long createdAt;
    public String createdBy;

    public SchemeRow probeFood;
    public SchemeRow fmProtein;
    public SchemeRow heatMilk;
    public SchemeRow vitamins;
    public SchemeRow checkProbe;
    public String comment;

    public Food() {
        createdAt = Calendar.getInstance().getTimeInMillis();
    }

}

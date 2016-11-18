package com.a30.sharedfunctionality.Models;

import java.util.Calendar;

public class Food extends BaseSchema {
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

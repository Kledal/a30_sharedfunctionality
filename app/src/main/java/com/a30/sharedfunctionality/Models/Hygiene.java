package com.a30.sharedfunctionality.Models;

import java.util.Calendar;

public class Hygiene {
    public SchemeRow diaperChange;
    public SchemeRow dailyWash;
    public SchemeRow bath;
    public SchemeRow dailyCleanMasks;
    public SchemeRow dailyCleanCradle;
    public String childId;
    public long createdAt;
    public String createdBy;

    public Hygiene() {
        createdAt = Calendar.getInstance().getTimeInMillis();
    }
}

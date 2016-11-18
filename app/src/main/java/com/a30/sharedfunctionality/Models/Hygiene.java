package com.a30.sharedfunctionality.Models;

import java.util.Calendar;

public class Hygiene extends BaseSchema {
    public SchemeRow diaperChange;
    public SchemeRow dailyWash;
    public SchemeRow bath;
    public SchemeRow dailyCleanMasks;
    public SchemeRow dailyCleanCradle;
    public String comment;

    public Hygiene() {
        createdAt = Calendar.getInstance().getTimeInMillis();
    }
}

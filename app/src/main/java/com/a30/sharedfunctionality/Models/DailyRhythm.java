package com.a30.sharedfunctionality.Models;

import java.util.Calendar;

public class DailyRhythm extends BaseSchema {
    public String dailyRhythm;

    public DailyRhythm() {
        createdAt = Calendar.getInstance().getTimeInMillis();
    }
}

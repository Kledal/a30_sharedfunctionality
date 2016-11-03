package com.a30.sharedfunctionality.Models;


import com.alamkanak.weekview.WeekViewEvent;

import java.util.Calendar;

public class CalendarEvent {
    public long startTime;
    public long endTime;
    public String name;

    public WeekViewEvent toWeekViewEvent(String id) {
        Calendar start = Calendar.getInstance();
        start.setTimeInMillis(startTime);

        Calendar end = Calendar.getInstance();
        end.setTimeInMillis(endTime);

        WeekViewEvent weekViewEvent = new WeekViewEvent(id, name, start, end);

        return weekViewEvent;
    }
}

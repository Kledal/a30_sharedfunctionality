package com.a30.sharedfunctionality.Utils;

import android.app.Activity;
import android.content.Intent;


public class Navigation {
    public static void redirectWithoutHistory(Activity activity, Class toKlass) {
        Intent intent = new Intent(activity, toKlass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        activity.startActivity(intent);
    }

    public static void gotoActivity(Activity activity, Class toActivity) {
        Intent intent = new Intent(activity, toActivity);
        activity.startActivity(intent);
    }
}

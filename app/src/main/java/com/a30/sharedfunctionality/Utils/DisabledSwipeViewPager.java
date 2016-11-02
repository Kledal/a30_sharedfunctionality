package com.a30.sharedfunctionality.Utils;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class DisabledSwipeViewPager extends ViewPager {

    private boolean enabled;

    public DisabledSwipeViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.enabled = false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (this.enabled) {
            return super.onTouchEvent(event);
        }

        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.enabled) {
            return super.onInterceptTouchEvent(event);
        }

        return false;
    }
}

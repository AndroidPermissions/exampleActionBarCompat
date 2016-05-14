package com.example.android.actionbarcompat.styled;

import android.location.LocationManager;

/**
 * Created by nelsonni on 5/9/16.
 */
public class MyGPSLocation {

    private MainActivity mainActivity;

    public MyGPSLocation(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void dangerous() {
        LocationManager manager = mainActivity.getSystemService(LocationManager.class);
        manager.addGpsStatusListener(null);
    }
}

package com.example.locationdefaultcode;

import android.content.Context;
import android.location.Location;

import java.text.DateFormat;
import java.util.Date;

public class LocationUtil {

    static final String KEY_REQUESTING_LOCATION_UPDATES = "requesting_locaction_updates";

    static String getLocationText(Location location) {
        return location == null ? "Unknown location" :
                "(" + location.getLatitude() + ", " + location.getLongitude() + ")";
    }

    static String getLocationTitle(Context context) {
        return context.getString(R.string.location_updated,
                DateFormat.getDateTimeInstance().format(new Date()));
    }
}

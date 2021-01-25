package com.example.locationdefaultcode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.widget.Toast;

public class LocationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Location location = intent.getParcelableExtra(LocationService.EXTRA_LOCATION);
        if (location != null) {
            Toast.makeText(context, LocationUtil.getLocationText(location),
                    Toast.LENGTH_SHORT).show();
        }
    }

}
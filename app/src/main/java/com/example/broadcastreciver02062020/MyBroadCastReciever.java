package com.example.broadcastreciver02062020;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class MyBroadCastReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connMgr = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        android.net.NetworkInfo wifi = connMgr
                .getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        final android.net.NetworkInfo mobile = connMgr
                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if (wifi.isAvailable()) {
            // Do something
            Toast.makeText(context, "Wifi connect", Toast.LENGTH_SHORT).show();
        } else if (mobile.isAvailable()){
            Toast.makeText(context, "mobile connect", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Disconnect", Toast.LENGTH_SHORT).show();
        }
    }
}

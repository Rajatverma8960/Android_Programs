package com.example.rajat.wifi_switch;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   NetworkInfo wifiCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ConnectivityManager connectionManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        wifiCheck = connectionManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (wifiCheck.isConnected())
        {
            // Do whatever here
            WifiManager wifi= (WifiManager)getSystemService(Context.WIFI_SERVICE);
            wifi.setWifiEnabled(false);
            Toast.makeText(getApplicationContext(),"wifi Off",Toast.LENGTH_SHORT).show();
        }
        else
        {
            WifiManager wifi= (WifiManager) getSystemService(Context.WIFI_SERVICE);
            wifi.setWifiEnabled(true);
            Toast.makeText(getApplicationContext(),"wifi On",Toast.LENGTH_SHORT).show();
        }
        finish();

    }
}

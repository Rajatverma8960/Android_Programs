package com.example.rajat.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickFunction(View view)
    {

        Log.i("info","Button Pressed");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("info", "Activity Started");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i("info", "Activity Restarted");
    }

    @Override
    protected void onResume()
            {
                super.onResume();
                Log.i("info","Activity Resumed");
            }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("info", "The onPause() event");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("info", "The onStop() event");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("info", "The onDestroy() event");
8    }

}

package com.example.rajat.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        Thread thread=new Thread(new Runnable(){

            @Override
            public void run() {
                for(int i=0;i<=100;i=i+10)
                {
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        Toast.makeText(getApplicationContext(),"over",Toast.LENGTH_SHORT).show();
                        e.printStackTrace();
                    }
                    // set the progress
                    progressBar.setProgress(i);

                }
            }
        });

    }
}

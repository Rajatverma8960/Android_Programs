package com.example.rajat.movieratingapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button btn;
    EditText numTxt;
    String sNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn = (Button) findViewById(R.id.dial);
        numTxt = (EditText) findViewById(R.id.Mobnum);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CALL);
                sNum = numTxt.getText().toString();

                if(sNum.trim().isEmpty())
                {
                    i.setData(Uri.parse("tel:998638834"));
                }
                else
                {
                    i.setData(Uri.parse("tel:"+sNum));
                }
                if (ActivityCompat.checkSelfPermission(Main2Activity.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    Toast.makeText(Main2Activity.this,"Please grant the permission to call",Toast.LENGTH_SHORT).show();
                    requestPermission();
                }
                else {
                    startActivity(i);
                }
            }

            private void requestPermission()
            {
                ActivityCompat.requestPermissions(Main2Activity.this, new String[]{Manifest.permission.CALL_PHONE},1);
            }
        });
    }
}

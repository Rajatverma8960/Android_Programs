package com.example.rajat.movieratingapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button)findViewById(R.id.Gmail);
        btn2= (Button)findViewById(R.id.Call);
        btn3= (Button)findViewById(R.id.browser);
        btn4= (Button)findViewById(R.id.Map);

        Drawable background = btn2.getBackground();
        background.setAlpha(120);


        //for mail
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("email"));
                String[] s={"Rajatverma8960@gmail.com"};
                i.putExtra(Intent.EXTRA_EMAIL,s);
                i.putExtra(Intent.EXTRA_SUBJECT,"This is mail from Rajat");
                i.putExtra(Intent.EXTRA_TEXT,"Hello how are u?");
                i.setType("message/rfc822");
                Intent chooser = Intent.createChooser(i,"Launch Email");
                startActivity(chooser);
            }
        });

        //for calling
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });

        //for browser
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://medium.com/"));
                startActivity(intent);
            }
        });

        //for Map
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:12.935090,77.602202"));
                Intent chooser = Intent.createChooser(i, "Launch Maps");
                startActivity(chooser);
            }
        });

    }
}

package com.example.rajat.labexam;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    ImageView img1,img2,img3;
    TextView txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        //-------------------------------
        img1=(ImageView)findViewById(R.id.table);
        img2=(ImageView)findViewById(R.id.book);
        img3=(ImageView)findViewById(R.id.laptop);

        txt1=(Button)findViewById(R.id.img1txt);
        txt2=(Button)findViewById(R.id.img2txt);
        txt3=(Button)findViewById(R.id.img3txt);

        registerForContextMenu(txt1);
        registerForContextMenu(txt2);
        registerForContextMenu(txt3);

        //---------------tables
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(i);
            }
        });


        //-------------------books
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Main3Activity.this,Main5Activity.class);
                startActivity(i);
            }
        });

        //-------------------laptops
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(i);
            }
        });

        //-------------text1,text2,text3-------
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Long Press Reguired",Toast.LENGTH_SHORT).show();
            }
        });
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Long Press Reguired",Toast.LENGTH_SHORT).show();
            }
        });
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Long Press Reguired",Toast.LENGTH_SHORT).show();
            }
        });
        //----------------------------------
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        return super.onContextItemSelected(item);
    }
}

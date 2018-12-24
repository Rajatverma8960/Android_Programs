package com.example.rajat.labexam;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch sh;
    Button btn1,btn2,btn3,btn4;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //--------------------------------------------------------------

        btn1= (Button)findViewById(R.id.ExistingStudent);
        btn2= (Button)findViewById(R.id.SearchItem);
        btn3= (Button)findViewById(R.id.PassedOutStudents);
        btn4= (Button)findViewById(R.id.popularitem);
        tx = (TextView)findViewById(R.id.moreinfo);


        //---------wifiSwitch----------

        sh=(Switch)findViewById(R.id.wifi_switch);

        sh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sh.isChecked())
                {
                    WifiManager wifi= (WifiManager)getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                    Toast.makeText(getApplicationContext(),"wifi On",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    WifiManager wifi= (WifiManager)getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(false);
                    Toast.makeText(getApplicationContext(),"wifi Off",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //----------exiting
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });

        //-----------Search
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Main3Activity.class);
                startActivity(i);
            }
        });

        //--------------------passed
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });

        //-----------------More Info.-------------------------------------------
        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,popup.class);
                startActivity(intent);
            }
        });

        //-----------------------popular item-------------------------------------------
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main6Activity.class);
                startActivity(intent);
            }
        });
        //------------------------------------------------------------
    }
    //-------------menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.share)
        {
            Toast.makeText(getApplicationContext(),"Share",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.help)
        {
            Toast.makeText(getApplicationContext(),"Help",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.About)
        {
            Toast.makeText(getApplicationContext(),"About",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.feedback)
        {
            Toast.makeText(getApplicationContext(),"feedback",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}

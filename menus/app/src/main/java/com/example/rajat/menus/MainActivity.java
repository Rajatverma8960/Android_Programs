package com.example.rajat.menus;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.commonmenus,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.share)
        {
            Toast.makeText(getApplicationContext(),"Share",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }
        if(id==R.id.attach)
        {
            Toast.makeText(getApplicationContext(),"attach",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }
        if(id==R.id.setting)
        {
            Toast.makeText(getApplicationContext(),"Setting",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this,Main3Activity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}


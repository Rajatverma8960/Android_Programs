package com.example.rajat.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView temp_x = (TextView)findViewById(R.id.temp);
    TextView E_name = (TextView)findViewById(R.id.email);
    TextView Pass = (TextView)findViewById(R.id.password);
    Button btn_x= (Button)findViewById(R.id.BTN);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn_x.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if((E_name.getText().toString().equals("admin"))&&(Pass.getText().toString().equals("1234")))
                 {
                     Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                 }
                 else
                 {
                    temp_x.setText("Wrong Attempt");
                 }
             }
         });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.BTN)
        {
            //`your content here
        }

        return super.onOptionsItemSelected(item);
    }
}

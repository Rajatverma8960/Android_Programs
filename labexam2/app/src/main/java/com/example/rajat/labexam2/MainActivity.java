package com.example.rajat.labexam2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {

    String[] country = { "India", "USA", "China", "Japan"};
    String team;
    int curr_run;
    int totalballs=160;
    private RadioGroup over_select;
    private RadioButton id_rb,OVER20,OVER50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin1 = (Spinner) findViewById(R.id.team1);
        Spinner spin2 = (Spinner) findViewById(R.id.team2);
        spin1.setOnItemSelectedListener(MainActivity.this);
        spin2.setOnItemSelectedListener(MainActivity.this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country)
        {
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                /// Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text size 25 dip for ListView each item
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,17);
                tv.setTextColor(Color.WHITE);

                // Return the view
                return view;
            }
        };
        spin1.setAdapter(aa);
        spin2.setAdapter(aa);

        Button login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                startActivity(intent);
            }
        });

        final Button score=(Button)findViewById(R.id.score);
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String scor = String.valueOf(curr_run);
                score.setText(scor);
                //Toast.makeText(MainActivity.this,scor, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        //Toast.makeText(getApplicationContext(),country[i] ,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {
    }

    //------------------------menu

}

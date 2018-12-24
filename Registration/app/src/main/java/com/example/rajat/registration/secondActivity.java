package com.example.rajat.registration;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class secondActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button btn;

    String[] country = { "India", "USA", "China", "Japan", "Other",  };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //--------------------------------------------------------------
        final EditText birth= (EditText) findViewById(R.id.birth);
        final Calendar myCalendar = Calendar.getInstance();
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

            private void updateLabel() {
                String myFormat = "MM/dd/yy"; //In which you need put here
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

                birth.setText(sdf.format(myCalendar.getTime()));
            }

        };


        birth.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(secondActivity.this, date, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        //---------------------------------------------------------------
            Button btn= (Button)findViewById(R.id.sub);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EditText name= (EditText)findViewById(R.id.Name);
                    EditText email= (EditText)findViewById(R.id.Email);
                    EditText mod =(EditText)findViewById(R.id.number);
                    EditText add= (EditText)findViewById(R.id.Address);

                    if(name.getText().toString().equals("")||email.getText().toString().equals("")||mod.getText().toString().equals("")||add.getText().toString().equals(""))
                    {
                        Toast.makeText(getApplicationContext(),"Please Fill All The Fields",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Succesfully Registered",Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(secondActivity.this,thirdActivity.class);
                        startActivity(intent);
                    }

                }
            });

        //-------------------------------------------------------------

        //-------------------------------------------------------------------
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("India");
        categories.add("USA");
        categories.add("Africa");
        categories.add("China");
        categories.add("Nepal");
        categories.add("Bhutan");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_SHORT).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
//---------------------------------------------------
}


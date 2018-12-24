package com.example.rajat.lab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn=(Button)findViewById(R.id.login);
        btn.setOnClickListener(new View.OnClickListener() {
            EditText n1= (EditText)findViewById(R.id.name);
            EditText n2 = (EditText)findViewById(R.id.name2);
            @Override
            public void onClick(View view) {
                if(n1.getText().toString().equals("")||n2.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please Fill All the Fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(intent);
                }

            }
        });
    }
}

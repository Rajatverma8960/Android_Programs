package com.example.rajat.lab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final EditText a1=(EditText)findViewById(R.id.a1);
        final EditText a2=(EditText)findViewById(R.id.a2);
        final EditText a3=(EditText)findViewById(R.id.a3);

        Button btn=(Button)findViewById(R.id.submitx);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a1.getText().toString().equals("")||a2.getText().toString().equals("")||a3.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Please Fill All the Fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent1=new Intent(Main3Activity.this,Main4Activity.class);
                    startActivity(intent1);
                }

            }
        });
    }
}

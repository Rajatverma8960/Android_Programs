package com.example.rajat.labexam2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {

    EditText email,password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn = (Button)findViewById(R.id.loginxx);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
            email=(EditText)findViewById(R.id.email);
            password=(EditText)findViewById(R.id.password);

                String email_x = email.getText().toString();
                String Pass_x = password.getText().toString();

               //if(Pass_x.equals("9335289389") && email_x.equals("rajatroxx480@gmail.com"))
                //{
                    Intent intent = new Intent(secondActivity.this,thirdActivity.class);
                    startActivity(intent);
                //}

            }
        });
    }
}

package com.example.rajat.labexam;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button btn1,btn2;
    EditText roll,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //--------------------------------------
        btn1= (Button)findViewById(R.id.Login);
        btn2=(Button)findViewById(R.id.forget);

        //-------------------login-----------------
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll = (EditText)findViewById(R.id.rollno);
                pass= (EditText)findViewById(R.id.password);
                String roll_no = roll.getText().toString();
                String password = pass.getText().toString();
                if(roll_no.equals("1647238") && password.equals("90670496"))
                {
                    Toast.makeText(getApplicationContext(),"Welcome Rajat",Toast.LENGTH_SHORT).show();
                    Intent i= new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(i);
                }
            }
        });
        //------------forget------------------
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("email"));
                String[] s={"abc@gmail.com"};
                i.putExtra(Intent.EXTRA_EMAIL,s);
                i.putExtra(Intent.EXTRA_SUBJECT,"Forgot Password");
                i.putExtra(Intent.EXTRA_TEXT,"I forgot my password please send me the new password. Thankyou");
                i.setType("message/rfc822"); //setting MIME Email Multipurpose Internet Mail Extensions
                Intent chooser = Intent.createChooser(i,"Launch Email");
                startActivity(chooser);

            }
        });


        //---------------------------------------------
    }
}

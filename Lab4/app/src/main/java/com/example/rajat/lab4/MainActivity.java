package com.example.rajat.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text1,text2;
    TextView result;
    float num1x,num2x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=(EditText)findViewById(R.id.num1);
        text2=(EditText)findViewById(R.id.num2);
        result=(TextView)findViewById(R.id.result);

        findViewById(R.id.add).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1x=Float.parseFloat(text1.getText().toString());
                num2x=Float.parseFloat(text2.getText().toString());
                float output =num1x+num2x;
                //Inform the user the button has been clicked
                result.setText("Addition: "+output);
            }
        });

        findViewById(R.id.sub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1x=Float.parseFloat(text1.getText().toString());
                num2x=Float.parseFloat(text2.getText().toString());
                float output =num1x-num2x;
                result.setText("Subtraction: "+output);
            }
        });

        findViewById(R.id.multi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1x=Float.parseFloat(text1.getText().toString());
                num2x=Float.parseFloat(text2.getText().toString());
                float output =num1x*num2x;
                result.setText("Multiplication: "+output);
            }
        });

        findViewById(R.id.divide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1xx=Float.parseFloat(text1.getText().toString());
                float num2xx=Float.parseFloat(text2.getText().toString());
                if(num1xx>num2xx)
                {
                    float output =num1xx/num2xx;
                    result.setText("Division: "+output);
                }
                else
                {
                    float output =num2xx%num1xx;
                    result.setText("Division Not possible ");
                }
            }
        });

        findViewById(R.id.Mod).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1xx=Float.parseFloat(text1.getText().toString());
                float num2xx=Float.parseFloat(text2.getText().toString());
                if(num1xx>num2xx)
                {
                    float output =num1xx%num2xx;
                    result.setText("Remainder: "+output);
                }
                else
                {
                   // float output =num2xx%num1xx;
                    result.setText("Remainder: "+num1xx);
                }


            }
        });

    }

}

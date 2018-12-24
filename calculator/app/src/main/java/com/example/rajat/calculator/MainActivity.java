package com.example.rajat.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,clr,plus,sub,multi,div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       num1=(EditText)findViewById(R.id.ed1);
       num2=(EditText)findViewById(R.id.ed2);
       result=(TextView)findViewById(R.id.result);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b0=(Button)findViewById(R.id.b0);
        clr=(Button)findViewById(R.id.clr);
        plus=(Button)findViewById(R.id.plus);
        sub=(Button)findViewById(R.id.sub);
        multi=(Button)findViewById(R.id.multi);
        div=(Button)findViewById(R.id.div);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               write("1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                write("2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                write("3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                write("4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                write("5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                write("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                write("7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                write("8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                write("9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                write("0");
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plus();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub();
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiply();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                division();
            }
        });

    }

    public void write( String n)
    {
        if(num1.hasFocus())
        {
           // Toast.makeText(getApplicationContext(),"EditText 1 has focus",Toast.LENGTH_SHORT).show();
            String s = num1.getText().toString() + n;
            num1.setText(s);
        }
        else
        {
            //Toast.makeText(getApplicationContext(),"EditText 2 has focus",Toast.LENGTH_SHORT).show();
            String s = num2.getText().toString() + n;
            num2.setText(s);
        }
    }
    public void clear()
    {
         if(num1.hasFocus())
         {
             num1.setText("");
         }
         else
         {
             num2.setText("");
         }
    }
    public void plus()
    {
            // Toast.makeText(getApplicationContext(),"EditText 1 has focus",Toast.LENGTH_SHORT).show();
            float f1 =Float.parseFloat(num1.getText().toString());
            float f2 =Float.parseFloat(num2.getText().toString());
            //if((f1==null && f2==null)||(f1==null)||(f2==null))

                float sum = f1+f2;
                result.setText("Addition:"+sum);

    }
    public void sub()
    {
        // Toast.makeText(getApplicationContext(),"EditText 1 has focus",Toast.LENGTH_SHORT).show();
        float f1 =Float.parseFloat(num1.getText().toString());
        float f2 =Float.parseFloat(num2.getText().toString());
        float sub = f1-f2;
        //Toast.makeText(getApplicationContext(),sum,Toast.LENGTH_SHORT).show();
        result.setText("Subtraction:"+sub);
    }
    public void multiply()
    {
        float num1x=Float.parseFloat(num1.getText().toString());
        float num2x=Float.parseFloat(num2.getText().toString());
        float output =num1x*num2x;
        result.setText("Multiplication: "+output);
    }
    public void division()
    {
        float num1xx=Float.parseFloat(num1.getText().toString());
        float num2xx=Float.parseFloat(num2.getText().toString());
        if(num1xx>num2xx)
        {
            float output =num1xx/num2xx;
            result.setText("Division: "+output);
        }
        else
        {
            if(num1xx==num2xx)
            {
                result.setText("Division: "+"1");
            }
            else
            {
                result.setText("Division Not possible ");
            }
        }
    }

}

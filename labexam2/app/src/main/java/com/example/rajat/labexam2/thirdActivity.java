package com.example.rajat.labexam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class thirdActivity extends MainActivity{

    TextView overs,runs;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        runs = (TextView)findViewById(R.id.runs);
        overs= (TextView)findViewById(R.id.overs);
        String ball_left=String.valueOf(totalballs);
        overs.setText(ball_left);

        b1= (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr_run= curr_run+1;
                totalballs=totalballs-1;
                String scor = String.valueOf(curr_run);
                runs.setText(scor);
                String ball_left=String.valueOf(totalballs);
                overs.setText(ball_left);
                //Toast.makeText(thirdActivity.this,"1 run", Toast.LENGTH_SHORT).show();
            }
        });
        b2= (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr_run= curr_run+2;
                totalballs=totalballs-1;
                String scor = String.valueOf(curr_run);
                runs.setText(scor);
                String ball_left=String.valueOf(totalballs);
                overs.setText(ball_left);
                //Toast.makeText(thirdActivity.this,"2 runs", Toast.LENGTH_SHORT).show();
            }
        });
        b3= (Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr_run= curr_run+3;
                totalballs=totalballs-1;
                String scor = String.valueOf(curr_run);
                runs.setText(scor);
                String ball_left=String.valueOf(totalballs);
                overs.setText(ball_left);
                //Toast.makeText(thirdActivity.this,"3 runs", Toast.LENGTH_SHORT).show();
            }
        });
        b4= (Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr_run= curr_run+4;
                totalballs=totalballs-1;
                String scor = String.valueOf(curr_run);
                runs.setText(scor);
                String ball_left=String.valueOf(totalballs);
                overs.setText(ball_left);
               // Toast.makeText(thirdActivity.this,"4 runs", Toast.LENGTH_SHORT).show();
            }
        });
        b5= (Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr_run= curr_run+5;
                totalballs=totalballs-1;
                String scor = String.valueOf(curr_run);
                runs.setText(scor);
                String ball_left=String.valueOf(totalballs);
                overs.setText(ball_left);
                //Toast.makeText(thirdActivity.this,"5 runs", Toast.LENGTH_SHORT).show();
            }
        });
        b6= (Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr_run= curr_run+6;
                totalballs=totalballs-1;
                String scor = String.valueOf(curr_run);
                runs.setText(scor);
                String ball_left=String.valueOf(totalballs);
                overs.setText(ball_left);
                //Toast.makeText(thirdActivity.this,"6 runs", Toast.LENGTH_SHORT).show();
            }
        });
        b7= (Button)findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr_run= curr_run+1;
                //totalballs=totalballs-1;
                String scor = String.valueOf(curr_run);
                runs.setText(scor);
                String ball_left=String.valueOf(totalballs);
                overs.setText(ball_left);
                //Toast.makeText(thirdActivity.this,"white", Toast.LENGTH_SHORT).show();
            }
        });
        b8= (Button)findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalballs=totalballs-1;
                String scor = String.valueOf(curr_run);
                runs.setText(scor);
                String ball_left=String.valueOf(totalballs);
                overs.setText(ball_left);
               // Toast.makeText(thirdActivity.this,"Out", Toast.LENGTH_SHORT).show();
            }
        });
        b9= (Button)findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalballs=totalballs-1;
                String scor = String.valueOf(curr_run);
                runs.setText(scor);
                String ball_left=String.valueOf(totalballs);
                overs.setText(ball_left);
                //Toast.makeText(thirdActivity.this,"bounce", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

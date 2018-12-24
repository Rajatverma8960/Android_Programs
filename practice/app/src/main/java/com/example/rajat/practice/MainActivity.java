package com.example.rajat.practice;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //-------------alert Box is created before linking of view to java file-------------------------------------
       AlertDialog.Builder builder=new AlertDialog.Builder(this);
       builder.setMessage("R U Fine?").setCancelable(false)
               .setPositiveButton("yes",new DialogInterface.OnClickListener()
                       {
                           public void onClick(DialogInterface dialog, int id)
                           {
                               finish();
                           }

                       })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                });

       AlertDialog alert=builder.create();
        alert.setTitle("Alert Dialog Example");

        alert.show();
//------------calling the view----------------------
        setContentView(R.layout.activity_main);
//----------------------------------------------------
        //-----------Rating Bar ----------------
         final TextView text_v;
         RatingBar rating_b;
         text_v = (TextView)findViewById(R.id.text_r);
         rating_b = (RatingBar)findViewById(R.id.ratingBar);
         rating_b.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
             @Override
             public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                 text_v.setText(String.valueOf(v));
             }
         });

  //------------------------------ custom toast ------------------

        Button btn=(Button)findViewById(R.id.google);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(MainActivity.this, "I am custom Toast!",Toast.LENGTH_LONG);
                //This'll return the default View of the Toast.
                View toastView = toast.getView();
                /* And now you can get the TextView of the default View of the Toast. */
                TextView toastMessage = (TextView) toastView.findViewById(android.R.id.message);
                toastMessage.setTextSize(25);
                toastMessage.setTextColor(Color.RED);
                // image/icon can be added with the following line of code

                toastMessage.setCompoundDrawablesWithIntrinsicBounds(R.mipmap.ic_launcher, 0, 0, 0);

                toastMessage.setGravity(Gravity.CENTER);

                toastMessage.setCompoundDrawablePadding(16);

                toastView.setBackgroundColor(Color.YELLOW);

                toast.show();
            }
        });
    }
}

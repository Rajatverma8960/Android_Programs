package com.example.rajat.fireglogin;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Pattern;

public class signinActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    EditText email,pass;
    Button signup;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        mAuth = FirebaseAuth.getInstance();

        email = (EditText)findViewById(R.id.email);
        pass = (EditText)findViewById(R.id.password);
        signup = (Button)findViewById(R.id.Singup);
        progressBar = (ProgressBar)findViewById(R.id.progress);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               register();
            }
        });
    }

    public  void register()
    {
       String email_x = email.getText().toString().trim();
       String Pass_x = pass.getText().toString().trim();

       if(email_x.isEmpty())
       {
           email.setError("Please provide the email");
           email.requestFocus();
           return;
       }
       if(!Patterns.EMAIL_ADDRESS.matcher(email_x).matches())
       {
           email.setError("Please provide Correct email");
           email.requestFocus();
           return;
       }
       if(Pass_x.isEmpty())
       {
            pass.setError("Please provide the password");
            pass.requestFocus();
            return;
       }
        if(Pass_x.length()<6)
        {
            pass.setError("Password should be of atleast 6 characters ");
            pass.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.createUserWithEmailAndPassword(email_x,Pass_x).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if(task.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(),"Registration Succesfull",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Some Error occured",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

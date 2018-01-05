package com.app.signin_signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button signInBtn;
    public Button signUpBtn;

    public EditText usernameText;
//    public EditText passwordText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usernameText = (EditText) findViewById(R.id.usernameText);


        signInBtn = (Button) findViewById(R.id.signInBtn);
        signUpBtn = (Button) findViewById(R.id.signupBtn);

        signInBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Login success", Toast.LENGTH_SHORT).show();
            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                signUpClick(view);
            }
        });

    }

    public void signUpClick(View view){
        Intent mintent = new Intent(this, SignUp.class);
        startActivity(mintent);
    }
}

package com.emergenseek.michael.emergenseek;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SignIn extends AppCompatActivity {


    private Button signIn;
    private TextView register;
    private SignInParse signInParse;
    private EditText username;
    private EditText password;
    private Intent main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        signIn = (Button) findViewById(R.id.signIn);
        register = (TextView) findViewById(R.id.register);
        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);

        signIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                   main = new Intent(SignIn.this,MainActivity.class);
                    startActivity(main);
            }
        });

    }
}

package com.emergenseek.michael.emergenseek;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

                Thread pageSwitch = new Thread() {
                    public void run() {
                try {
                    sleep(2000);ce();
                } finally {
                    Intent intent

                } catch (InterruptedException e) {
                            e.printStackTra= new Intent(SplashScreen.this, SignIn.class);
                    startActivity(intent);

                }

            }
        };
        pageSwitch.start();

    }

    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}





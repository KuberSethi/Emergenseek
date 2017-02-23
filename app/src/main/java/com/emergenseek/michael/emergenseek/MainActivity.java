package com.emergenseek.michael.emergenseek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    //Buttons to change pages
    private Intent questionFlow;
    private Intent symptomSearch;
    private Intent practiceMakesPerfect;
    private Intent dentistSpeak;
    private Button question;
    private Button symptoms;
    private Button practice;
    private Button speakToDentist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageButtons();


    }


    private void imageButtons() {
        //Initializing buttons
        question = (Button)findViewById(R.id.question);
        symptoms = (Button)findViewById(R.id.symptoms);
        practice = (Button)findViewById(R.id.practice);
        speakToDentist = (Button)findViewById(R.id.dentist);
        //Adding events to buttons
        question.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                questionFlow = new Intent(MainActivity.this, QuestionFlow.class);
                startActivity(questionFlow);
                //Animate image button
                //Show loading signal
                //Switch to question search page
            }
        });

        symptoms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Animate image button
                //Show loading signal


                symptomSearch = new Intent(MainActivity.this, SymptomSearch.class);
                startActivity(symptomSearch);

            }
        });

        practice.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Animate image button
                //Show loading signal

                practiceMakesPerfect = new Intent(MainActivity.this, Practice.class);
                startActivity(practiceMakesPerfect);

            }
        });

        speakToDentist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Animate image button
                //Show loading signal
                dentistSpeak = new Intent(MainActivity.this, SpeakToDentist.class);
                startActivity(dentistSpeak);
            }
        });
    }
}
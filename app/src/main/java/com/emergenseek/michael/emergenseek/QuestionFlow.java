package com.emergenseek.michael.emergenseek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionFlow extends AppCompatActivity {
    private Button endo;
    private Button period;
    private Button oral;
    private Button oralp;
    private Button oropain;
    private Button resd;

    private Intent endoIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_flow);


        createButtons();
        createEvents();
    }


    private void createButtons(){

        endo = (Button)findViewById(R.id.endo);
        period = (Button)findViewById(R.id.period);
        oral = (Button)findViewById(R.id.oral);
        oralp = (Button)findViewById(R.id.oralp);
        oropain = (Button)findViewById(R.id.oropain);
        resd = (Button)findViewById(R.id.resd);

    }


    private void createEvents(){
        endo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                endoIntent = new Intent(QuestionFlow.this,Filter.class);
                startActivity(endoIntent);

            }
        });

        period.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {





            }
        });

        oral.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


            }
        });

        oralp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        oropain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        resd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });


    }
}

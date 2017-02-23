package com.emergenseek.michael.emergenseek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Filter extends AppCompatActivity {
    private Button tooth;
    private Intent toothIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        createEverything();

    }


    private void createEverything(){

        tooth = (Button)findViewById(R.id.tooth);
        toothIntent = new Intent(Filter.this,YesOrNo.class);
        startActivity(toothIntent);



    }

}

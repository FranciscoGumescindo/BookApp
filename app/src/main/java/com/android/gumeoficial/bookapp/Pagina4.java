package com.android.gumeoficial.bookapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Pagina4 extends AppCompatActivity {

    private ImageButton btn9, btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina4);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        btn9 = (ImageButton) findViewById(R.id.btn9);
        btn10 = (ImageButton) findViewById(R.id.btn10);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(Pagina4.this,Pagina3.class);
                startActivity(intent3);
                finish();

            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intents3 = new Intent(Pagina4.this,Pagina5.class);
                startActivity(intents3);
                finish();

            }
        });
    }

}

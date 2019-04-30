package com.android.gumeoficial.bookapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Pagina5 extends AppCompatActivity {
    private ImageButton btn11, btn12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina5);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        btn11 = (ImageButton) findViewById(R.id.btn11);
        btn12 = (ImageButton) findViewById(R.id.btn12);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(Pagina5.this,Pagina4.class);
                startActivity(intent3);
                finish();

            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intents3 = new Intent(Pagina5.this,Pagina6.class);
                startActivity(intents3);
                finish();

            }
        });
    }
}

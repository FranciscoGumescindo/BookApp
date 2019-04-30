package com.android.gumeoficial.bookapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Pagina6 extends AppCompatActivity {

    private ImageButton btn13, btn14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina6);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        btn13 = (ImageButton) findViewById(R.id.btn13);
        btn14 = (ImageButton) findViewById(R.id.btn14);

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(Pagina6.this,Pagina5.class);
                startActivity(intent3);
                finish();

            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intents3 = new Intent(Pagina6.this,Pagina7.class);
                startActivity(intents3);
                finish();

            }
        });
    }
}

package com.android.gumeoficial.bookapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pagina7 extends AppCompatActivity {
    private ImageButton btn15;
    private Button btn16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina7);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        btn15 = (ImageButton) findViewById(R.id.btn15);
        btn16 = (Button) findViewById(R.id.btn16);

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(Pagina7.this,Pagina6.class);
                startActivity(intent3);
                finish();

            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);
                finish();

            }
        });
    }

}

package com.android.gumeoficial.bookapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pagina1 extends AppCompatActivity {

    private ImageButton btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        btn3 = (ImageButton) findViewById(R.id.btn3);
        btn4 = (ImageButton) findViewById(R.id.btn4);




        //declaracion para cuando se acccione...
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(btn4.isClickable()){
                    Intent myIntent = new Intent(Pagina1.this,MainActivity.class);
                    startActivity(myIntent);
                    finish();
                }else{
                    return;
                }
            }
        });

        //declaracion para cuando se acccione...
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn3.isClickable()){
                    Intent myIntent1 = new Intent(Pagina1.this,Pagina2.class);
                    startActivity(myIntent1);
                    finish();
                }else{
                    return;
                }

            }
        });

    }
}

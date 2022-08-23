package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btntoast,displaytoast,helloapp,lifecycle,
            bccalc,cal,fv1,fv2; //Week 1


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btntoast = findViewById(R.id.btntoast);
        displaytoast = findViewById(R.id.displaytoast);
        helloapp = findViewById(R.id.helloapp);
        lifecycle = findViewById(R.id.lifecycle);

        bccalc = findViewById(R.id.bccalc);
        cal = findViewById(R.id.calculator);
        fv1 = findViewById(R.id.form);
        fv2 = findViewById(R.id.input);

        helloapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent helloapp = new Intent(MainActivity.this,HelloApplication.class);
                startActivity(helloapp);
            }
        });

        displaytoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent disptoast = new Intent(MainActivity.this,DisplayToast.class);
                startActivity(disptoast);
            }
        });

        btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btntst = new Intent(MainActivity.this,ButtonToast.class);
                startActivity(btntst);
            }
        });

        lifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lifecycle = new Intent(MainActivity.this,Lifecycle.class);
                startActivity(lifecycle);
            }
        });

        bccalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent basiccalc = new Intent(MainActivity.this,Calculator.class);
                startActivity(basiccalc);
            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calc = new Intent(MainActivity.this,Calculator_v2.class);
                startActivity(calc);
            }
        });

        fv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form = new Intent(MainActivity.this,Form_v1.class);
                startActivity(form);
            }
        });

        fv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formv2 = new Intent(MainActivity.this,Form_v2.class);
                startActivity(formv2);
            }
        });

    }
}
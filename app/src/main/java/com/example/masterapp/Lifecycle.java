package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Lifecycle extends AppCompatActivity {

    Button lcbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        lcbtn = findViewById(R.id.lcbtn);
        Log.d("Activity Lifecycle", "onCreate Invoked");

        lcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Lifecycle.this, MainActivity.class);
                startActivity(main);
            }
        });
    }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d("Activity Lifecycle", "onStart Invoked");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.d("Activity Lifecycle", "onResume Invoked");
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d("Activity Lifecycle", "onPause Invoked");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d("Activity Lifecycle", "onStop Invoked");
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d("Activity Lifecycle", "onRestart Invoked");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d("Activity Lifecycle", "onDestroy Invoked");
        }
}
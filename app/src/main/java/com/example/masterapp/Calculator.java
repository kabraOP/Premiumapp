package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        EditText e1 = (EditText) findViewById (R.id.editTextNumber1);
        EditText e2 = (EditText) findViewById (R.id.editTextNumber2);
        TextView t1 = (TextView) findViewById (R.id.textView2);

        Button btn1 = (Button) findViewById (R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button calcbtn = findViewById(R.id.calcback);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = e1.getText().toString();
                String n2 = e2.getText().toString();
                if (!(n1.equals("")||n2.equals("")))
                {
                    int a = Integer.parseInt(n1);
                    int b = Integer.parseInt(n2);
                    int sum = a + b;

                    t1.setText("Addition: " + Integer.toString(sum));
                    Toast.makeText(getApplicationContext(), "Addition:" + String.valueOf(sum), Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Error: Insert Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                t1.setText("");
            }
        });

        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Calculator.this,MainActivity.class);
                startActivity(main);
            }
        });
    }
}
package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Form_v2d extends AppCompatActivity {

    TextView textView,textView2,textView3;
    ImageView imageView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_v2d);
        textView = findViewById(R.id.welcomemsg);
        textView2 = findViewById(R.id.contentmsg);
        textView3 = findViewById(R.id.contentmsg2);
        imageView = findViewById(R.id.image);
        btn = findViewById(R.id.backbtn);


        Intent second = getIntent();
        String msgn = second.getStringExtra("Text1");
        String msggen = second.getStringExtra("Text2");
        String msghobby = second.getStringExtra("Text3");

        textView.setText("Hello " + msgn);
        imageView.setBackground(getResources().getDrawable(R.drawable.avatar));
        textView2.setText(msgn + " is " + msggen);
        textView3.setText(msgn + " likes" + msghobby);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent first = new Intent(Form_v2d.this,Form_v2.class);
                startActivity(first);
            }
        });
    }
}
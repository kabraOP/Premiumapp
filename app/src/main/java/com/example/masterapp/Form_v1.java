package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class Form_v1 extends AppCompatActivity implements View.OnClickListener{

    private TextView textView, textView2, textView3;
    private Button button,fv1b;
    private EditText editText;
    private ImageView imageView;
    private RadioGroup rd_group;
    private CheckBox cb_arts, cb_sw, cb_sports;
    String gender="";

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button:
                String hobby = "";
                Editable name = editText.getText();
                if (cb_sports.isChecked())
                    hobby = "Sports";
                if (cb_arts.isChecked())
                    hobby = hobby +", Arts";
                if(cb_sw.isChecked())
                    hobby = hobby + ", Social Work";
                textView2.setText(" Hello " + name);
                textView2.setTextColor(getResources().getColor(R.color.teal_200));
                textView3.setText(name + " is " +gender+"\n"+name+" likes "+hobby);
                imageView.setBackground(getResources().getDrawable(R.drawable.avatar));
                Toast.makeText(Form_v1.this," Button Clicked ",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_v1);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        rd_group = (RadioGroup) findViewById(R.id.rdg);

        cb_arts = (CheckBox) findViewById(R.id.checkart);
        cb_sw = (CheckBox) findViewById(R.id.checksocial);
        cb_sports = (CheckBox) findViewById(R.id.checksport);

        imageView = (ImageView) findViewById(R.id.imageView);
        fv1b = findViewById(R.id.fv1back);

        button.setOnClickListener(this);

        cb_sports.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(Form_v1.this,"Hobby is Sports",Toast.LENGTH_SHORT).show();
            }
        });

        cb_sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(Form_v1.this,"Hobby is Social Work",Toast.LENGTH_SHORT).show();
            }
        });

        cb_arts.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(Form_v1.this,"Hobby is Arts",Toast.LENGTH_SHORT).show();
            }
        });

        rd_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rdfemale:
                        gender = "Female";
                        break;
                    case R.id.rdmale:
                        gender = "Male";
                        break;
                    default:
                }
            }
        });

        fv1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Form_v1.this,MainActivity.class);
                startActivity(main);
            }
        });
    }
}
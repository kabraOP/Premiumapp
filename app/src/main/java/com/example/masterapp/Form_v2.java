package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Form_v2 extends AppCompatActivity {
    RadioGroup rdg;
    CheckBox chk1,chk2,chk3;
    EditText editbox;
    String gender = "";
    String hobby = "";
    String name = "";
    ToggleButton toggleButton;
    Button fv2back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_v2);

        editbox = findViewById(R.id.editbox);

        rdg = findViewById(R.id.rdg);

        chk1 = findViewById(R.id.chksports);
        chk2 = findViewById(R.id.chkarts);
        chk3 = findViewById(R.id.chksocail);
        toggleButton = findViewById(R.id.toggleButton);
        fv2back = findViewById(R.id.fv2back);

        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                    Toast.makeText(Form_v2.this, "Sports Selected", Toast.LENGTH_SHORT).show();
            }
        });

        chk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                    Toast.makeText(Form_v2.this, "Arts Selected", Toast.LENGTH_SHORT).show();
            }
        });

        chk3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                    Toast.makeText(Form_v2.this, "Social Work Selected", Toast.LENGTH_SHORT).show();
            }
        });

        rdg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.male:
                        gender = "Male";
                        break;
                    case R.id.female:
                        gender = "Female";
                        break;
                }
            }
        });

        toggleButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String label = toggleButton.getText().toString();
                if (label.equals("Reset")) {
                    editbox.setText("");
                    chk1.setChecked(false);
                    chk2.setChecked(false);
                    chk3.setChecked(false);
                    rdg.clearCheck();
                    hobby = "";
                }
                if (label.equals("Submit")) {
                    function();
                }
                return true;
            }
        });

        fv2back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Form_v2.this,MainActivity.class);
                startActivity(main);
            }
        });
    }

    public void function() {
        name = editbox.getText().toString();
        if (chk1.isChecked()) {
            hobby = " Sports";
        }

        if (chk2.isChecked()) {
            hobby = hobby + " Arts";
        }

        if (chk3.isChecked()) {
            hobby = hobby + " Social Work";
        }

        if (name.equals("") || gender.equals("") || hobby.equals("")){
            Toast.makeText(this, "Please Complete the Form", Toast.LENGTH_SHORT).show();
        }else{
            Intent second = new Intent(Form_v2.this,Form_v2d.class);
            String msgn = name;
            String msggen = gender;
            String msghobby = hobby;

            second.putExtra("Text1", msgn);
            second.putExtra("Text2", msggen);
            second.putExtra("Text3",msghobby);

            startActivity(second);
        }
    }
}

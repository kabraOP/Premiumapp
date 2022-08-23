package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator_v2 extends AppCompatActivity implements View.OnClickListener  {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            buttonadd,buttoneql,buttonsub,buttonmulti,buttondiv,buttondot,buttonc;
    EditText editbox;
    float mvalueone,mvaluetwo;

    Boolean addflag,subflag,multiflag,divflag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_v2);

        editbox = (EditText) findViewById(R.id.editbox);
        editbox.setInputType(0);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        buttonadd = (Button) findViewById(R.id.buttonadd);
        buttoneql = (Button) findViewById(R.id.buttoneql);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttondiv = (Button) findViewById(R.id.buttondiv);

        buttonmulti = (Button) findViewById(R.id.buttonmulti);
        buttondot = (Button) findViewById(R.id.buttondot);
        buttonc = (Button) findViewById(R.id.buttonc);


        editbox = (EditText) findViewById(R.id.editbox);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttondot.setOnClickListener(this);

        buttonadd.setOnClickListener(this);
        buttonsub.setOnClickListener(this);
        buttonmulti.setOnClickListener(this);
        buttondiv.setOnClickListener(this);

        buttonc.setOnClickListener(this);

        buttoneql.setOnClickListener(this);
        editbox.setOnClickListener(this);
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button1:
                editbox.setText(editbox.getText() + "1");
                break;

            case R.id.button2:
                editbox.setText(editbox.getText() + "2");
                break;

            case R.id.button3:
                editbox.setText(editbox.getText()+"3");
                break;

            case R.id.button4:
                editbox.setText(editbox.getText() + "4");
                break;

            case R.id.button5:
                editbox.setText(editbox.getText() + "5");
                break;

            case R.id.button6:
                editbox.setText(editbox.getText()+"6");
                break;

            case R.id.button7:
                editbox.setText(editbox.getText() + "7");
                break;

            case R.id.button8:
                editbox.setText(editbox.getText() + "8");
                break;

            case R.id.button9:
                editbox.setText(editbox.getText()+"9");
                break;

            case R.id.button0:
                editbox.setText(editbox.getText()+"0");
                break;

            case R.id.buttondot:
                editbox.setText(editbox.getText()+".");
                break;

            //Fetching Values

            case R.id.buttonadd:
                if (editbox==null)
                {
                    editbox.setText("");
                }else{
                    mvalueone = Float.parseFloat(editbox.getText()+"");
                    addflag=true;
                    editbox.setText(null);
                }
                break;

            case R.id.buttonsub:
                if (editbox==null)
                {
                    editbox.setText("");
                }else{
                    mvalueone = Float.parseFloat(editbox.getText()+"");
                    subflag=true;
                    editbox.setText(null);
                }
                break;

            case R.id.buttonmulti:
                if (editbox==null)
                {
                    editbox.setText("");
                }else{
                    mvalueone = Float.parseFloat(editbox.getText()+"");
                    multiflag=true;
                    editbox.setText(null);
                }
                break;

            case R.id.buttondiv:
                if (editbox==null)
                {
                    editbox.setText("");
                }else{
                    mvalueone = Float.parseFloat(editbox.getText()+"");
                    divflag=true;
                    editbox.setText(null);
                }
                break;

            case R.id.buttonc:
                editbox.setText("");
                break;

            //Operations

            case R.id.buttoneql:
                mvaluetwo=Float.parseFloat(editbox.getText()+"");
                if (addflag==true)
                {
                    editbox.setText(mvalueone + mvaluetwo + "");
                    addflag=false;
                    break;
                }else if (subflag==true) {
                    editbox.setText((mvalueone - mvaluetwo) + "");
                    subflag=false;
                    break;
                }else if (multiflag==true) {
                    editbox.setText(mvalueone * mvaluetwo + "");
                    multiflag = false;
                    break;
                }else if (divflag==true) {
                    editbox.setText(mvalueone / mvaluetwo + "");
                    divflag = false;
                    break;
                }
        }
    }
}
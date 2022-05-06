package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonEqual,button11;
    EditText gettext;

    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 =  findViewById(R.id.button14);
        button1 =  findViewById(R.id.button9);
        button2 =  findViewById(R.id.button10);
        button3 =  findViewById(R.id.button11);
        button4 =  findViewById(R.id.button5);
        button5 =  findViewById(R.id.button6);
        button6 =  findViewById(R.id.button7);
        button7 =  findViewById(R.id.button);
        button8 =  findViewById(R.id.button2);
        button9 =  findViewById(R.id.button3);
        button10=findViewById(R.id.button4);
        buttonAdd =  findViewById(R.id.button16);
        buttonSub =  findViewById(R.id.button17);
        buttonMul =  findViewById(R.id.button12);
        buttonDivision =  findViewById(R.id.button8);
        button11=findViewById(R.id.button13);
        buttonEqual =  findViewById(R.id.button15);
        gettext =  findViewById(R.id.editTextTextPersonName);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettext.setText(gettext.getText() + "1");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettext.setText(gettext.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettext.setText(gettext.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettext.setText(gettext.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettext.setText(gettext.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettext.setText(gettext.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettext.setText(gettext.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettext.setText(gettext.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettext.setText(gettext.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettext.setText(gettext.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (gettext == null) {
                    gettext.setText("");
                } else {
                    mValueOne = Float.parseFloat(gettext.getText() + "");
                    crunchifyAddition = true;
                    gettext.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(gettext.getText() + "");
                mSubtract = true;
                gettext.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(gettext.getText() + "");
                crunchifyMultiplication = true;
                gettext.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(gettext.getText() + "");
                crunchifyDivision = true;
                gettext.setText("");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(gettext.getText() + "");

                if (crunchifyAddition == true) {
                    gettext.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    gettext.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    gettext.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    gettext.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettext.setText("");
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettext.setText(gettext.getText() + ".");
            }
        });
    }
}


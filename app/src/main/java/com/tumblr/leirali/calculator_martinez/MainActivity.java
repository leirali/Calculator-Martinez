package com.tumblr.leirali.calculator_martinez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Load views

    private String operation;
    private int ans;
    private int num;
    private Button mult;
    private Button div;
    private Button plus;
    private Button minus;
    private Button delete;
    private Button clear;
    private Button equals;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private TextView textView;
    private boolean isInput = false;
    private String inputString = "";
    private String calcString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ans = 0;
        num = 0;
        operation = null;
        mult = (Button) findViewById(R.id.buttonMultiply);
        div = (Button) findViewById(R.id.buttonDivide);
        plus = (Button) findViewById(R.id.buttonPlus);
        minus = (Button) findViewById(R.id.buttonMinus);
        delete = (Button) findViewById(R.id.buttonCE);
        clear = (Button) findViewById(R.id.buttonC);
        equals = (Button) findViewById(R.id.buttonEquals);
        button1 = (Button) findViewById(R.id.buttonOne);
        button2 = (Button) findViewById(R.id.buttonTwo);
        button3 = (Button) findViewById(R.id.buttonThree);
        button4 = (Button) findViewById(R.id.buttonFour);
        button5 = (Button) findViewById(R.id.buttonFive);
        button6 = (Button) findViewById(R.id.buttonSix);
        button7 = (Button) findViewById(R.id.buttonSeven);
        button8 = (Button) findViewById(R.id.buttonEight);
        button9 = (Button) findViewById(R.id.buttonNine);
        button0 = (Button) findViewById(R.id.buttonZero);
        textView = (TextView) findViewById(R.id.numView);

        // Set onClick event listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                append('1');
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                append("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                append("3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                append("4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                append("5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                append("6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                append("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                append("8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                append("9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                append("0");
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand('*');
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand('/');
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand('+');
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand('-');
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = "";
                textView.setText(inputString);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               inputString = "";
                textView.setText(inputString);
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate( ans, num, operation);
            }
        });
    }

    public void append(char input){
        if(!isInput){
            isInput = true;
        }
        else if(input =='1'){
            inputString = inputString + "1";
        }
        else if(input =='2'){
            inputString = inputString + "2";
        }
        else if(input =='3'){
            inputString = inputString + "3";
        }
        else if(input =='4'){
            inputString = inputString + "4";
        }
        else if(input =='5'){
            inputString = inputString + "5";
        }
        else if(input =='6'){
            inputString = inputString + "6";
        }
        else if(input =='7'){
            inputString = inputString + "7";
        }
        else if(input =='8'){
            inputString = inputString + "8";
        }
        else if(input =='9'){
            inputString = inputString + "9";
        }
        else if(input =='0'){
            inputString = inputString + "0";
        }
        textView.setText(inputString);
    }

    public void operand(char input){
        if(savedString.isEmpty()) {
            if (isInput) {
                if (input == '+') {
                    opString = "+";
                } else if (input == '-') {
                    opString = "-";
                } else if (input == '*') {
                    opString = "*";
                } else if (input == '/') {
                    opString = "/";
                }
                savedString = inputString;
                inputString = "";
                currentOp.setText(savedString + opString + inputString);
                isInput = false;
            }
        }
    }

    private void calculate(int ans, int num, String operation) {
        saved = Double.valueOf(savedString);
        current = Double.valueOf(inputString);
        if(opString.contains("+"))
            saved = saved + current;
        else if(opString.contains("-"))
            saved = saved - current;
        else if(opString.contains("*"))
            saved = saved * current;
        else if(opString.contains("/"))
            saved = saved / current;
        savedString = "";
        opString = "";
        inputString = "";
        calcString = saved.toString();
        saved = 0.0;
        current = 0.0;
        prevOp.setText(calcString);
        currentOp.setText(savedString + opString + inputString);
        }

    }


    //onSaveInstances && onRestoreInstances
    @Override
    protected void onSaveInstanceState( Bundle savedInstanceState){
        //TODO update w/necessary variables
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("op", operation);
        savedInstanceState.putString("answer", ans);
        savedInstanceState.putString("new number", newNum);
        savedInstanceState.putCharSequence("view", textView.getText());
    }

    @Override
    protected void onRestoreInstanceState( Bundle savedInstanceState){
        //TODO see onSave
        super.onSaveInstanceState(savedInstanceState);
        textView.setText(savedInstanceState.getCharSequence("view"));
        operation = savedInstanceState.getString("op");
        ans = savedInstanceState.getString("answer");
        newNum = savedInstanceState.getString("new number");
    }
}

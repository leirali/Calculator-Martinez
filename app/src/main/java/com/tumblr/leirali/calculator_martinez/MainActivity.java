package com.tumblr.leirali.calculator_martinez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView currentOperation;
    private TextView previousOperation;
    private Double saved = 0.0;
    private Double current = 0.0;
    private boolean isInput = false;
    private String inputString= "";
    private String opString="";
    private String savedString= "";
    private String calcString= "";

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button clear;
    private Button clearAll;
    private Button equals;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        clear = (Button) findViewById(R.id.clear);
        clearAll = (Button) findViewById(R.id.clearAll);
        equals = (Button) findViewById(R.id.equals);
        previousOperation = (TextView) findViewById(R.id.prevOp);
        currentOperation = (TextView) findViewById(R.id.currentOp);
        currentOperation.setText(savedString+opString+inputString);
        //result

        zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                append('0');
            }
        });
        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                append('1');
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                append('2');
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                append('3');
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                append('4');
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                append('5');
            }
        });
        six.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                append('6');
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                append('7');
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                append('8');
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                append('9');
            }
        });
        plus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                operand('+');
            }
        });
        minus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                operand('-');
            }
        });
        multiply.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                operand('*');
            }
        });
        divide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                operand('/');
            }
        });
        equals.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if(!savedString.isEmpty() && !opString.isEmpty() && !inputString.isEmpty())
                    calculation();
            }
        });
        clearAll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                inputString = "";
                savedString = "";
                opString = "";
                calcString = "";
                saved = 0.0;
                current = 0.0;
                currentOperation.setText(saved.toString());
            }
        });

        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                inputString = "";
                currentOperation.setText(savedString+opString+inputString);
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
        currentOperation.setText(savedString+opString+inputString);
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
                currentOperation.setText(savedString + opString + inputString);
                isInput = false;
            }
        }
    }
    public void calculation(){
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
        //need result
        saved = 0.0;
        current = 0.0;
        previousOperation.setText(calcString);
        currentOperation.setText(savedString + opString + inputString);
    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("inputSave",inputString);
        outState.putString("savedSave",savedString);
        outState.putString("operationSave",opString);
        outState.putString("calcSave",calcString);
        outState.putBoolean("isInputSave",isInput);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        inputString = savedInstanceState.getString("inputSave");
        savedString = savedInstanceState.getString("savedSave");
        opString = savedInstanceState.getString("operationSave");
        calcString = savedInstanceState.getString("calcSave");
        isInput = savedInstanceState.getBoolean("isInputSave");
        previousOperation.setText(calcString);
        currentOperation.setText(savedString + opString + inputString);
    }
}
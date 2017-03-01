package com.tumblr.leirali.calculator_martinez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Load views
    TextView textView = (TextView) findViewById(R.id.textView);

    Button button1 = (Button) findViewById(R.id.button1);
    Button button2 = (Button) findViewById(R.id.button2);
    Button button3 = (Button) findViewById(R.id.button3);
    Button button4 = (Button) findViewById(R.id.button4);
    Button button5 = (Button) findViewById(R.id.button5);
    Button button6 = (Button) findViewById(R.id.button6);
    Button button7 = (Button) findViewById(R.id.button7);
    Button button8 = (Button) findViewById(R.id.button8);
    Button button9 = (Button) findViewById(R.id.button9);
    Button button0 = (Button) findViewById(R.id.button0);
    Button multButton = (Button) findViewById(R.id.multButton);
    Button divButton = (Button) findViewById(R.id.divButton);
    Button plusButton = (Button) findViewById(R.id.plusButton);
    Button minusButton = (Button) findViewById(R.id.minusButton);
    Button ceButton = (Button) findViewById(R.id.ceButton);
    Button cButton = (Button) findViewById(R.id.cButton);
    Button eButton = (Button) findViewById(R.id.eButton);


    // Variables
    int answer;
    int newNum;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = 0;
        newNum = 0;
        operation = null;


        // Set onClick event listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
            }
        });

        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "multiply";
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "divide";
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "add";
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "minus";
            }
        });

        ceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = 0;
                newNum = 0;
                textView.setText("0");
            }
        });

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = 0;
                newNum = 0;
                textView.setText("0");
                operation = null;
            }
        });

        eButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate( answer, newNum, operation);
            }
        });
    }

    private void calculate(int answer, int newNum, String operation) {
        //TODO
    }

    @Override
    protected void onSaveInstanceState( Bundle savedInstanceState){
        //TODO update w/necessary variables
        savedInstanceState.putCharSequence("view", textView.getText());

    }

    @Override
    protected void onRestoreInstanceState( Bundle savedInstanceState){
        //TODO see onSave
        textView.setText(savedInstanceState.getCharSequence("view"));
    }
}

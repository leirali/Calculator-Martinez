package com.tumblr.leirali.calculator_martinez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Load views
    TextView textView = (TextView) findViewById(R.id.textView);

    //variables
    Button multiplicationButton = (Button) findViewById(R.id.buttonMultiply);
    Button divButton = (Button) findViewById(R.id.buttonDivide);
    Button plusButton = (Button) findViewById(R.id.buttonPlus);
    Button minusButton = (Button) findViewById(R.id.buttonMinus);
    Button ceButton = (Button) findViewById(R.id.buttonCE);
    Button cButton = (Button) findViewById(R.id.buttonC);
    Button eButton = (Button) findViewById(R.id.buttonEquals);
    Button button1 = (Button) findViewById(R.id.buttonOne);
    Button button2 = (Button) findViewById(R.id.buttonTwo);
    Button button3 = (Button) findViewById(R.id.buttonThree);
    Button button4 = (Button) findViewById(R.id.buttonFour);
    Button button5 = (Button) findViewById(R.id.buttonFive);
    Button button6 = (Button) findViewById(R.id.buttonSix);
    Button button7 = (Button) findViewById(R.id.buttonSeven);
    Button button8 = (Button) findViewById(R.id.buttonEight);
    Button button9 = (Button) findViewById(R.id.buttonNine);
    Button button0 = (Button) findViewById(R.id.buttonZero);


    // Variables
    int answer;
    int number;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = 0;
        number = 0;
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

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
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
                number = 0;
                textView.setText("0");
            }
        });

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = 0;
               number = 0;
                textView.setText("0");
                operation = null;
            }
        });

        eButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate( answer, number, operation);
            }
        });
    }

    private void calculate(int answer, int number, String operation) {
        //TODO
    }


    //onSaveInstances && onRestoreInstances
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

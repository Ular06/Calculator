package com.example.calculator;

import static com.example.calculator.R.id.text_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second, result;
    private Boolean isOperationclick;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_0);
    }


    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.text_1:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else if (isOperationclick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;
            case R.id.text_2:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else if (isOperationclick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;
            case R.id.text_3:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else if (isOperationclick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;
            case R.id.text_4:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                } else if (isOperationclick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;
            case R.id.text_5:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else if (isOperationclick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;
            case R.id.text_6:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else if (isOperationclick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;
            case R.id.text_7:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else if (isOperationclick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;
            case R.id.text_8:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else if (isOperationclick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;
            case R.id.text_9:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                } else if (isOperationclick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;
            case R.id.ac_text:
                textView.setText("0");
                break;


        }

        isOperationclick = false;


        String oper = " ";
        switch (view.getId()) {
            case R.id.text_plus:
                oper = "+";
                result = first + second;
                break;
            case R.id.text_minus:
                oper = "-";
                result = first - second;
                break;
            case R.id.text_umnojenie:
                oper = "*";
                result = first * second;
                break;
            case R.id.text_delenie:
                oper = "/";
                result = first / second;

                break;


        }
    }
}

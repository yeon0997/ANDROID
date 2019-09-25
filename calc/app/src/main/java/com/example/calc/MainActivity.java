package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{
    TextView tvResult;        // 텍스트뷰인 tvResult 객체 생성
    int a;
    int b;
    double c;
    int d;

    int inc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);     // id로 view객체를 찾겠다

        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        Button btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        Button btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        Button btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        Button btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        Button btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        Button btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        Button btn0 = (Button)findViewById(R.id.btn0);
        btn0.setOnClickListener(this);

        Button btn_result = (Button)findViewById(R.id.btn_result);
        btn_result.setOnClickListener(this);
        Button btn_add = (Button)findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);
        Button btn_sub = (Button)findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(this);
        Button btn_mul = (Button)findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(this);
        Button btn_div = (Button)findViewById(R.id.btn_div);
        btn_div.setOnClickListener(this);
        Button btn_AC = (Button)findViewById(R.id.btn_AC);
        btn_AC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1 :
                if(inc == 0){
                    a = 1;
                }
                else if(inc == 1) {
                    b = 1;
                }
                inc++;
                tvResult.setText("1");
                break;

            case R.id.btn2 :
                if(inc == 0){
                    a = 2;
                }
                else if(inc == 1) {
                    b = 2;
                }
                inc++;
                tvResult.setText("2");
                break;
            case R.id.btn3 :
                if(inc == 0){
                    a = 3;
                }
                else if(inc == 1) {
                    b = 3;
                }
                inc++;
                tvResult.setText("3");
                break;
            case R.id.btn4 :
                if(inc == 0){
                    a = 4;
                }
                else if(inc == 1) {
                    b = 4;
                }
                inc++;
                tvResult.setText("4");
                break;
            case R.id.btn5 :
                if(inc == 0){
                    a = 5;
                }
                else if(inc == 1) {
                    b = 5;
                }
                inc++;
                tvResult.setText("5");
                break;
            case R.id.btn6 :
                if(inc == 0){
                    a = 6;
                }
                else if(inc == 1) {
                    b = 6;
                }
                inc++;
                tvResult.setText("6");
                break;
            case R.id.btn7 :
                if(inc == 0){
                    a = 7;
                }
                else if(inc == 1) {
                    b = 7;
                }
                inc++;
                tvResult.setText("7");
                break;
            case R.id.btn8 :
                if(inc == 0){
                    a = 8;
                }
                else if(inc == 1) {
                    b = 8;
                }
                inc++;
                tvResult.setText("8");
                break;
            case R.id.btn9 :
                if(inc == 0){
                    a = 9;
                }
                else if(inc == 1) {
                    b = 9;
                }
                inc++;
                tvResult.setText("9");
                break;
            case R.id.btn0 :
                if(inc == 0){
                    a = 0;
                }
                else if(inc == 1) {
                    b = 0;
                }
                inc++;
                tvResult.setText("0");
                break;
            case R.id.btn_add:
                tvResult.setText("+");
                d = 1;
                break;
            case R.id.btn_sub:
                tvResult.setText("-");
                d = 2;
                break;
            case R.id.btn_mul:
                tvResult.setText("*");
                d = 3;
                break;
            case R.id.btn_div:
                tvResult.setText("/");
                d = 4;
                break;
            case R.id.btn_result :
                if(d == 1)
                    c = a + b;
                else if(d == 2)
                    c = a - b;
                else if(d == 3)
                    c = a * b;
                else if(d == 4)
                    c = a / b;
                tvResult.setText(Double.toString(c));
                break;
            case R.id.btn_AC:
                tvResult.setText("");
                a = 0;
                b = 0;
                c = 0;
                d = 0;
        }
    }
}
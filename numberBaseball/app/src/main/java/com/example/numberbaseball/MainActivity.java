package com.example.numberbaseball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int count;
    int cnum1;
    int cnum2;
    int cnum3;

    TextView tvResult;
    TextView tvCount;

    EditText etNum1;
    EditText etNum2;
    EditText etNum3;

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tvCount);
        tvResult = findViewById(R.id.tvResult);

        count = 0;
    }

    public void onClickStart(View v) {

        count = 0;
        tvCount.setText("숫자를 입력하세요");

        if(count == 0)
            tvResult.setText("");
            tvResult.setText("시작");


        cnum1 = random.nextInt(9);
        cnum2 = random.nextInt(9);
        cnum3 = random.nextInt(9);

        if((cnum1 == cnum2) || (cnum1 == cnum3)) {
            cnum1 = random.nextInt(9) + 1;
        }
        if((cnum2 == cnum1)|| (cnum2 == cnum3)) {
            cnum2 = random.nextInt(9) + 1;
        }
        if((cnum3 == cnum1) || (cnum3 == cnum2)) {
            cnum3 = random.nextInt(9) + 1;
        }

        System.out.println(cnum1);
        System.out.println(cnum2);
        System.out.println(cnum3);

    }

    public void onClickSubmit(View v) {

        int ball = 0;
        int strike = 0;

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        etNum3 = findViewById(R.id.etNum3);

        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int num3 = Integer.parseInt(etNum3.getText().toString());

        if (num1 == cnum1)
            strike++;
        else if ((num1 == cnum2) || (num1 == cnum3))
            ball++;

        if (num2 == cnum2)
            strike++;
        else if ((num2 == cnum1) || (num2 == cnum3))
            ball++;

        if (num3 == cnum3)
            strike++;
        else if ((num3 == cnum1) || (num3 == cnum2))
            ball++;


        count++;
        tvCount.setText(count + "번째");

        String result = "\n#" + count + ":";

        if (strike == 0 && ball == 0) {
            result += "아웃";
        }
        else if(strike == 3) {
            result += "승리";
            count = 0;
        }
        else
            result = "\n#" + strike +"S" + ball + "B";

        // 결과 메시지 출력
        if (tvResult.getText().toString() == null || tvResult.getText().toString() == "")
            tvResult.setText(result);
        else
            tvResult.append(result);
    }
}

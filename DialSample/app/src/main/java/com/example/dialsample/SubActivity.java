package com.example.dialsample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    TextView tv_name;
    TextView tv_age; // 전역변수로 만들면 메모리에 큰 용량을 차지함 따라서 지역변수를 추천

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 0);

        tv_name = findViewById(R.id.tv_name);
        tv_age = findViewById(R.id.tv_age);

        tv_name.setText(name);
        tv_age.setText(age + "");
        //문자열 + 숫자 = 문자열 그래서 age는 문자열로 바뀜, Integer.toString(age)도 같은 결과가 나옴
    }

}

package com.example.debugtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    int a = 0;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);    // R.id.btn1 : btn1이라는 id를 가진 요소를 찾기 위해서 쓰는 문법
        btn1.setOnClickListener(this);

        btn1.setOnClickListener(new Button.OnClickListener(){   // btn1 버튼을 클릭했을 때 실행되는 내용
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.btn1 :
                    Toast.makeText(this, "btn1", Toast.LENGTH_LONG).show();

                    case R.id.btn2 :
                        Toast.makeText(this, "btn2", Toast.LENGTH_LONG).show();
                }
            }
        });

        /*a = 1;

        for(int i=0; i<5; i++) {
            System.out.println("test");
            a++;
        }*/
    }

    /*
    // 버튼 이벤트
    public void onBtnClick(View v) {
        Toast.makeText(this, "test", Toast.LENGTH_LONG).show();     // 토스트 메시지 : 잠깐 노출됐다가 사라지는 메시지
    }
    */

    @Override
    public void onClick(View v){
        Toast.makeText(this, "test", Toast.LENGTH_LONG).show();
    }
}
package com.example.quiz_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void OnClickBtn1(View v){

    Intent intent = new Intent(this, AnswerActivity.class);

    switch(v.getId()) {
        case(R.id.btn1) :
            intent.putExtra("result", "틀렸삼");
            break;
        case(R.id.btn2) :
            intent.putExtra("result","틀렸삼");
            break;
        case(R.id.btn3):
            intent.putExtra("result","맞았삼");
            break;
        case(R.id.btn4) :
            intent.putExtra("result","틀렸삼");
            break;
    }
    startActivity(intent);
    }
}

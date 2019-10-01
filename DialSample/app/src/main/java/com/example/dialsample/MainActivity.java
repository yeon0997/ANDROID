package com.example.dialsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //xml과 연결

        //객체연결
        et_tel = findViewById(R.id.et_tel);
    }

    //CALL버튼 이벤트
    public void OnBtnClickCall(View v){ //함수는 이런 형태로 만들어야됨
        String data = et_tel.getText().toString();
        // et_tel에 입력된 값을 get해서  toString을 통해 문자열로 전달해줌
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
        startActivity(intent);

    }

    //SUB버튼 이벤트
    public void OnBtnClickSub(View v){
        Intent intent = new Intent(this, SubActivity.class);
        //현재의 레이아웃에서 subActivity를 실행하겠다는 intent
        intent.putExtra("name", "김펭귄"); //putExtra
        intent.putExtra("age", 16);
        //두 개의 intent는 sub의 onCreate가 실행될 때 가져올 수 있다
        startActivity(intent); //intent를 시작하겠다는 행
    }


}

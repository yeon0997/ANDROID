package com.example.walkingcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvWalk;
    int walk; //걸음 수


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWalk = findViewById(R.id.tvWalk);

        //걸음 수 초기화
        walk = 0;

        //걸음 수 표시
        showWalk();


    }

    public void showWalk(){
        //걸음 수를 문자열로 만들기
        String str_walk = Integer.toString(walk);

        str_walk = str_walk + "보";

        //걸음을 화면에 표시
        tvWalk.setText(str_walk);
    }

    //버튼 이벤트 걷기
    public void OnBtnWalk(View v){
        //걸음 수 증가
        walk = walk + 1; //walk++; walk += 1; 같은 결과

        showWalk();
    }
    //버튼 이벤트 초기화
    public void OnBtnReset(View v){
        walk = 0;

        showWalk();

    }

    @Override
    protected void onStart() {
        super.onStart();
        SharedPreferences sf = getSharedPreferences("counter", MODE_PRIVATE);
        walk = sf.getInt("walk", 0);

        showWalk();
    }

    @Override
    protected void onStop() {
        super.onStop();

        //문자열을 파일로 저장
        SharedPreferences sharedPreferences = getSharedPreferences("counter", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("walk", walk);

        editor.commit();
    }
}

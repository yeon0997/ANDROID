package com.example.dbconn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    EditText etInput;

    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = findViewById(R.id.etInput);
        tvShow = findViewById(R.id.tvShow);

    }
    //버튼 이벤트 저장
    public void OnBtnSave(View v){
        //정보로 파일 저장

        //et값을 가져오기
        String str_save = etInput.getText().toString();

        SharedPreferences sharedPreferences = getSharedPreferences("save", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("text", str_save);

        editor.commit();
    }

    public void OnBtnLoad(View v){
        SharedPreferences sf = getSharedPreferences("save", MODE_PRIVATE);
        String text = sf.getString("text", "");
        tvShow.setText(text);
    }

}

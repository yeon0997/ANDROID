package com.example.login_convert;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU=101;

    EditText etid;
    EditText etpw;



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==REQUEST_CODE_MENU) {
            Toast.makeText(getApplicationContext(),
                    "onActivityResult 메서드 호출됨. 요청코드 : " + requestCode + ", 결과코드 " + resultCode, Toast.LENGTH_LONG).show();

            if(resultCode == RESULT_OK) {
                String name = data.getStringExtra("name");
                Toast.makeText(getApplicationContext(), "응답으로 전달된 name : " + name, Toast.LENGTH_LONG).show();

            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // etid=findViewById(R.id.inputid);
        // String etid.getText()


        Button button = findViewById(R.id.login_1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //id의 EditText 객체를 얻어온다.
                etid = findViewById(R.id.id);

                //pw의 EditText 객체를 얻어온다.
                etpw = findViewById(R.id.pw);

                //문자열 inputid에 id(EditText)객체로 부터 getText()를 호출한다.
                String inputid = etid.getText().toString();

                //문자열 inputpw에 pw(EditText)객체로 부터 getText()를 호출한다.
                String inputpw = etpw.getText().toString();

                //inputid는 "test" 그리고 inputpw는 "test"인 경우만 성공 아니면 실패

                if (inputid.equals("test") && (inputpw.equals("test"))){
                    Toast.makeText(getApplicationContext(),"로그인성공",Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                    startActivityForResult(intent, REQUEST_CODE_MENU);

                }
                else{
                    Toast.makeText(getApplicationContext(),"로그인실패",Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}
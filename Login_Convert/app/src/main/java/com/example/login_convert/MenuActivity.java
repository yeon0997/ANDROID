package com.example.login_convert;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.login_convert.MainActivity.REQUEST_CODE_MENU;

public class MenuActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU=102;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        Button button = findViewById(R.id.customer);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CustomerActivity.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });


        Button button2 = findViewById(R.id.earning);
        button2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

            }
        });


        Button button3 = findViewById(R.id.product);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("name", "gotohome");
                setResult(RESULT_OK, intent);
                finish();
            }
        });



    }
}
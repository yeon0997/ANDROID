package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ChatAdapter adapter = new ChatAdapter();

        adapter.addItem(new Chat("왕다영", "(3)","1900-99-00", "캐드탱"));
        adapter.addItem(new Chat("임은형", "(3)","1900-99-00", "팀장 칼빵 10개"));
        adapter.addItem(new Chat("신정연", "(3)","1900-99-00", "집에 갈 것이다"));


        recyclerView.setAdapter(adapter);
    }
}

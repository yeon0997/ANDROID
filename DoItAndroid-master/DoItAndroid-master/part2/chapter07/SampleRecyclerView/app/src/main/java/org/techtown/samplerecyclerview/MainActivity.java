package org.techtown.samplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        PersonAdapter adapter = new PersonAdapter();

        Person p4 = new Person("tlswjddus", "010199999999", "1000");


        adapter.addItem(new Person("김민수", "010-1000-1000","56"));
        adapter.addItem(new Person("김하늘", "010-2000-2000", "344"));
        adapter.addItem(new Person("홍길동", "010-3000-3000","455"));
        adapter.addItem(p4);

        recyclerView.setAdapter(adapter);

    }
}

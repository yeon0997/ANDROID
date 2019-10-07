package com.example.recyclerview_customer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    //CustomerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        CustomerAdapter adapter = new CustomerAdapter();
        Customer c1 = new Customer("신정연", "34240", "3342");
        adapter.addItem(c1);

        recyclerView.setAdapter(adapter);
    }

/*    public void OnBtn(View v){
        Customer customer = new Customer("신정연", "34240", "3342");
        adapter.addItem(customer);
        adapter.notifyDataSetChanged();
    }*/
}

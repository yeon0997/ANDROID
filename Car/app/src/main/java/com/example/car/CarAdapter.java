package com.example.car;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    ArrayList<Car> items = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.car_item, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Car item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Car item) {
        items.add(item);
    }

    public void setItems(ArrayList<Car> items) {
        this.items = items;
    }

    public Car getItem(int position) {
        return items.get(position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvManuf;
        TextView tvYear;

        public ViewHolder(View itemView){
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            tvManuf = itemView.findViewById(R.id.tvManuf);
            tvYear = itemView.findViewById(R.id.tvYear);
        }

        public void setItem(Car item){
            tvName.setText(item.name);
            tvManuf.setText(item.manuf);
            tvYear.setText(item.year);
        }
    }



}

package com.example.recyclerview_customer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {
    ArrayList<Customer> items = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.customer_item, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Customer item = items.get(position);
        viewHolder.setItem(item);
    }

    public int getItemCount(){ return items.size();}
    public void addItem(Customer item){ items.add(item);}
    public void setItems(ArrayList<Customer> items){this.items = items;}
    public Customer getItem(int position) {
        return items.get(position);
    }
    public void setItem(int position, Customer item) {items.set(position, item);}

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvBirth;
        TextView tvPhone;

        public ViewHolder (View itemView){
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvBirth = itemView.findViewById(R.id.tvBirth);
            tvPhone = itemView.findViewById(R.id.tvPhone);
        }

        public void setItem(Customer item) {
            tvName.setText(item.getName());
            tvBirth.setText(item.getBirth());
            tvPhone.setText(item.getPhone());
        }
    }
}
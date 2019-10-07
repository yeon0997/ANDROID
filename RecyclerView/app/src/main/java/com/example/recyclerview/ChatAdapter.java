package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    ArrayList<Chat> items = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.chat_item, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Chat item = items.get(position);
        viewHolder.setItem(item);
    }

    public int getItemCount(){ return items.size();}
    public void addItem(Chat item){ items.add(item);}
    public void setItems(ArrayList<Chat> items){this.items = items;}
    public Chat getItem(int position) {
        return items.get(position);
    }
    public void setItem(int position, Chat item) {items.set(position, item);}

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvNum;
        TextView tvDate;
        TextView tvCon;

    public ViewHolder (View itemView){
        super(itemView);
        tvName = itemView.findViewById(R.id.tvName);
        tvNum = itemView.findViewById(R.id.tvNum);
        tvDate = itemView.findViewById(R.id.tvDate);
        tvCon = itemView.findViewById(R.id.tvCon);
    }

    public void setItem(Chat item) {
        tvName.setText(item.getName());
        tvNum.setText(item.getNum());
        tvDate.setText(item.getDate());
        tvCon.setText(item.getCon());
    }
}
}
package com.example.tarea2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyReciclerViewAdapter extends RecyclerView.Adapter<MyReciclerViewAdapter.ViewHolder> {
    private List<String> mData;
    private View.OnClickListener itemClickListener;
    private LayoutInflater inflater;

    // dentro del constructor se pasan los datos de cada momento
    public MyReciclerViewAdapter(List<String> data, View.OnClickListener context) {
        inflater = LayoutInflater.from((Context) context);
        this.mData = data;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_view_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String texto = mData.get(position);
        holder.textView.setText(texto);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textoRecycler);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (itemClickListener != null) {
                itemClickListener.onClick(v);
            }
        }
    }
    String getItem(int id) {
        return mData.get(id);
    }
    void setClickListener(View.OnClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
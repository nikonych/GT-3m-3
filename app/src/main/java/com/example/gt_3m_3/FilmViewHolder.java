package com.example.gt_3m_3;

import android.media.Image;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FilmViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public FilmViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_film_name);
    }

    void bind(String name){
        textView.setText(name);
    }
}

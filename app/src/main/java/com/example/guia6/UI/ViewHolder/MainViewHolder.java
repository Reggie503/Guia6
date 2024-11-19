package com.example.guia6.UI.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guia6.R;

public class MainViewHolder extends RecyclerView.ViewHolder {
    public TextView sectionName;
    public RecyclerView childRcv;
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        sectionName = itemView.findViewById(R.id.txvSectionName);
        childRcv = itemView.findViewById(R.id.rcvChild);
    }
}

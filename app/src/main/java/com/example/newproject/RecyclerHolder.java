package com.example.newproject;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerHolder extends RecyclerView.ViewHolder {

    TextView RecyclerItemTxtView;

    public RecyclerHolder(View itemView) {
        super(itemView);

        this.RecyclerItemTxtView = itemView.findViewById(R.id.RecyclerItemsTxtView);
    }
}

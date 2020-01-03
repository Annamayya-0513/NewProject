package com.example.newproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerHolder> {

    Context context;
    ArrayList<RecyclerModel> models;    // this arraylist created a list of array which parameters define in our model class

 //now created a parametarized constructor, press alt+insert

    public RecyclerAdapter(Context context, ArrayList<RecyclerModel> models) {
        this.context = context;
        this.models = models;
    }

    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {

//this line is inflate out Recyclerview_items
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items,parent,false);
//this will return our view to holder class
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {

        holder.RecyclerItemTxtView.setText(models.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}

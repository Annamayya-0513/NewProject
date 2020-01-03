package com.example.newproject;

import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;

import java.util.ArrayList;

public class SimpleRecyclerView extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_recycler_view);
//create a model class(pojo)
//now create a myholder class
//now create a Adapter class
//now in the main class

        recyclerView = (RecyclerView)findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));  ///Create recyclerview

        recyclerAdapter = new RecyclerAdapter(this,getMylist());
        recyclerView.setAdapter(recyclerAdapter);
    }

    private ArrayList<RecyclerModel> getMylist(){

        ArrayList<RecyclerModel> models = new ArrayList<>();

        RecyclerModel model = new RecyclerModel();
        model.setName("a");
        models.add(model);

        model = new RecyclerModel();
        model.setName("b");
        models.add(model);

        model = new RecyclerModel();
        model.setName("c");
        models.add(model);

        model = new RecyclerModel();
        model.setName("d");
        models.add(model);

        model = new RecyclerModel();
        model.setName("e");
        models.add(model);

        model = new RecyclerModel();
        model.setName("f");
        models.add(model);

        model = new RecyclerModel();
        model.setName("g");
        models.add(model);

        model = new RecyclerModel();
        model.setName("h");
        models.add(model);

        model = new RecyclerModel();
        model.setName("i ");
        models.add(model);

        model = new RecyclerModel();
        model.setName("j");
        models.add(model);

        model = new RecyclerModel();
        model.setName("k");
        models.add(model);

        model = new RecyclerModel();
        model.setName("l");
        models.add(model);

        model = new RecyclerModel();
        model.setName("m");
        models.add(model);

        model = new RecyclerModel();
        model.setName("n");
        models.add(model);

        model = new RecyclerModel();
        model.setName("o");
        models.add(model);

        model = new RecyclerModel();
        model.setName("p");
        models.add(model);

        model = new RecyclerModel();
        model.setName("q");
        models.add(model);


        model = new RecyclerModel();
        model.setName("r");
        models.add(model);


        return models;
    }
}

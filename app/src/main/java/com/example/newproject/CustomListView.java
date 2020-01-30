package com.example.newproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CustomListView extends AppCompatActivity {

    ListView CutomListView;
    String countrylist[] ={"USA","Spain","France","Germany","UK","Russia","China","Europe","Italy","Australia","India"};
    int flags[] ={R.drawable.ic_usa,R.drawable.ic_spain,R.drawable.ic_france,R.drawable.ic_germany,R.drawable.ic_uk,
            R.drawable.ic_russia,R.drawable.ic_china,R.drawable.ic_europe,R.drawable.ic_italy,R.drawable.ic_australia,
    R.drawable.ic_india};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        CutomListView =(ListView)findViewById(R.id.CutomListView);

        CustomListAdapter customListAdapter = new CustomListAdapter(getApplicationContext(),countrylist,flags);
        CutomListView.setAdapter(customListAdapter);
    }
}

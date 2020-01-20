package com.example.newproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class ListViewData extends AppCompatActivity {

    ListView ListViewData;
    TextView ListTxtView;
    String[] Data = {"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        initialize();
        onClick();
    }

    private void initialize() {

        ListViewData = (ListView)findViewById(R.id.ListViewData);
        ListTxtView = (TextView)findViewById(R.id.ListTxtView);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,Data);
        ListViewData.setAdapter(arrayAdapter);
    }

    private void onClick() {

        ListViewData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(ListViewData.this, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

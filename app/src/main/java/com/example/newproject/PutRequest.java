package com.example.newproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PutRequest extends AppCompatActivity {

    TextView PutTxtView;
    Button PutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put_request);



        PutTxtView = (TextView)findViewById(R.id.PostTxtView);
        PutButton=(Button) findViewById(R.id.PutButton);

        PutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}

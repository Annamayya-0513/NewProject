package com.example.newproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Splash extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT = 1000;

    ImageView AImageView;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        AImageView = (ImageView)findViewById(R.id.AImageView);
        progressBar = (ProgressBar)findViewById(R.id.ProgressBar);

        progressBar.setVisibility(View.VISIBLE);

//This method is used so that your splash activity
// can cover the entire screen.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

//Intent is used to switch from one activity to another.
                Intent intent = new Intent(Splash.this ,Login.class);
//invoke the SecondActivity.
                startActivity(intent);
//the current activity will get finished.
                finish();
            }
        },SPLASH_SCREEN_TIME_OUT);
    }
}

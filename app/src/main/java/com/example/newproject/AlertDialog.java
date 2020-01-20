package com.example.newproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.newproject.Fragments.AlertDialogFragment;

public class AlertDialog extends AppCompatActivity {

    Button AlertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        initialize();
        Onclick();
    }
    private void initialize() {

        AlertButton =(Button)findViewById(R.id.AlertButton);
    }

    private void Onclick() {
        AlertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                openDialog();

            }
        });
    }

    private void openDialog() {
        AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
        alertDialogFragment.show(getSupportFragmentManager(),"example Dialog");
    }

}

package com.example.newproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView Login,Signup;
    EditText UserName,Password;
    Button SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initilize();
        onClick();
        saveInfo();
    }
    private void initilize() {
        Login = (TextView)findViewById(R.id.LoginTxtView);
        Signup = (TextView)findViewById(R.id.SignupTxtView);
        UserName =(EditText)findViewById(R.id.UserNameEditTxt);
        Password =(EditText)findViewById(R.id.PasswordEditTxt);
        SignIn = (Button)findViewById(R.id.SignInButton);
    }
    private void onClick() {

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Login.this, BottomNavigation.class);
                startActivity(i);
            }
        });
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent singup = new Intent(Login.this,Registration.class);
                startActivity(singup);
            }
        });
    }
///save the user login info
    public void saveInfo(){

        SharedPreferences sharedPreferences = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor =sharedPreferences.edit();

        editor.putString("username",UserName.getText().toString());
        editor.putString("password",Password.getText().toString());
        editor.apply();

//        Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show();
    }
}

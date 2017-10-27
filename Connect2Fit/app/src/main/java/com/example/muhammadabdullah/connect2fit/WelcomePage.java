package com.example.muhammadabdullah.connect2fit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//push test
public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
    }

    public void trainerFindonClick(View v){
        Intent k = new Intent(this, findAtrainer.class);
        startActivity(k);

    }

    public void clientRegisteronClick(View v){
        Intent k = new Intent(this, SignUpPage.class);
        startActivity(k);
    }

    public void trainerRegisteronClick(View v){
        Intent k = new Intent(this, SignUpPage.class);
        startActivity(k);
    }


    public void SignInonClick(View v){
        Intent k = new Intent(this, SignInPage.class);
        startActivity(k);
    }
}
package com.example.muhammadabdullah.connect2fit.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.muhammadabdullah.connect2fit.R;

public class TrainerPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_trainer_page);


    }

    public void trainerFindonClick(View v){
        Intent k = new Intent(this, FindAtrainer.class);
        startActivity(k);

    }

}

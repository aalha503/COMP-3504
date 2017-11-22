package com.example.muhammadabdullah.connect2fit.ui;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.muhammadabdullah.connect2fit.R;

public class ClientPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_page);
    }

    public void trainerFindonClick(View v){
        Intent k = new Intent(this, FindAtrainer.class);
        startActivity(k);




    }

}

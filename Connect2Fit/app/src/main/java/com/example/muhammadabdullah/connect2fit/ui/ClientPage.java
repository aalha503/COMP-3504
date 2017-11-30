package com.example.muhammadabdullah.connect2fit.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
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

    public void viewTrainer(View v){
        Intent i = new Intent(ClientPage.this, TrainerPage.class);
        startActivity(i);

    }

    public void findMealPlan(View v){
        Intent mealGeneratorIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eatthismuch.com/"));
        startActivity(mealGeneratorIntent);
    }


}

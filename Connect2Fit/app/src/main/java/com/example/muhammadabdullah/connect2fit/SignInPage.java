package com.example.muhammadabdullah.connect2fit;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignInPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_sign_in_page);
    }



    public void registeronClick(View view){
        try {
            //change signupActivityclass to registerClass once done tutorial
            Intent k = new Intent(this, SignupActivity.class);
            startActivity(k);
        }catch (Exception e){

        }
    }

}

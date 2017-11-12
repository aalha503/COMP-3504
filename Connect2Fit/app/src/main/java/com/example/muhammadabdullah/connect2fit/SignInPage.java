package com.example.muhammadabdullah.connect2fit;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.example.muhammadabdullah.connect2fit.R.id.btnLogin;

public class SignInPage extends AppCompatActivity {

    //Absdul
    DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_sign_in_page);


    }

    //Absdul
    @Override
    protected void onStart() {
        super.onStart();
        //rootRef.child("Users");
        String users = "All users";
        String reviews = "Reviews";
        //rootRef.child(users).child(trainers).child("Trainer1").setValue("Muhammed");
        rootRef.child(users).push();
        rootRef.child(reviews).push();


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

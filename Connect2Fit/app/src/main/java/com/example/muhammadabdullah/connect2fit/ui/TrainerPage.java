package com.example.muhammadabdullah.connect2fit.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.muhammadabdullah.connect2fit.R;

public class TrainerPage extends AppCompatActivity {
    TextView tName;
    TextView tPhone;
    TextView tBio;
    ImageView tImg;
    public static int REQUEST_CODE = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_trainer_page);
        tName = (TextView) findViewById(R.id.trnName);
        tPhone =(TextView) findViewById(R.id.phoneText);
        tBio = (TextView) findViewById(R.id.bioText);
        tImg = (ImageView) findViewById(R.id.trnImg);

    }

    public void editTrainerProfile(View v){
        Intent i = new Intent(this, EditTrainer.class);
        startActivityForResult(i, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            String receivedName = data.getStringExtra("trainerName");
            tName.setText(receivedName);
            String receivedPhone = data.getStringExtra("trainerPhone");
            tPhone.setText(receivedPhone);
            String receivedBio = data.getStringExtra("trainerBio");
            tBio.setText(receivedBio);
            Bitmap img = data.getParcelableExtra("trainerImg");
            tImg.setBackground(null);
            tImg.setImageBitmap(img);
        }
    }
}

package com.example.muhammadabdullah.connect2fit.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.muhammadabdullah.connect2fit.R;

/**
 * Created by abdullahalhawsawi on 2017-11-24.
 */


public class EditTrainer extends AppCompatActivity implements View.OnClickListener {

    Button uploadBtn;
    ImageView imageToUpload;
    EditText nameText;
    EditText phoneNumText;
    EditText bioText;
    private boolean imgUploadedSuccessfully = false;
    private static final int RESULT_LOAD_IMAGE = 1;

    //define update intent,
    Intent updateIntent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_trainer);
        getIntent();
        uploadBtn = (Button) findViewById(R.id.uploadBtn);
        imageToUpload = (ImageView) findViewById(R.id.imgToUpload);
        nameText = (EditText) findViewById(R.id.nameText);
        phoneNumText = (EditText) findViewById(R.id.phoneNumText);
        bioText = (EditText) findViewById(R.id.bioText);
        uploadBtn.setOnClickListener(this);
        //initialize update intent, so you can use in onClick aka save info when SAVE btn pressed
        updateIntent = new Intent(this, TrainerPage.class);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //Case1: UPLOAD PIC
            case R.id.uploadBtn:
                Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
                break;
            //Case2: SAVE
            case R.id.updateBtn:
                if (nameText.getText().toString().trim().length() > 5) {
                    String textStr = nameText.getText().toString();
                    updateIntent.putExtra("trainerName", textStr);
                }
                if (phoneNumText.getText().toString().length() == 10) {
                    String phoneStr = phoneNumText.getText().toString();
                    updateIntent.putExtra("trainerPhone", phoneStr);

                }
                if (bioText.getText().toString().length() > 5) {
                    String bioStr = bioText.getText().toString();
                    updateIntent.putExtra("trainerBio", bioStr);
                }
                if (imgUploadedSuccessfully == true) {
                    imageToUpload.buildDrawingCache();
                    Bitmap image= imageToUpload.getDrawingCache();
                    updateIntent.putExtra("trainerImg", image);
                }
            case R.id.cancelBtn:
                setResult(RESULT_CANCELED, updateIntent);
                //super.finish();
            }
        }
    //finishing the intent coming from Trainer page and sending update intent
    @Override
    public void finish() {
        setResult(RESULT_OK, updateIntent);
        super.finish();
    }

    //FOR UPLOADING PIC
    //makes sure the requestCode is the right requestCode, aka data coming from gallery not anywhere else
    //makes sure resultCode is 1, aka everything went well when user selected image
    //makes sure data is not null!
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && data != null){
            Uri selectedImage = data.getData();
            imageToUpload.setImageURI(selectedImage);
            imgUploadedSuccessfully = true;

        }
    }
}

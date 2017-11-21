package com.example.muhammadabdullah.connect2fit.dataLayer;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Muhammad Abdullah on 11/20/2017.
 */

public class Diet{

    public String mealPlanID;
    public Food food;
    public int calories;
    public String foodType;


    public Diet(String mealPlanID, Food food) {
        this.mealPlanID = mealPlanID;
        this.food = food;
    }

    public String getMealPlanID() {
        return mealPlanID;
    }

    public void setMealPlanID(String mealPlanID) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        String key = database.getReference("Diet").push().getKey();
        this.mealPlanID = key;
    }

}

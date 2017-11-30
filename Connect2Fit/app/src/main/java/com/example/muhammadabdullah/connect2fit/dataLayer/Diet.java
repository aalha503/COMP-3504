package com.example.muhammadabdullah.connect2fit.dataLayer;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * Created by Muhammad Abdullah on 11/20/2017.
 */

public class Diet{

    public String mealPlanID;
    public ArrayList <Food> food;
    public int calories;


    public Diet(String mealPlanID, ArrayList<Food> food, int calories) {
        this.mealPlanID = mealPlanID;
        this.food = food;
        this.calories = calories;
    }

    public String getMealPlanID() {
        return mealPlanID;
    }

    public void setMealPlanID(String mealPlanID) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        String key = database.getReference("Diet").push().getKey();
        this.mealPlanID = key;
    }

    public ArrayList<Food> getFood() {
        return food;
    }

    public void setFood(ArrayList<Food> food) {
        this.food = food;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}

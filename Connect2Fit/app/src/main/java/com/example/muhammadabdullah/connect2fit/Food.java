package com.example.muhammadabdullah.connect2fit.dataLayer;

/**
 * Created by Muhammad Abdullah on 11/20/2017.
 */

public class Food {

    public String food;
    public int calories;
    public String foodType;

    public Food(String food, int calories, String foodType) {
        this.food = food;
        this.calories = calories;
        this.foodType = foodType;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

}

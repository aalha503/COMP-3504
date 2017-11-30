package com.example.muhammadabdullah.connect2fit.dataLayer;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Muhammad Abdullah on 11/20/2017.
 */

public class DataLayer {
    private static DataLayer instance = null;

    //WourkPlans
    ArrayList<Workout> muscleGain = new ArrayList<Workout>();
    ArrayList<Workout> powerLifter = new ArrayList<Workout>();
    ArrayList<Workout> bodyBuilder = new ArrayList<Workout>();
    ArrayList<Workout> weightLifter = new ArrayList<Workout>();

    //Diets
    ArrayList<Food> standardDiet = new ArrayList<Food>();
    ArrayList<Food> veGanDiet = new ArrayList<Food>();
    ArrayList<Food> veGetarianDiet = new ArrayList<Food>();
    ArrayList<Food> fatLossDiet = new ArrayList<Food>();
    ArrayList<Food> muscleGainDiet = new ArrayList<Food>();
    ArrayList<Food> powerLifterDiet = new ArrayList<Food>();
    ArrayList<Food> weightLifterDiet = new ArrayList<Food>();
    ArrayList<Food> bodyBuilderDiet = new ArrayList<Food>();

    public int calories;
    public int foodSum;


    public static DataLayer getInstance() {
        if (instance == null) instance = new DataLayer();

        return instance;
    }

    public DataLayer() {

    }


    public UserInformation getTrainerInfo(String uID) {
        UserInformation info = new UserInformation("test@mtroyal.ca", "Jordan", "Kidney", "male", "123 Seaseme street", 185, "5'11", false, "description", "Trainer");


        return info;
    }

    public UserInformation getClientInfo(String uID) {
        UserInformation info = new UserInformation("test@mtroyal.ca", "Muhammad", "Abdullah", "male", "123 Seaseme street", 185, "5'11", false, "description", "Client");


        return info;
    }


    public WorkoutPlan createMuscleGainPlan(String uID) {


        muscleGain.add(new Workout("BenchPress", 3, 8, "Chest"));
        muscleGain.add(new Workout("Rear Squat", 3, 8, "Legs"));
        muscleGain.add(new Workout("Deadlift", 3, 8, "Back"));
        muscleGain.add(new Workout("Inclince bench", 3, 8, "Chest"));
        muscleGain.add(new Workout("Front Squats", 3, 8, "Legs"));
        muscleGain.add(new Workout("BentOver Rows", 3, 8, "Back"));

        WorkoutPlan info = new WorkoutPlan("1", muscleGain);
        return info;
    }

    public WorkoutPlan createPowerlifterPlan() {
        powerLifter.add(new Workout("BenchPress", 5, 5, "Chest"));
        powerLifter.add(new Workout("Rear Squat", 5, 5, "Legs"));
        powerLifter.add(new Workout("Deadlift", 5, 5, "Back"));
        powerLifter.add(new Workout("Inclince bench", 5, 5, "Chest"));
        powerLifter.add(new Workout("Front Squats", 5, 5, "Legs"));
        powerLifter.add(new Workout("BentOver Rows", 5, 5, "Back"));

        WorkoutPlan info = new WorkoutPlan("2", powerLifter);
        return info;
    }

    public WorkoutPlan createWeightLifterPlan() {
        weightLifter.add(new Workout("BenchPress", 3, 12, "Chest"));
        weightLifter.add(new Workout("Rear Squat", 3, 12, "Legs"));
        weightLifter.add(new Workout("Deadlift", 3, 12, "Back"));
        weightLifter.add(new Workout("Inclince bench", 3, 12, "Chest"));
        weightLifter.add(new Workout("Front Squats", 3, 12, "Legs"));
        weightLifter.add(new Workout("BentOver Rows", 3, 12, "Back"));

        WorkoutPlan info = new WorkoutPlan("3", weightLifter);
        return info;
    }

    public WorkoutPlan createBodyBuilderPlan() {
        bodyBuilder.add(new Workout("BenchPress", 5, 12, "Chest"));
        bodyBuilder.add(new Workout("Rear Squat", 5, 12, "Legs"));
        bodyBuilder.add(new Workout("Deadlift", 5, 12, "Back"));
        bodyBuilder.add(new Workout("Inclince bench", 5, 12, "Chest"));
        bodyBuilder.add(new Workout("Front Squats", 5, 12, "Legs"));
        bodyBuilder.add(new Workout("BentOver Rows", 5, 12, "Back"));

        WorkoutPlan info = new WorkoutPlan("4", bodyBuilder);
        return info;
    }

    public int calculatetotalCaloriesinDiet(ArrayList<Food> food) {
        int foodAmount = 0;
        calories = 0;

        while (foodAmount <= food.size()) {
            foodSum += food.get(foodAmount).getCalories();
            foodAmount++;
        }

        return foodSum;
    }


    public Diet createStandardDiet() {

        standardDiet.add(new Food("tofu", 200, "carbs"));
        standardDiet.add(new Food("rice",400,"carbs"));


        foodSum = calculatetotalCaloriesinDiet(standardDiet);
        Diet info = new Diet("1", standardDiet, foodSum);
        return info;
    }


    /*

        public Diet createVeganDiet(){

        Diet info = new Diet();
        return info;
    }

    public Diet createVegetarianDiet(){

    }

    public Diet createFatLossDiet(){

    }

    public Diet createMuscleGainDiet(){

    }

    public Diet createPowerlifterDiet(){

    }

    public Diet createWeightLifterDiet(){

    }

    public Diet createBodyBuilderDiet(){

    }


*/
}




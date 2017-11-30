package com.example.muhammadabdullah.connect2fit.dataLayer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Muhammad Abdullah on 11/20/2017.
 */

public class WorkoutPlan {
    public String workoutID;
    public ArrayList<Workout> workout;

    public WorkoutPlan(String workoutID, ArrayList<Workout> workout) {
        this.workoutID = workoutID;
        this.workout = workout;
    }

    public String getWorkoutID() {
        return workoutID;
    }

    public void setWorkoutID(String workoutID) {
        this.workoutID = workoutID;
    }

    public ArrayList<Workout> getWorkout() {
        return workout;
    }

    public void setWorkout(ArrayList<Workout> workout) {
        this.workout = workout;
    }
}

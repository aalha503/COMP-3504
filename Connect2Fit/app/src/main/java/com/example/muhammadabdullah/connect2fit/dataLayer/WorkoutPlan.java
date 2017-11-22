package com.example.muhammadabdullah.connect2fit.dataLayer;

/**
 * Created by Muhammad Abdullah on 11/20/2017.
 */

public class WorkoutPlan {
    public String workoutID;
    public Workout workout;

    public WorkoutPlan(String workoutID, Workout workout) {
        this.workoutID = workoutID;
        this.workout = workout;
    }

    public String getWorkoutID() {
        return workoutID;
    }

    public void setWorkoutID(String workoutID) {
        this.workoutID = workoutID;
    }
}

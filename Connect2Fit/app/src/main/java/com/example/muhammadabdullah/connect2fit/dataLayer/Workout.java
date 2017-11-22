package com.example.muhammadabdullah.connect2fit.dataLayer;

/**
 * Created by Muhammad Abdullah on 11/20/2017.
 */

class Workout {
    public String workoutType;
    public int setRange;
    public int repRange;
    public String muscle_influence;


    public Workout(String workoutType, int setRange, int repRange, String muscle_influence) {
        this.workoutType = workoutType;
        this.setRange = setRange;
        this.repRange = repRange;
        this.muscle_influence = muscle_influence;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    public int getSetRange() {
        return setRange;
    }

    public void setSetRange(int setRange) {
        this.setRange = setRange;
    }

    public int getRepRange() {
        return repRange;
    }

    public void setRepRange(int repRange) {
        this.repRange = repRange;
    }

    public String getMuscle_influence() {
        return muscle_influence;
    }

    public void setMuscle_influence(String muscle_influence) {
        this.muscle_influence = muscle_influence;
    }
}

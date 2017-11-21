package com.example.muhammadabdullah.connect2fit.dataLayer;

import static android.R.attr.name;

/**
 * Created by Muhammad Abdullah on 11/14/2017.
 */

public class UserInformation  {

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String address;
    private String userType;
    private int weight;
    private String height;
    private boolean tcConnection ;
    private String description;
    private String clientType;

    public UserInformation(String email, String firstName, String lastName,String gender,String address,int weight,String height,boolean tcConnection,String description,String clientType) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.weight = weight;
        this.height = height;
        this.tcConnection = tcConnection;
        this.description = description;
        this.clientType = clientType;

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender){ this.gender = gender; }

    public String getGender(){return gender; }

    public void setAddress(String address){ this.address = address;}

    public String getAddress(){return address; }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public boolean isTcConnection() {
        return tcConnection;
    }

    public void setTcConnection(boolean tcConnection) {
        this.tcConnection = tcConnection;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", userType='" + userType + '\'' +
                ", weight=" + weight +
                ", height='" + height + '\'' +
                ", tcConnection=" + tcConnection +
                ", description='" + description + '\'' +
                ", clientType='" + clientType + '\'' +
                '}';
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
}
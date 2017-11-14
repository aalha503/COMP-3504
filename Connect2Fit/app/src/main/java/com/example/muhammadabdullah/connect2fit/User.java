package com.example.muhammadabdullah.connect2fit;

/**
 * Created by abdullahalhawsawi on 2017-11-12.
 */

public class User {

    private String userName;
    private String email;
    private String type;

    public User(String userName, String email, String type){
        this.userName = userName;
        this.email = email;
    }

    protected void setName(String newName){
        userName = newName;

    }

    public String getUserName(){
        return userName;
    }

}

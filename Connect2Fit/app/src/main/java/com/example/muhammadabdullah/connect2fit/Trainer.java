package com.example.muhammadabdullah.connect2fit;

/**
 * Created by abdullahalhawsawi on 2017-11-12.
 */


public class Trainer extends User{

    private String bio;
    private boolean acceptNewClients = true;
    private boolean showProfile = true;

    public Trainer(String userName, String email, String type) {
        super(userName, email, type);
    }

    private void setBio(String boi){
        this.bio = bio;
    }

    @Override
    protected void setName(String newName) {
        super.setName(newName);
    }

    private void hideProfile(){
        showProfile = false;
    }

    private void dontAcceptNewClient(){
        acceptNewClients = false;
    }

    public boolean acceptingClients(){
        return acceptNewClients;
    }

    public boolean showProfileStatus(){
        return showProfile;
    }

}

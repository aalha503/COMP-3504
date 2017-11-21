package com.example.muhammadabdullah.connect2fit.dataLayer;

/**
 * Created by Muhammad Abdullah on 11/20/2017.
 */

public class DataLayer
{
   private static DataLayer instance = null;


    public static DataLayer getInstance()
    {
        if(instance == null) instance = new DataLayer();

        return instance;
    }

    public DataLayer()
    {

    }


     public  UserInformation getTrainerInfo(String uID)
     {
        UserInformation info = new UserInformation();


         return info;
     }



}

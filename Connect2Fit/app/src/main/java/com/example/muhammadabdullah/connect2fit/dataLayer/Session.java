package com.example.muhammadabdullah.connect2fit.dataLayer;

/**
 * Created by Muhammad Abdullah on 11/20/2017.
 */

public class Session {
    private String sessionID;
    private String sessionDate;
    private String sessionTime;

    public Session(String sessionID, String sessionDate, String sessionTime) {
        this.sessionID = sessionID;
        this.sessionDate = sessionDate;
        this.sessionTime = sessionTime;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }

    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }

    @Override
    public String toString() {
        return "Session{" +
                "sessionID='" + sessionID + '\'' +
                ", sessionDate='" + sessionDate + '\'' +
                ", sessionTime='" + sessionTime + '\'' +
                '}';
    }
}

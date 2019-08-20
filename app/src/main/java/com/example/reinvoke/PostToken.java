package com.example.reinvoke;

public class PostToken {
    private String userID;

    public PostToken(String userID, String participant) {
        this.userID = userID;
        this.participant = participant;
    }

    private String participant;

    public String getUserID ()
    {
        return userID;
    }

    public void setUserID (String userID)
    {
        this.userID = userID;
    }

    public String getParticipant ()
    {
        return participant;
    }

    public void setParticipant (String participant)
    {
        this.participant = participant;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [userID = "+userID+", participant = "+participant+"]";
    }
}

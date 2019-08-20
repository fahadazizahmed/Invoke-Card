package com.example.reinvoke;

public class MyPojo {

    private String access_token;

    private String success;

    public String getAccess_token ()
    {
        return access_token;
    }

    public void setAccess_token (String access_token)
    {
        this.access_token = access_token;
    }

    public String getSuccess ()
    {
        return success;
    }

    public void setSuccess (String success)
    {
        this.success = success;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [access_token = "+access_token+", success = "+success+"]";
    }
}

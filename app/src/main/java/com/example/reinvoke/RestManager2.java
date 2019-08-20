package com.example.reinvoke;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RestManager2 {

    AuthInterface restInterface;

    String BASE_URL = "http://165.22.57.93:3001/api/";



    public AuthInterface getServices(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(ScalarsConverterFactory.create()).build();
        restInterface = retrofit.create(AuthInterface.class);
        return restInterface;
    }


}


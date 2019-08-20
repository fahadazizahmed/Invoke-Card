package com.example.reinvoke;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestManager {

        ApiInterface restInterface;

        String BASE_URL = "http://165.22.57.93:3002/";



        public ApiInterface getServices(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        restInterface = retrofit.create(ApiInterface.class);
        return restInterface;
    }


}

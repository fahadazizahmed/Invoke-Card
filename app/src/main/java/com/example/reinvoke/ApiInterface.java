package com.example.reinvoke;

import retrofit2.Call;
import retrofit2.http.*;

public interface ApiInterface {

    @GET("jwt/login")
        Call<MyPojo> getToken();




}

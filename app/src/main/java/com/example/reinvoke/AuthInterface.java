package com.example.reinvoke;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthInterface {
    @POST("system/identities/issue")
    Call<String> send(@Body PostToken postToken);
}

package com.example.reinvoke;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.Calendar;

public class Main3Activity extends AppCompatActivity {
    RestManager restManager;
    RestManager2 restManager2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button = (Button)findViewById(R.id.cl);
        restManager = new RestManager();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<MyPojo> call = restManager.getServices().getToken();
                Log.d("url",call.request().url().toString());

                call.enqueue(new Callback<MyPojo>() {
                    @Override
                    public void onResponse(Call<MyPojo> call, Response<MyPojo> response) {
                        Log.d("Token",response.body().toString());
                        if(response.isSuccessful()){

                        }
                    }

                    @Override
                    public void onFailure(Call<MyPojo> call, Throwable t) {
                        Log.d("error",t.getMessage());

                    }
                });

//                restManager2 = new RestManager2();
//                PostToken postToken = new PostToken("478po","org.shipping.bitnautic.Shipper#fahad.aziz@miranz.net");
//
//                Call<String> stringCall = restManager2.getServices().send(postToken);
//                stringCall.enqueue(new Callback<String>() {
//                    @Override
//                    public void onResponse(Call<String> call, Response<String> response) {
//                        if (response.isSuccessful()) {
//                            String responseString = response.body();
//                            Log.d("erroccccr",responseString);
//                            // todo: do something with the response string
//                        }
//
//                    }
//
//                    @Override
//                    public void onFailure(Call<String> call, Throwable t) {
//
//                    }
//                });
//

























            }

        });




    }




}

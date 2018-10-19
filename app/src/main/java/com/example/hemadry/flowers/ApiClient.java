package com.example.hemadry.flowers;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL="http://services.hanselandpetal.com/";
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofit()
    {
        if (retrofit ==null)
        {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

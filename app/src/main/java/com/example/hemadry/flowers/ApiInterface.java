package com.example.hemadry.flowers;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("feeds/flowers.json")
    Call<List<Flower>>getFlower();
}

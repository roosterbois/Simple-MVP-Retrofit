package com.example.jean.retrofitexample.service;

import com.example.jean.retrofitexample.model.Data;
import com.example.jean.retrofitexample.model.RestResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface ListAPI {
//
//    @GET("player")
//    Call<RestResponse> getResults();

    @GET("history")
    Call<RestResponse> getHistory();
//
//    @GET("country/get/iso2code/{alpha2_code}")
//    Call<Data> getByAlpha2Code(@Path("alpha2_code") String alpha2Code);
}

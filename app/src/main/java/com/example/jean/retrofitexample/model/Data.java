package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;


public class Data {

    @SerializedName("RestResponse")
    private RestResponse restResponse;

    public RestResponse getRestResponse() {
        return restResponse;
    }
}

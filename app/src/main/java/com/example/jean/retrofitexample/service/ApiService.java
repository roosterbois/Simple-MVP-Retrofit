package com.example.jean.retrofitexample.service;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class ApiService {
    private Retrofit retrofit = null;
    static OkHttpClient okHttpClient;


    /**
     * This method creates a new instance of the API interface.
     *
     * @return The API interface
     */
    public ListAPI getAPI() {
        String BASE_URL = "https://private-0e6b9-ganjarwidiatmansyah.apiary-mock.com/";

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(ListAPI.class);
    }
}

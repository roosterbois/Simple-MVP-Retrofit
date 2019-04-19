package com.example.jean.retrofitexample.presenter;

import com.example.jean.retrofitexample.model.Club;
import com.example.jean.retrofitexample.model.RestResponse;
import com.example.jean.retrofitexample.service.ApiService;
import com.example.jean.retrofitexample.view.FootbalView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * This class represents the country view interface.
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 29/07/16.
 * Jesus loves you.
 */
public class PlayerPresenter {

    private FootbalView footbalView;
    private ApiService apiService;

    public PlayerPresenter(FootbalView view) {
        this.footbalView = view;

        if (this.apiService == null) {
            this.apiService = new ApiService();
        }
    }

    public void getPlayers() {

        apiService
                .getAPI()
                .getHistory()
                .enqueue(new Callback<RestResponse>() {
                    @Override
                    public void  onResponse (Call<RestResponse> call,Response<RestResponse> response) {
                        RestResponse data = response.body();

                        if (data != null && data.getHistory() != null) {
                            List<Club> history = data.getHistory();
                            footbalView.listOfPlayers(history);
                        }
                    }


                    @Override
                    public void onFailure(Call<RestResponse> call, Throwable t) {

                    }
                }) ;



    }


}


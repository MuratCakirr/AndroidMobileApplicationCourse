package com.example.retrofitjava.service;

import com.example.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("prices?key=f7b0a0bff160fca3a020a41c9ed58233")
    Observable<List<CryptoModel>> getData();

    //Call<List<CryptoModel>> getData();

}

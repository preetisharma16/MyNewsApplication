package com.example.mynewsapplication.api;

import com.example.mynewsapplication.models.NewsData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsInterface {

    //gets the top headlines
    @GET("top-headlines")
    Call<NewsData> getTopNews(

            @Query("country") String country ,
            @Query("apiKey") String apiKey

    );

    //Gets all the news for the search bar
    @GET("everything")
    Call<NewsData> getNSearch(
            @Query("q") String keyword,
            @Query("language") String language,
            @Query("sortBy") String sortBy,
            @Query("apikey") String apikey

    );

}

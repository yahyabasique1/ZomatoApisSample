package com.example.admin.ZomatoApiSample.NetworkCalls;


import com.example.admin.ZomatoApiSample.Model.RestaurantFullModel;
import com.example.admin.ZomatoApiSample.Model.ReviewsModel;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiInterface {

    @Headers({
            "Accept: application/json",
            "user-key: YOURKEY"
    })
    @GET("geocode")
    Observable<RestaurantFullModel> getRestaurantList(
                                                      @Query("lat") double lat,
                                                      @Query("lon") double lon);
    @Headers({
            "Accept: application/json",
            "user-key: YOURKEY"
    })
    @GET("reviews")
    Observable<ReviewsModel> getUserReviews(
                                      @Query("res_id") int resid,
                                      @Query("start") int start,
                                      @Query("count") int count);

}

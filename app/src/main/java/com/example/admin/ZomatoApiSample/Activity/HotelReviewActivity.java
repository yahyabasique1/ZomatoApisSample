package com.example.admin.ZomatoApiSample.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.admin.ZomatoApiSample.Adapter.HotelReviewAdapter;
import com.example.admin.ZomatoApiSample.Model.ReviewsModel;
import com.example.admin.ZomatoApiSample.R;
import com.example.admin.ZomatoApiSample.NetworkCalls.ApiClient;
import com.example.admin.ZomatoApiSample.NetworkCalls.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class HotelReviewActivity extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;
    ApiInterface apiInterface;
    List<ReviewsModel.UserReview> reviewsModelList;
    HotelReviewAdapter hotelReviewAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_review);
        getSupportActionBar().setTitle("Hotel Reviews");


        context=this;

        apiInterface= ApiClient.getClient().create(ApiInterface.class);

        recyclerView=findViewById(R.id.hotelreview_recycler);

        Integer resId=getIntent().getIntExtra("resid",0);
        reviewsModelList=new ArrayList<>();

        setReviewList(resId);



    }

    private void setReviewList(Integer resId) {


        Observable<ReviewsModel> observable=apiInterface.getUserReviews(resId,0,15);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResults,this::handleError);

    }

    private void handleError(Throwable throwable) {
    }

    private void handleResults(ReviewsModel reviewsModel) {

        reviewsModelList.addAll(reviewsModel.getUserReviews());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        hotelReviewAdapter=new HotelReviewAdapter(context,reviewsModelList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(hotelReviewAdapter);
        hotelReviewAdapter.notifyDataSetChanged();


    }

    @Override
    public void onBackPressed() {
      Intent intent=new Intent(this,HomeActivity.class);
      startActivity(intent);
      finish();
    }
}

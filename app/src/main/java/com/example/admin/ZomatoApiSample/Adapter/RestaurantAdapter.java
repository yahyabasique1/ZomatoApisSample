package com.example.admin.ZomatoApiSample.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.admin.ZomatoApiSample.Activity.HotelReviewActivity;
import com.example.admin.ZomatoApiSample.Model.RestaurantFullModel;
import com.example.admin.ZomatoApiSample.R;

import java.util.ArrayList;
import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.MyViewHolder> {
    Context context;
    List<RestaurantFullModel.NearbyRestaurant> list=new ArrayList<>();
    RequestOptions requestOptions=new RequestOptions();


    public RestaurantAdapter(Context context, List<RestaurantFullModel.NearbyRestaurant> list) {
    this.context=context;
    this.list=list;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.restaurant_list,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        requestOptions.diskCacheStrategy(DiskCacheStrategy.NONE);
        requestOptions.skipMemoryCache(true);

        RestaurantFullModel.NearbyRestaurant nearbyRestaurant=list.get(position);
        final RestaurantFullModel.Restaurant restaurant=nearbyRestaurant.getRestaurant();

        holder.hotelRating.setText("Rating is "+restaurant.getUserRating().getRatingText()+"\n"+"Total rating "+restaurant.getUserRating().getAggregateRating());
        holder.hotelAddress.setText(restaurant.getLocation().getAddress());
        holder.hotelName.setText(restaurant.getName());


        String imageUrl=restaurant.getThumb();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer resId=restaurant.getR().getResId();
                Intent intent=new Intent(context, HotelReviewActivity.class);
                intent.putExtra("resid",resId);
                context.startActivity(intent);
            }
        });

        holder.openmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lat=restaurant.getLocation().getLatitude();
                String lon=restaurant.getLocation().getLongitude();
                String title=restaurant.getName();
                String geoUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lon + " (" + title + ")";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                context.startActivity(intent);
            }
        });

        Glide.with(context)
                .load(imageUrl)
                .apply(requestOptions)
                .into(holder.hotelImage);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView hotelImage,openmap;
        TextView hotelName,hotelAddress,hotelRating;
        public MyViewHolder(View itemView) {
            super(itemView);
            hotelImage=itemView.findViewById(R.id.hotel_iv);
            hotelName=itemView.findViewById(R.id.hotel_name);
            hotelAddress=itemView.findViewById(R.id.hotel_address);
            hotelRating=itemView.findViewById(R.id.hotel_rating);
            openmap=itemView.findViewById(R.id.mapplace);
        }
    }
}

package com.example.admin.ZomatoApiSample.Adapter;

import android.content.Context;
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
import com.example.admin.ZomatoApiSample.Model.ReviewsModel;
import com.example.admin.ZomatoApiSample.R;

import java.util.ArrayList;
import java.util.List;

public class HotelReviewAdapter extends RecyclerView.Adapter<HotelReviewAdapter.ViewHolder> {
    Context context;
    List<ReviewsModel.UserReview> list=new ArrayList<>();
    RequestOptions requestOptions=new RequestOptions();


    public HotelReviewAdapter(Context context, List<ReviewsModel.UserReview> list){
        this.context=context;
        this.list=list;
    }


    @NonNull
    @Override
    public HotelReviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.review_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelReviewAdapter.ViewHolder holder, final int position) {
        requestOptions.circleCrop();
        requestOptions.diskCacheStrategy(DiskCacheStrategy.NONE);
        requestOptions.skipMemoryCache(true);

       // ReviewsModel.UserReview userReview=userReviews.get(position);
        ReviewsModel.UserReview user=list.get(position);

        String imageUrl=user.getReview().getUser().getProfileImage();
        Glide.with(context)
                .load(imageUrl)
                .apply(requestOptions)
                .into(holder.profileUrl);

        holder.comment.setText(user.getReview().getReviewText());
        holder.name.setText(user.getReview().getUser().getName());
        holder.rating.setText("Rating "+user.getReview().getRating()+" "+user.getReview().getRatingText());

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position,list.size());            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profileUrl,delete;
        TextView rating,name,comment;
        public ViewHolder(View itemView) {
            super(itemView);
            profileUrl=itemView.findViewById(R.id.review_iv);
            delete=itemView.findViewById(R.id.reviewDel);
            rating=itemView.findViewById(R.id.userRating);
            name=itemView.findViewById(R.id.username);
            comment=itemView.findViewById(R.id.comment);

        }
    }
}

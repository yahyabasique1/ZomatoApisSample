package com.example.admin.ZomatoApiSample.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;



public class ReviewsModel {

    @SerializedName("reviews_count")
    @Expose
    private Integer reviewsCount;
    @SerializedName("reviews_start")
    @Expose
    private Integer reviewsStart;
    @SerializedName("reviews_shown")
    @Expose
    private Integer reviewsShown;
    @SerializedName("user_reviews")
    @Expose
    private List<UserReview> userReviews = null;
    @SerializedName("Respond to reviews via Zomato Dashboard")
    @Expose
    private String respondToReviewsViaZomatoDashboard;

    /**
     * No args constructor for use in serialization
     *
     */
    public ReviewsModel() {
    }

    /**
     *
     * @param reviewsShown
     * @param respondToReviewsViaZomatoDashboard
     * @param userReviews
     * @param reviewsStart
     * @param reviewsCount
     */
    public ReviewsModel(Integer reviewsCount, Integer reviewsStart, Integer reviewsShown, List<UserReview> userReviews, String respondToReviewsViaZomatoDashboard) {
        super();
        this.reviewsCount = reviewsCount;
        this.reviewsStart = reviewsStart;
        this.reviewsShown = reviewsShown;
        this.userReviews = userReviews;
        this.respondToReviewsViaZomatoDashboard = respondToReviewsViaZomatoDashboard;
    }

    public Integer getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public Integer getReviewsStart() {
        return reviewsStart;
    }

    public void setReviewsStart(Integer reviewsStart) {
        this.reviewsStart = reviewsStart;
    }

    public Integer getReviewsShown() {
        return reviewsShown;
    }

    public void setReviewsShown(Integer reviewsShown) {
        this.reviewsShown = reviewsShown;
    }

    public List<UserReview> getUserReviews() {
        return userReviews;
    }

    public void setUserReviews(List<UserReview> userReviews) {
        this.userReviews = userReviews;
    }

    public String getRespondToReviewsViaZomatoDashboard() {
        return respondToReviewsViaZomatoDashboard;
    }

    public void setRespondToReviewsViaZomatoDashboard(String respondToReviewsViaZomatoDashboard) {
        this.respondToReviewsViaZomatoDashboard = respondToReviewsViaZomatoDashboard;
    }

   public class Review {

        @SerializedName("rating")
        @Expose
        private Integer rating;
        @SerializedName("review_text")
        @Expose
        private String reviewText;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("rating_color")
        @Expose
        private String ratingColor;
        @SerializedName("review_time_friendly")
        @Expose
        private String reviewTimeFriendly;
        @SerializedName("rating_text")
        @Expose
        private String ratingText;
        @SerializedName("timestamp")
        @Expose
        private Integer timestamp;
        @SerializedName("likes")
        @Expose
        private Integer likes;
        @SerializedName("user")
        @Expose
        private User user;
        @SerializedName("comments_count")
        @Expose
        private Integer commentsCount;

        /**
         * No args constructor for use in serialization
         *
         */
        public Review() {
        }

        /**
         *
         * @param timestamp
         * @param id
         * @param reviewTimeFriendly
         * @param ratingColor
         * @param reviewText
         * @param likes
         * @param commentsCount
         * @param rating
         * @param user
         * @param ratingText
         */
        public Review(Integer rating, String reviewText, Integer id, String ratingColor, String reviewTimeFriendly, String ratingText, Integer timestamp, Integer likes, User user, Integer commentsCount) {
            super();
            this.rating = rating;
            this.reviewText = reviewText;
            this.id = id;
            this.ratingColor = ratingColor;
            this.reviewTimeFriendly = reviewTimeFriendly;
            this.ratingText = ratingText;
            this.timestamp = timestamp;
            this.likes = likes;
            this.user = user;
            this.commentsCount = commentsCount;
        }

        public Integer getRating() {
            return rating;
        }

        public void setRating(Integer rating) {
            this.rating = rating;
        }

        public String getReviewText() {
            return reviewText;
        }

        public void setReviewText(String reviewText) {
            this.reviewText = reviewText;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getRatingColor() {
            return ratingColor;
        }

        public void setRatingColor(String ratingColor) {
            this.ratingColor = ratingColor;
        }

        public String getReviewTimeFriendly() {
            return reviewTimeFriendly;
        }

        public void setReviewTimeFriendly(String reviewTimeFriendly) {
            this.reviewTimeFriendly = reviewTimeFriendly;
        }

        public String getRatingText() {
            return ratingText;
        }

        public void setRatingText(String ratingText) {
            this.ratingText = ratingText;
        }

        public Integer getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
        }

        public Integer getLikes() {
            return likes;
        }

        public void setLikes(Integer likes) {
            this.likes = likes;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Integer getCommentsCount() {
            return commentsCount;
        }

        public void setCommentsCount(Integer commentsCount) {
            this.commentsCount = commentsCount;
        }

    }
  public   class User {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("foodie_level")
        @Expose
        private String foodieLevel;
        @SerializedName("foodie_level_num")
        @Expose
        private Integer foodieLevelNum;
        @SerializedName("foodie_color")
        @Expose
        private String foodieColor;
        @SerializedName("profile_url")
        @Expose
        private String profileUrl;
        @SerializedName("profile_image")
        @Expose
        private String profileImage;
        @SerializedName("profile_deeplink")
        @Expose
        private String profileDeeplink;
        @SerializedName("zomato_handle")
        @Expose
        private String zomatoHandle;

        /**
         * No args constructor for use in serialization
         *
         */
        public User() {
        }

        /**
         *
         * @param profileDeeplink
         * @param zomatoHandle
         * @param profileImage
         * @param profileUrl
         * @param foodieColor
         * @param name
         * @param foodieLevel
         * @param foodieLevelNum
         */
        public User(String name, String foodieLevel, Integer foodieLevelNum, String foodieColor, String profileUrl, String profileImage, String profileDeeplink, String zomatoHandle) {
            super();
            this.name = name;
            this.foodieLevel = foodieLevel;
            this.foodieLevelNum = foodieLevelNum;
            this.foodieColor = foodieColor;
            this.profileUrl = profileUrl;
            this.profileImage = profileImage;
            this.profileDeeplink = profileDeeplink;
            this.zomatoHandle = zomatoHandle;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFoodieLevel() {
            return foodieLevel;
        }

        public void setFoodieLevel(String foodieLevel) {
            this.foodieLevel = foodieLevel;
        }

        public Integer getFoodieLevelNum() {
            return foodieLevelNum;
        }

        public void setFoodieLevelNum(Integer foodieLevelNum) {
            this.foodieLevelNum = foodieLevelNum;
        }

        public String getFoodieColor() {
            return foodieColor;
        }

        public void setFoodieColor(String foodieColor) {
            this.foodieColor = foodieColor;
        }

        public String getProfileUrl() {
            return profileUrl;
        }

        public void setProfileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
        }

        public String getProfileImage() {
            return profileImage;
        }

        public void setProfileImage(String profileImage) {
            this.profileImage = profileImage;
        }

        public String getProfileDeeplink() {
            return profileDeeplink;
        }

        public void setProfileDeeplink(String profileDeeplink) {
            this.profileDeeplink = profileDeeplink;
        }

        public String getZomatoHandle() {
            return zomatoHandle;
        }

        public void setZomatoHandle(String zomatoHandle) {
            this.zomatoHandle = zomatoHandle;
        }

    }


  public   class UserReview {

        @SerializedName("review")
        @Expose
        private Review review;

        /**
         * No args constructor for use in serialization
         *
         */
        public UserReview() {
        }

        /**
         *
         * @param review
         */
        public UserReview(Review review) {
            super();
            this.review = review;
        }

        public Review getReview() {
            return review;
        }

        public void setReview(Review review) {
            this.review = review;
        }

    }


}



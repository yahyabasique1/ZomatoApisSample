package com.example.admin.ZomatoApiSample.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RestaurantFullModel {

    @SerializedName("location")
    @Expose
    private Location locality;
    @SerializedName("popularity")
    @Expose
    private Popularity popularity;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("nearby_restaurants")
    @Expose
    private List<NearbyRestaurant> nearbyRestaurants = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public RestaurantFullModel() {
    }

    /**
     *
     * @param nearbyRestaurants
     * @param link
     * @param locality
     * @param popularity
     */
    public RestaurantFullModel(Location locality, Popularity popularity, String link, List<NearbyRestaurant> nearbyRestaurants) {
        super();
        this.locality = locality;
        this.popularity = popularity;
        this.link = link;
       this.nearbyRestaurants = nearbyRestaurants;
    }

    public Location getLocality() {
        return locality;
    }

    public void setLocality(Location locality) {
        this.locality = locality;
    }

    public Popularity getPopularity() {
        return popularity;
    }

    public void setPopularity(Popularity popularity) {
        this.popularity = popularity;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<NearbyRestaurant> getNearbyRestaurants() {
        return nearbyRestaurants;
    }

    public void setNearbyRestaurants(List<NearbyRestaurant> nearbyRestaurants) {
        this.nearbyRestaurants = nearbyRestaurants;
    }

   public class NearbyRestaurant {

        @SerializedName("restaurant")
        @Expose
        private Restaurant restaurant;

        /**
         * No args constructor for use in serialization
         *
         */
        public NearbyRestaurant() {
        }

        /**
         *
         * @param restaurant
         */
        public NearbyRestaurant(Restaurant restaurant) {
            super();
            this.restaurant = restaurant;
        }

        public Restaurant getRestaurant() {
            return restaurant;
        }

        public void setRestaurant(Restaurant restaurant) {
            this.restaurant = restaurant;
        }

    }

    class Location {

        @SerializedName("entity_type")
        @Expose
        private String entityType;
        @SerializedName("entity_id")
        @Expose
        private Integer entityId;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("latitude")
        @Expose
        private String latitude;
        @SerializedName("longitude")
        @Expose
        private String longitude;
        @SerializedName("city_id")
        @Expose
        private Integer cityId;
        @SerializedName("city_name")
        @Expose
        private String cityName;
        @SerializedName("country_id")
        @Expose
        private Integer countryId;
        @SerializedName("country_name")
        @Expose
        private String countryName;

        /**
         * No args constructor for use in serialization
         *
         */
        public Location() {
        }

        /**
         *
         * @param countryId
         * @param countryName
         * @param title
         * @param cityId
         * @param cityName
         * @param entityId
         * @param longitude
         * @param latitude
         * @param entityType
         */
        public Location(String entityType, Integer entityId, String title, String latitude, String longitude, Integer cityId, String cityName, Integer countryId, String countryName) {
            super();
            this.entityType = entityType;
            this.entityId = entityId;
            this.title = title;
            this.latitude = latitude;
            this.longitude = longitude;
            this.cityId = cityId;
            this.cityName = cityName;
            this.countryId = countryId;
            this.countryName = countryName;
        }

        public String getEntityType() {
            return entityType;
        }

        public void setEntityType(String entityType) {
            this.entityType = entityType;
        }

        public Integer getEntityId() {
            return entityId;
        }

        public void setEntityId(Integer entityId) {
            this.entityId = entityId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public Integer getCityId() {
            return cityId;
        }

        public void setCityId(Integer cityId) {
            this.cityId = cityId;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public Integer getCountryId() {
            return countryId;
        }

        public void setCountryId(Integer countryId) {
            this.countryId = countryId;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

    }
  public   class Location_ {

        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("locality")
        @Expose
        private String locality;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("city_id")
        @Expose
        private Integer cityId;
        @SerializedName("latitude")
        @Expose
        private String latitude;
        @SerializedName("longitude")
        @Expose
        private String longitude;
        @SerializedName("zipcode")
        @Expose
        private String zipcode;
        @SerializedName("country_id")
        @Expose
        private Integer countryId;
        @SerializedName("locality_verbose")
        @Expose
        private String localityVerbose;

        /**
         * No args constructor for use in serialization
         *
         */
        public Location_() {
        }

        /**
         *
         * @param countryId
         * @param cityId
         * @param address
         * @param zipcode
         * @param locality
         * @param longitude
         * @param localityVerbose
         * @param latitude
         * @param city
         */
        public Location_(String address, String locality, String city, Integer cityId, String latitude, String longitude, String zipcode, Integer countryId, String localityVerbose) {
            super();
            this.address = address;
            this.locality = locality;
            this.city = city;
            this.cityId = cityId;
            this.latitude = latitude;
            this.longitude = longitude;
            this.zipcode = zipcode;
            this.countryId = countryId;
            this.localityVerbose = localityVerbose;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getLocality() {
            return locality;
        }

        public void setLocality(String locality) {
            this.locality = locality;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Integer getCityId() {
            return cityId;
        }

        public void setCityId(Integer cityId) {
            this.cityId = cityId;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        public Integer getCountryId() {
            return countryId;
        }

        public void setCountryId(Integer countryId) {
            this.countryId = countryId;
        }

        public String getLocalityVerbose() {
            return localityVerbose;
        }

        public void setLocalityVerbose(String localityVerbose) {
            this.localityVerbose = localityVerbose;
        }

    }

     class Popularity {

        @SerializedName("popularity")
        @Expose
        private String popularity;
        @SerializedName("nightlife_index")
        @Expose
        private String nightlifeIndex;
        @SerializedName("nearby_res")
        @Expose
        private List<String> nearbyRes = null;
        @SerializedName("top_cuisines")
        @Expose
        private List<String> topCuisines = null;
        @SerializedName("popularity_res")
        @Expose
        private String popularityRes;
        @SerializedName("nightlife_res")
        @Expose
        private String nightlifeRes;
        @SerializedName("subzone")
        @Expose
        private String subzone;
        @SerializedName("subzone_id")
        @Expose
        private Integer subzoneId;
        @SerializedName("city")
        @Expose
        private String city;

        /**
         * No args constructor for use in serialization
         *
         */
        public Popularity() {
        }

        /**
         *
         * @param subzone
         * @param popularityRes
         * @param topCuisines
         * @param nightlifeIndex
         * @param nearbyRes
         * @param nightlifeRes
         * @param city
         * @param subzoneId
         * @param popularity
         */
        public Popularity(String popularity, String nightlifeIndex, List<String> nearbyRes, List<String> topCuisines, String popularityRes, String nightlifeRes, String subzone, Integer subzoneId, String city) {
            super();
            this.popularity = popularity;
            this.nightlifeIndex = nightlifeIndex;
            this.nearbyRes = nearbyRes;
            this.topCuisines = topCuisines;
            this.popularityRes = popularityRes;
            this.nightlifeRes = nightlifeRes;
            this.subzone = subzone;
            this.subzoneId = subzoneId;
            this.city = city;
        }

        public String getPopularity() {
            return popularity;
        }

        public void setPopularity(String popularity) {
            this.popularity = popularity;
        }

        public String getNightlifeIndex() {
            return nightlifeIndex;
        }

        public void setNightlifeIndex(String nightlifeIndex) {
            this.nightlifeIndex = nightlifeIndex;
        }

        public List<String> getNearbyRes() {
            return nearbyRes;
        }

        public void setNearbyRes(List<String> nearbyRes) {
            this.nearbyRes = nearbyRes;
        }

        public List<String> getTopCuisines() {
            return topCuisines;
        }

        public void setTopCuisines(List<String> topCuisines) {
            this.topCuisines = topCuisines;
        }

        public String getPopularityRes() {
            return popularityRes;
        }

        public void setPopularityRes(String popularityRes) {
            this.popularityRes = popularityRes;
        }

        public String getNightlifeRes() {
            return nightlifeRes;
        }

        public void setNightlifeRes(String nightlifeRes) {
            this.nightlifeRes = nightlifeRes;
        }

        public String getSubzone() {
            return subzone;
        }

        public void setSubzone(String subzone) {
            this.subzone = subzone;
        }

        public Integer getSubzoneId() {
            return subzoneId;
        }

        public void setSubzoneId(Integer subzoneId) {
            this.subzoneId = subzoneId;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

    }


    public class R {

        @SerializedName("res_id")
        @Expose
        private Integer resId;

        /**
         * No args constructor for use in serialization
         *
         */
        public R() {
        }

        /**
         *
         * @param resId
         */
        public R(Integer resId) {
            super();
            this.resId = resId;
        }

        public Integer getResId() {
            return resId;
        }

        public void setResId(Integer resId) {
            this.resId = resId;
        }

    }

   public class Restaurant {

       @SerializedName("R")
       @Expose
       private R r;
       @SerializedName("apikey")
       @Expose
       private String apikey;
       @SerializedName("id")
       @Expose
       private String id;
       @SerializedName("name")
       @Expose
       private String name;
       @SerializedName("url")
       @Expose
       private String url;
       @SerializedName("location")
       @Expose
       private Location_ location;
       @SerializedName("switch_to_order_menu")
       @Expose
       private Integer switchToOrderMenu;
       @SerializedName("cuisines")
       @Expose
       private String cuisines;
       @SerializedName("average_cost_for_two")
       @Expose
       private Integer averageCostForTwo;
       @SerializedName("price_range")
       @Expose
       private Integer priceRange;
       @SerializedName("currency")
       @Expose
       private String currency;
       @SerializedName("offers")
       @Expose
       private List<Object> offers = null;
       @SerializedName("opentable_support")
       @Expose
       private Integer opentableSupport;
       @SerializedName("is_zomato_book_res")
       @Expose
       private Integer isZomatoBookRes;
       @SerializedName("mezzo_provider")
       @Expose
       private String mezzoProvider;
       @SerializedName("is_book_form_web_view")
       @Expose
       private Integer isBookFormWebView;
       @SerializedName("book_form_web_view_url")
       @Expose
       private String bookFormWebViewUrl;
       @SerializedName("book_again_url")
       @Expose
       private String bookAgainUrl;
       @SerializedName("thumb")
       @Expose
       private String thumb;
       @SerializedName("user_rating")
       @Expose
       private UserRating userRating;
       @SerializedName("photos_url")
       @Expose
       private String photosUrl;
       @SerializedName("menu_url")
       @Expose
       private String menuUrl;
       @SerializedName("featured_image")
       @Expose
       private String featuredImage;
       @SerializedName("has_online_delivery")
       @Expose
       private Integer hasOnlineDelivery;
       @SerializedName("is_delivering_now")
       @Expose
       private Integer isDeliveringNow;
       @SerializedName("include_bogo_offers")
       @Expose
       private Boolean includeBogoOffers;
       @SerializedName("deeplink")
       @Expose
       private String deeplink;
       @SerializedName("is_table_reservation_supported")
       @Expose
       private Integer isTableReservationSupported;
       @SerializedName("has_table_booking")
       @Expose
       private Integer hasTableBooking;
       @SerializedName("events_url")
       @Expose
       private String eventsUrl;
       @SerializedName("order_url")
       @Expose
       private String orderUrl;
       @SerializedName("order_deeplink")
       @Expose
       private String orderDeeplink;
       @SerializedName("medio_provider")
       @Expose
       private Integer medioProvider;

       /**
        * No args constructor for use in serialization
        *
        */
       public Restaurant() {
       }

       /**
        *
        * @param mezzoProvider
        * @param eventsUrl
        * @param medioProvider
        * @param location
        * @param userRating
        * @param hasOnlineDelivery
        * @param orderDeeplink
        * @param includeBogoOffers
        * @param isDeliveringNow
        * @param isTableReservationSupported
        * @param currency
        * @param apikey
        * @param id
        * @param isBookFormWebView
        * @param name
        * @param cuisines
        * @param hasTableBooking
        * @param orderUrl
        * @param offers
        * @param bookAgainUrl
        * @param switchToOrderMenu
        * @param url
        * @param averageCostForTwo
        * @param priceRange
        * @param isZomatoBookRes
        * @param r
        * @param opentableSupport
        * @param photosUrl
        * @param menuUrl
        * @param deeplink
        * @param bookFormWebViewUrl
        * @param thumb
        * @param featuredImage
        */
       public Restaurant(R r, String apikey, String id, String name, String url, Location_ location, Integer switchToOrderMenu, String cuisines, Integer averageCostForTwo, Integer priceRange, String currency, List<Object> offers, Integer opentableSupport, Integer isZomatoBookRes, String mezzoProvider, Integer isBookFormWebView, String bookFormWebViewUrl, String bookAgainUrl, String thumb, UserRating userRating, String photosUrl, String menuUrl, String featuredImage, Integer hasOnlineDelivery, Integer isDeliveringNow, Boolean includeBogoOffers, String deeplink, Integer isTableReservationSupported, Integer hasTableBooking, String eventsUrl, String orderUrl, String orderDeeplink, Integer medioProvider) {
           super();
           this.r = r;
           this.apikey = apikey;
           this.id = id;
           this.name = name;
           this.url = url;
           this.location = location;
           this.switchToOrderMenu = switchToOrderMenu;
           this.cuisines = cuisines;
           this.averageCostForTwo = averageCostForTwo;
           this.priceRange = priceRange;
           this.currency = currency;
           this.offers = offers;
           this.opentableSupport = opentableSupport;
           this.isZomatoBookRes = isZomatoBookRes;
           this.mezzoProvider = mezzoProvider;
           this.isBookFormWebView = isBookFormWebView;
           this.bookFormWebViewUrl = bookFormWebViewUrl;
           this.bookAgainUrl = bookAgainUrl;
           this.thumb = thumb;
           this.userRating = userRating;
           this.photosUrl = photosUrl;
           this.menuUrl = menuUrl;
           this.featuredImage = featuredImage;
           this.hasOnlineDelivery = hasOnlineDelivery;
           this.isDeliveringNow = isDeliveringNow;
           this.includeBogoOffers = includeBogoOffers;
           this.deeplink = deeplink;
           this.isTableReservationSupported = isTableReservationSupported;
           this.hasTableBooking = hasTableBooking;
           this.eventsUrl = eventsUrl;
           this.orderUrl = orderUrl;
           this.orderDeeplink = orderDeeplink;
           this.medioProvider = medioProvider;
       }

       public R getR() {
           return r;
       }

       public void setR(R r) {
           this.r = r;
       }

       public String getApikey() {
           return apikey;
       }

       public void setApikey(String apikey) {
           this.apikey = apikey;
       }

       public String getId() {
           return id;
       }

       public void setId(String id) {
           this.id = id;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getUrl() {
           return url;
       }

       public void setUrl(String url) {
           this.url = url;
       }

       public Location_ getLocation() {
           return location;
       }

       public void setLocation(Location_ location) {
           this.location = location;
       }

       public Integer getSwitchToOrderMenu() {
           return switchToOrderMenu;
       }

       public void setSwitchToOrderMenu(Integer switchToOrderMenu) {
           this.switchToOrderMenu = switchToOrderMenu;
       }

       public String getCuisines() {
           return cuisines;
       }

       public void setCuisines(String cuisines) {
           this.cuisines = cuisines;
       }

       public Integer getAverageCostForTwo() {
           return averageCostForTwo;
       }

       public void setAverageCostForTwo(Integer averageCostForTwo) {
           this.averageCostForTwo = averageCostForTwo;
       }

       public Integer getPriceRange() {
           return priceRange;
       }

       public void setPriceRange(Integer priceRange) {
           this.priceRange = priceRange;
       }

       public String getCurrency() {
           return currency;
       }

       public void setCurrency(String currency) {
           this.currency = currency;
       }

       public List<Object> getOffers() {
           return offers;
       }

       public void setOffers(List<Object> offers) {
           this.offers = offers;
       }

       public Integer getOpentableSupport() {
           return opentableSupport;
       }

       public void setOpentableSupport(Integer opentableSupport) {
           this.opentableSupport = opentableSupport;
       }

       public Integer getIsZomatoBookRes() {
           return isZomatoBookRes;
       }

       public void setIsZomatoBookRes(Integer isZomatoBookRes) {
           this.isZomatoBookRes = isZomatoBookRes;
       }

       public String getMezzoProvider() {
           return mezzoProvider;
       }

       public void setMezzoProvider(String mezzoProvider) {
           this.mezzoProvider = mezzoProvider;
       }

       public Integer getIsBookFormWebView() {
           return isBookFormWebView;
       }

       public void setIsBookFormWebView(Integer isBookFormWebView) {
           this.isBookFormWebView = isBookFormWebView;
       }

       public String getBookFormWebViewUrl() {
           return bookFormWebViewUrl;
       }

       public void setBookFormWebViewUrl(String bookFormWebViewUrl) {
           this.bookFormWebViewUrl = bookFormWebViewUrl;
       }

       public String getBookAgainUrl() {
           return bookAgainUrl;
       }

       public void setBookAgainUrl(String bookAgainUrl) {
           this.bookAgainUrl = bookAgainUrl;
       }

       public String getThumb() {
           return thumb;
       }

       public void setThumb(String thumb) {
           this.thumb = thumb;
       }

       public UserRating getUserRating() {
           return userRating;
       }

       public void setUserRating(UserRating userRating) {
           this.userRating = userRating;
       }

       public String getPhotosUrl() {
           return photosUrl;
       }

       public void setPhotosUrl(String photosUrl) {
           this.photosUrl = photosUrl;
       }

       public String getMenuUrl() {
           return menuUrl;
       }

       public void setMenuUrl(String menuUrl) {
           this.menuUrl = menuUrl;
       }

       public String getFeaturedImage() {
           return featuredImage;
       }

       public void setFeaturedImage(String featuredImage) {
           this.featuredImage = featuredImage;
       }

       public Integer getHasOnlineDelivery() {
           return hasOnlineDelivery;
       }

       public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
           this.hasOnlineDelivery = hasOnlineDelivery;
       }

       public Integer getIsDeliveringNow() {
           return isDeliveringNow;
       }

       public void setIsDeliveringNow(Integer isDeliveringNow) {
           this.isDeliveringNow = isDeliveringNow;
       }

       public Boolean getIncludeBogoOffers() {
           return includeBogoOffers;
       }

       public void setIncludeBogoOffers(Boolean includeBogoOffers) {
           this.includeBogoOffers = includeBogoOffers;
       }

       public String getDeeplink() {
           return deeplink;
       }

       public void setDeeplink(String deeplink) {
           this.deeplink = deeplink;
       }

       public Integer getIsTableReservationSupported() {
           return isTableReservationSupported;
       }

       public void setIsTableReservationSupported(Integer isTableReservationSupported) {
           this.isTableReservationSupported = isTableReservationSupported;
       }

       public Integer getHasTableBooking() {
           return hasTableBooking;
       }

       public void setHasTableBooking(Integer hasTableBooking) {
           this.hasTableBooking = hasTableBooking;
       }

       public String getEventsUrl() {
           return eventsUrl;
       }

       public void setEventsUrl(String eventsUrl) {
           this.eventsUrl = eventsUrl;
       }

       public String getOrderUrl() {
           return orderUrl;
       }

       public void setOrderUrl(String orderUrl) {
           this.orderUrl = orderUrl;
       }

       public String getOrderDeeplink() {
           return orderDeeplink;
       }

       public void setOrderDeeplink(String orderDeeplink) {
           this.orderDeeplink = orderDeeplink;
       }

       public Integer getMedioProvider() {
           return medioProvider;
       }

       public void setMedioProvider(Integer medioProvider) {
           this.medioProvider = medioProvider;
       }
    }

    public class UserRating {

        @SerializedName("aggregate_rating")
        @Expose
        private String aggregateRating;
        @SerializedName("rating_text")
        @Expose
        private String ratingText;
        @SerializedName("rating_color")
        @Expose
        private String ratingColor;
        @SerializedName("votes")
        @Expose
        private String votes;

        /**
         * No args constructor for use in serialization
         *
         */
        public UserRating() {
        }

        /**
         *
         * @param ratingColor
         * @param votes
         * @param aggregateRating
         * @param ratingText
         */
        public UserRating(String aggregateRating, String ratingText, String ratingColor, String votes) {
            super();
            this.aggregateRating = aggregateRating;
            this.ratingText = ratingText;
            this.ratingColor = ratingColor;
            this.votes = votes;
        }

        public String getAggregateRating() {
            return aggregateRating;
        }

        public void setAggregateRating(String aggregateRating) {
            this.aggregateRating = aggregateRating;
        }

        public String getRatingText() {
            return ratingText;
        }

        public void setRatingText(String ratingText) {
            this.ratingText = ratingText;
        }

        public String getRatingColor() {
            return ratingColor;
        }

        public void setRatingColor(String ratingColor) {
            this.ratingColor = ratingColor;
        }

        public String getVotes() {
            return votes;
        }

        public void setVotes(String votes) {
            this.votes = votes;
        }

    }
}

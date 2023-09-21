package com.rohit.rating.services;

import com.rohit.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    // Create

    Rating create(Rating rating);


    // get all ratings

    List<Rating> getRatings();

    //get all by userId

    List<Rating> getRatingByUserId(String userId);

    //get all by hotelId

    List<Rating> getRatingByHotelId(String hotelId);
}

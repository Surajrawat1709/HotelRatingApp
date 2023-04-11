package com.lcwd.rating.services;

import com.lcwd.rating.entity.Rating;
import com.lcwd.rating.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServicesImpl implements RatingService{

    @Autowired
    private RatingRepository repo;
    @Override
    public Rating create(Rating rating) {
        return repo.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return repo.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return repo.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return repo.findByHotelId(hotelId);
    }
}

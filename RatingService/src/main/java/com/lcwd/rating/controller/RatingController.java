package com.lcwd.rating.controller;

import com.lcwd.rating.entity.Rating;
import com.lcwd.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService service;

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){

        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(rating));

    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){
        return  ResponseEntity.ok(service.getAllRating());
    }

    @GetMapping("/user/{userId}")
    public  ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
        return ResponseEntity.ok(service.getRatingByUserId(userId));
    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(service.getRatingByHotelId(hotelId));
    }
}

package com.lcwd.userservice;

import com.lcwd.userservice.entities.Rating;
import com.lcwd.userservice.external.services.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	private RatingService service;


	@Test
	void contextLoads() {
	}

//	@Test
//	void createRating(){
//		Rating rating=Rating.builder().rating("10").userId("").hotelId("").feedback("Nice hotel").build();
//		ResponseEntity<Rating> savedRating=service.createRating(rating);
//
//		System.out.println("New rating created");
//	}

}

package com.lcwd.userservice.service;

import com.lcwd.userservice.entities.Hotel;
import com.lcwd.userservice.entities.Rating;
import com.lcwd.userservice.entities.User;
import com.lcwd.userservice.exceptions.ResourceNotFoundException;
import com.lcwd.userservice.external.services.HotelService;
import com.lcwd.userservice.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository repo;

    @Autowired
    private RestTemplate template;

    @Autowired
    private HotelService service;

    private Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User saveUser(User user) {

       String randomUserId= UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return  repo.save(user);
    }

    @Override
    public List<User> getAllUsers() {

        return repo.findAll();
    }

    @Override
    public User getUser(String userId) {
        User user= repo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id not found "+userId));

        Rating[] ratingsOfUser= template.getForObject("http://RATING-SERVICE/rating/user/" + user.getUserId(), Rating[].class);
   logger.info("{}", ratingsOfUser);
List<Rating> ratings=Arrays.stream(ratingsOfUser).collect(Collectors.toList());
        
   List<Rating> ratingList=ratings.stream().map(rating-> {

//       ResponseEntity<Hotel> forEntity = template.getForEntity("http://HOTEL-SERVICE/hotel/"+rating.getHotelId(), Hotel.class);
//
//       Hotel hotel = forEntity.getBody();
//       logger.info("response status code: {} ",forEntity.getStatusCode());

       Hotel hotel=service.getHotel(rating.getHotelId());

       rating.setHotel(hotel);
return rating;
   }).collect(Collectors.toList());

   user.setRatings(ratingList);
   return user;
    }



}

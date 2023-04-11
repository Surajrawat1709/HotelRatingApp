package com.lcwd.userservice.controller;

import com.lcwd.userservice.entities.User;
import com.lcwd.userservice.service.UserServices;
//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices service;

   // private Logger logger= (Logger) LoggerFactory.getLogger(UserController.class);

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){

        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveUser(user));
    }

    @GetMapping
    public ResponseEntity<List<User>>  getAllUsers(){
        return ResponseEntity.ok(service.getAllUsers());
    }


   // @CircuitBreaker(name="ratingHotelBreaker",fallbackMethod = "ratingHotelFallback")
   @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userid){
//logger.info("Get single User Handler: UserController");
        return ResponseEntity.ok(service.getUser(userid));
    }

    //creating fallback method for circuitbreaker

//    public ResponseEntity<User> ratingHotelFallback(String userId,Exception ex) {
//        logger.info("Fallback is executed because service is down: ");
//        User user = User.builder()
//                .email("dummy@gmial.com")
//                .name("dummy")
//                .about("Created because service is down")
//                .userId("12345")
//                .build();
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }
}

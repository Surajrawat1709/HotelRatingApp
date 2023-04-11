package com.lcwd.userservice.service;

import com.lcwd.userservice.entities.User;

import java.util.List;

public interface UserServices {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUser(String userId);







}

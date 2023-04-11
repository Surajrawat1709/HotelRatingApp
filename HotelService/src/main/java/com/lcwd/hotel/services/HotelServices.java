package com.lcwd.hotel.services;

import com.lcwd.hotel.entity.Hotel;

import java.util.List;

public interface HotelServices {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel getOne(String id);

}

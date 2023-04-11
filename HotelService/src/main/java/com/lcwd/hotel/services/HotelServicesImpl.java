package com.lcwd.hotel.services;

import com.lcwd.hotel.entity.Hotel;
import com.lcwd.hotel.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServicesImpl implements HotelServices{

    @Autowired
    private HotelRepository repo;
    @Override
    public Hotel create(Hotel hotel) {

       String hotelId= UUID.randomUUID().toString();
       hotel.setId(hotelId);

        return repo.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return repo.findAll();
    }

    @Override
    public Hotel getOne(String id) {
        return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel with given id not found!!"));
    }
}

package com.lcwd.hotel.repositories;

import com.lcwd.hotel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel,String> {

}

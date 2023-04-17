package com.HotelService.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HotelService.hotel.entities.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String> {

}

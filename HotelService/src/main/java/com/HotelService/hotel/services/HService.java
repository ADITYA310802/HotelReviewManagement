package com.HotelService.hotel.services;

import java.util.List;

import com.HotelService.hotel.entities.Hotel;

public interface HService {
	
	//create
	Hotel create(Hotel hotel);
	
	//getall
	List<Hotel> getAll();
	
	//getSingle
	Hotel get(String id);

}

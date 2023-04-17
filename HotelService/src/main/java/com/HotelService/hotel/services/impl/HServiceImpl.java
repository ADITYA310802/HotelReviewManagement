package com.HotelService.hotel.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HotelService.hotel.entities.Hotel;
import com.HotelService.hotel.exception.ResourceNotFoundException;
import com.HotelService.hotel.repositories.HotelRepo;
import com.HotelService.hotel.services.HService;

@Service
public class HServiceImpl implements HService {

	@Autowired
	private HotelRepo hotelRepo;
	
	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		String hotelId= UUID.randomUUID().toString();
		
		hotel.setId(hotelId);
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

	@Override
	public Hotel get(String id) {
		// TODO Auto-generated method stub
		return hotelRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with given id not found on the server"));
	}
	

}

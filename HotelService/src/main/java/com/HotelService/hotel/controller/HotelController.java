package com.HotelService.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.HotelService.hotel.entities.Hotel;
import com.HotelService.hotel.services.HService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HService hService;
	
	//create
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(hService.create(hotel));
	}
	
	//getSingle
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getSingleHotel(@PathVariable String hotelId){
		
		return ResponseEntity.status(HttpStatus.OK).body(hService.get(hotelId));
	}
	
	//getAll
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotel(){
		
		return ResponseEntity.ok(hService.getAll());
	}
}

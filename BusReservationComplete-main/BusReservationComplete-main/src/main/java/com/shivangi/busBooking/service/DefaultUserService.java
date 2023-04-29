package com.shivangi.busBooking.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.shivangi.busBooking.DTO.BookingsDTO;
import com.shivangi.busBooking.DTO.UserRegisteredDTO;
import com.shivangi.busBooking.model.Bookings;
import com.shivangi.busBooking.model.User;

public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);

	Bookings updateBookings(BookingsDTO bookingDTO,UserDetails user);
	
	void sendEmail(BookingsDTO bookingDTO, User users, String nameGenrator);


	
}

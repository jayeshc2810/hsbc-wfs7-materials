package com.hsbc.springbootapp.controller;

import java.time.LocalDate;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.springbootapp.model.beans.User;

@RestController
public class RestApi {

	
	// getUser/{name}/{dob}
	@RequestMapping(value = "/getUser", 
			produces = MediaType.APPLICATION_JSON_VALUE, 
			method = RequestMethod.GET)
	public User getUser() {
		User user = new User();
		user.setName("David");
		user.setDob(LocalDate.parse("2000-10-15"));
		return user;
	}
}

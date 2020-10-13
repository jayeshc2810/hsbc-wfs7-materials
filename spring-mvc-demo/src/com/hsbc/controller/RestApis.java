package com.hsbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.model.beans.User;
import com.hsbc.model.service.UserService;

@RestController
public class RestApis {

	@Autowired
	private UserService service;
	
	// this is a webservice whose url is `http://localhost:8080/spring-mvc-demo/spring/test`
	@RequestMapping(value = "/testRest", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String testApi() {
		return "Hello REST";
	}
	
	@RequestMapping(value = "/getUser/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserByNameAPI(@PathVariable("name") String n) {
		User user = service.fetchUser(n);
		return user;
	}
}

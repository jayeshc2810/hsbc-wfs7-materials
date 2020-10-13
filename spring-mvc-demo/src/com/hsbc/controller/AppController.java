package com.hsbc.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hsbc.model.beans.User;
import com.hsbc.model.service.UserService;

@Controller
public class AppController {

	@Autowired
	private UserService service;
	
	// hello() method is a controller that can handle /spring/test URL & HTTP GET method <a> or <form>
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView hello() {
		System.out.println("hello() inside controller");
		
		// /WEB-INF/pages/display.jsp
		ModelAndView modelAndView = new ModelAndView("display", "time", LocalDateTime.now());
		
		return modelAndView;
	}
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ModelAndView getUser(@RequestParam("userid") int id) {
		String username = service.fetchUser(id);
		ModelAndView modelAndView = new ModelAndView("demo", "name", username);
		return modelAndView;
	}
	@RequestMapping(value = "/userByName", method = RequestMethod.POST)
	public ModelAndView getUser(@RequestParam("userid") String name) {
		User user = service.fetchUser(name);
		ModelAndView modelAndView = new ModelAndView("demo", "obj", user);
		return modelAndView;
	}
}

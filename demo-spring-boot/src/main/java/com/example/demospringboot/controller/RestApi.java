package com.example.demospringboot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
	
	// account/100, account/200
	@RequestMapping(value = "/account/{id}/{amt}", produces = MediaType.APPLICATION_JSON_VALUE, 
			method = RequestMethod.GET)
	public Account getAccount(@PathVariable("id") int accNo, @PathVariable("amt") double amount) {
		Account account = new Account();
		account.setAccountNumber(accNo);
		account.setAmount(amount);
		return account;
	}
}

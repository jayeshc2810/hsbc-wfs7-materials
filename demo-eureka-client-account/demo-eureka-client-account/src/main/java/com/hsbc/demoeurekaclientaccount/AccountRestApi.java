package com.hsbc.demoeurekaclientaccount;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestApi {

	// you must use service instance and get the balance
	@RequestMapping(value = "/balance", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getAccount() {
		Account account = new Account();
		account.setAccountNumber(5566);
		account.setAmount(50000);
		return account;
	}
}

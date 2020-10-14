package com.hsbc.demoeurekaclientgooglepay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GooglePayRestApi {

	@Autowired
	private RestTemplate template;
	
	@RequestMapping(value = "googlePayCheckBalance", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String checkBalance() {
		// {"accountNumber":8888, "balance":92300} 
		Account acc = template.getForObject("http://ACCOUNT-SERVICE/balance", Account.class);
		return "Balance: "+acc.getAmount();
	}
}

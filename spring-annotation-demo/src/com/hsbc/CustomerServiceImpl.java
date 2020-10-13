package com.hsbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	@Qualifier("customerDaoImpl2")
	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		System.out.println("CustomerServiceImpl() created");
	}
	
	@Override
	public void createCustomer() {
		customerDao.createCustomer();
		System.out.println("createCustomer() inside CustomerServiceImpl");
	}

}

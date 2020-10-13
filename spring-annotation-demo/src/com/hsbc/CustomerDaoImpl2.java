package com.hsbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl2 implements CustomerDao {

	@Autowired
	private DBUtility dbutility;
	
	public CustomerDaoImpl2() {
		System.out.println("CustomerDaoImpl2() created");
	}
	@Override
	public void createCustomer() {
		dbutility.getConnection();
		System.out.println("createCustomer inside CustomerDaoImpl2");
	}

}

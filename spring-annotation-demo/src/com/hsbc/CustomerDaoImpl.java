package com.hsbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// by default bead id will be classname, but first letter will be in lowercase
@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private DBUtility dbutility;
	
	public CustomerDaoImpl() {
		
		System.out.println("CustomerDaoImpl() created");
	}
	@Override
	public void createCustomer() {
		dbutility.getConnection();
		System.out.println("createCustomer() inside CustomerDaoImpl");
	}

}

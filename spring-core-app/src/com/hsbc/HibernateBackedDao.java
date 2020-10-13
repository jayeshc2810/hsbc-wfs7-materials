package com.hsbc;

import java.util.List;

public class HibernateBackedDao implements AccountDao {

	private DBUtility dbutility;
	
	public HibernateBackedDao() {
		System.out.println("HibernateBackedDao()");
	}
	
	@Override
	public void createAccount() {
		dbutility.getConnection();
		System.out.println("createAccount() of HibernateBackedDao");

	}

	@Override
	public List<String> getAccounts() {
		dbutility.getConnection();
		System.out.println("getAccouts() of HibernateBackedDao");
		return null;
	}

	public void setDbutility(DBUtility dbutility) {
		this.dbutility = dbutility;
	}

}

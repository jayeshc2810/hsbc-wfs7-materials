package com.hsbc.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.model.beans.User;
import com.hsbc.model.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public String fetchUser(int id) {
		return userDao.fetchUserById(id);
	}

	@Override
	public User fetchUser(String name) {
		// TODO Auto-generated method stub
		return userDao.fetchUserByName(name);
	}

}

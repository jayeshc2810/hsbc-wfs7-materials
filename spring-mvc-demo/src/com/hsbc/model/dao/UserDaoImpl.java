package com.hsbc.model.dao;

import org.springframework.stereotype.Repository;

import com.hsbc.model.beans.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public String fetchUserById(int id) {
		if(id == 100) 
			return "MS Dhoni";
		return "Virat Kholi";
	}

	@Override
	public User fetchUserByName(String name) {
		User user = new User();
		user.setUsername(name);
		user.setAge(33);
		return user;
	}

}

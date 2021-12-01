package com.java.spring.orm.springORM.dao;

import java.util.List;

import com.java.spring.orm.springORM.entitiy.User;

public interface UserDao {

	int addUser(User user);

	User getUser(int id);

	List<User> getAllUsers();
	
	void deleteUser(int id);
	
	void updateUser(User user);

}

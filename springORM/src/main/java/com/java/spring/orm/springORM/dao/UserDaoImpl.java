package com.java.spring.orm.springORM.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.java.spring.orm.springORM.entitiy.User;

public class UserDaoImpl implements UserDao {
	
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int addUser(User user) {
		Integer save = (Integer) this.hibernateTemplate.save(user);
		return save;
	}

	public User getUserbyID(int id) {
		User user = this.hibernateTemplate.get(User.class, id);
		return user;
	}

	public List<User> getAllUsers() {
		List<User> users = this.hibernateTemplate.loadAll(User.class);
		return users;
	}

	@Transactional
	public void deleteUser(int id) {
		User user = this.getUserbyID(id);
		this.hibernateTemplate.delete(user);
	}

	@Transactional
	public void updateUser(User user) {
		this.hibernateTemplate.update(user);
	}

	public User getUserByUName(String uname) {
		return this.hibernateTemplate.get(User.class, uname);
	}

}

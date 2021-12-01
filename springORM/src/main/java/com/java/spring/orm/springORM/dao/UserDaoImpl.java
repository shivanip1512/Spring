package com.java.spring.orm.springORM.dao;

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

}

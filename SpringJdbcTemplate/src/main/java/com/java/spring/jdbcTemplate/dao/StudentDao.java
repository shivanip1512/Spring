package com.java.spring.jdbcTemplate.dao;

import com.java.spring.jdbcTemplate.entity.Student;

public interface StudentDao {
	
	int insert(Student s);
	int change(Student s);
	int delete(int id);
	Student getStudent(int id);

}
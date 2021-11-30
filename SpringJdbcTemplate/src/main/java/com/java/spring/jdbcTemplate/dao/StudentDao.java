package com.java.spring.jdbcTemplate.dao;

import java.util.List;

import com.java.spring.jdbcTemplate.entity.Student;

public interface StudentDao {
	
	int insert(Student s);
	int change(Student s);
	int delete(int id);
	Student getStudent(int id);
	List<Student> getAllStudents();

}

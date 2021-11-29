package com.java.spring.jdbcTemplate.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.java.spring.jdbcTemplate.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student s) {
		String iq = "insert into student (id,name, address) values (?,?,?)";
		int res = this.jdbcTemplate.update(iq, s.getId(), s.getName(), s.getAddress());
		return res;
	}

}

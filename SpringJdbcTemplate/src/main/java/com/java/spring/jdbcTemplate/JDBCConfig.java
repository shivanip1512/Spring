package com.java.spring.jdbcTemplate;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.java.spring.jdbcTemplate.dao.StudentDao;
import com.java.spring.jdbcTemplate.dao.StudentDaoImpl;

@Configuration
public class JDBCConfig {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJDBCTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean("studentDAO")
	public StudentDao setJDBCTemplate() {
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		daoImpl.setJdbcTemplate(getJDBCTemplate());
		return daoImpl;
	}
	
	
}

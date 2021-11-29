package com.java.spring.jdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/spring/jdbcTemplate/config.xml");
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
		
		//insert query
		String iq = "insert into student (id,name, address) values (?,?,?)";
		int res = jdbcTemplate.update(iq,03,"Kirti","pune");
		System.out.println("number of record(s) inserted :"+res);
	}
}

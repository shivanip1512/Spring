package com.java.spring.jdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.jdbcTemplate.dao.StudentDao;
import com.java.spring.jdbcTemplate.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/spring/jdbcTemplate/config.xml");
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		
		Student st = new Student();
		st.setId(4);
		st.setName("abc");
		st.setAddress("india");
		
		int insertRes = studentDao.insert(st);
		System.out.println(insertRes+ " student added...");
	}
}

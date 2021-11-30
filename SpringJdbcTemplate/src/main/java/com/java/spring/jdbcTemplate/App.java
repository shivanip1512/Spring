package com.java.spring.jdbcTemplate;

import java.util.Iterator;
import java.util.List;

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
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student st = new Student();
		st.setId(4);
		st.setName("abc");
		st.setAddress("india");

		/*
		 * int insertRes = studentDao.insert(st); System.out.println(insertRes+
		 * " student added...");
		 */

		/*
		 * Student s2 = new Student(); s2.setId(1); s2.setName("Shivani Pacharne");
		 * s2.setAddress("Pune");
		 * 
		 * int update = studentDao.change(s2);
		 * System.out.println(update+" student updated...");
		 */

		/*
		 * int delete = studentDao.delete(2);
		 * System.out.println(delete+" rows deleted...");
		 */

//		Student student = studentDao.getStudent(1);
//		System.out.println(student);

		List<Student> students = studentDao.getAllStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}
}

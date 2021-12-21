package com.spring.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.Student;

public class FirstLevel {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Student student = session.get(Student.class, 10);
		System.out.println(student);
		
		//no db hit for this get bcoz session obj is already having the obj
		Student student2 = session.get(Student.class, 10);
		System.out.println(student2);
		
		System.out.println(session.contains(student));
		
		session.close();
		factory.close();

	}

}

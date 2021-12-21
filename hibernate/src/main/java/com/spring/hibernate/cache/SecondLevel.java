package com.spring.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.Student;

public class SecondLevel {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		// first
		Session s1 = factory.openSession();
		Student student = s1.get(Student.class, 10);
		System.out.println(student);
		s1.close();

		// second
		Session s2 = factory.openSession();
		Student student2 = s2.get(Student.class, 10);
		System.out.println(student2);
		s2.close();

		factory.close();

	}

}

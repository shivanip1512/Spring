package com.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("hi");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); // //
		Student s = new Student(1, "Shivani", "Pune");

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(s);
		transaction.commit();
		session.close();
	}
}

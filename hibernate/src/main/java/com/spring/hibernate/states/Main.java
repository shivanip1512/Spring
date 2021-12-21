package com.spring.hibernate.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.Certificate;
import com.spring.hibernate.Student;

public class Main {

	public static void main(String[] args) {

		/*
		 * 4 hibernate states: 1. transient 2. persistent 3. detatched 4. removed
		 */
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Student student = new Student();
		student.setId(156);
		student.setName("Shivani");
		student.setCity("Pune");
		student.setCerti(new Certificate("Java Hiberate Course", "2 months"));
		// --> student is in transient state


		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		// --> student is in persistent state

		student.setName("Shivani Pacharne"); // --> this will reflect in db as obj is on persistent state.. it is
												// present in db

		session.delete(student);
		//student is in removed state
		
		tx.commit();
		session.close();
		// --> student is in detached state

		student.setName("Shivani B Pacharne"); // --> will not reflect in db as obj is in detached state

		factory.close();

	}

}

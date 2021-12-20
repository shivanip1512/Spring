package com.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDetails {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		/*
		 * Student student = session.get(Student.class, 1);
		 * 
		 * // doesn't hit select on db because this obj is already present in session
		 * cache Student student1 = session.get(Student.class, 1);
		 * 
		 * System.out.println(student); System.out.println(student1);
		 */

		// no select query executed by hibernate from load method
		Student student2 = session.load(Student.class, 1);

		// select query hit as we are using object's data
		System.out.println(student2);
		transaction.commit();
		session.close();

	}

}

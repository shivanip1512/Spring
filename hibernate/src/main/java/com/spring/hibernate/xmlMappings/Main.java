package com.spring.hibernate.xmlMappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Person p = new Person(0, "Shivani", "Pune");
		
		Transaction txn = session.beginTransaction();

		session.save(p);
		
		txn.commit();
		
		session.close();
		factory.close();

	}

}

package com.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embed {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Student s = new Student();
		s.setId(3);
		s.setName("Sweety");
		s.setCity("Kolkata");
		
		Certificate certi = new Certificate();
		certi.setCourse("java");
		certi.setDuration("500 hrs");
		
		s.setCerti(certi);
		
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(s);
		transaction.commit();
		session.close();
	}

}

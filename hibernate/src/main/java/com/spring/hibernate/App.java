package com.spring.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {

		System.out.println("hi");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); // //

		Student s = new Student(2, "ABC", "XYZ");
		Address addr = new Address();
		addr.setStreet("street2");
		addr.setCity("city2");
		addr.setOpen(true);
		addr.setAddrDate(new Date());
		addr.setAirQuality(1200.50);
		//reading image
		FileInputStream is = new FileInputStream("src/main/java/com/spring/hibernate/images/profile.png");
		byte[] b = new byte[is.available()];
//		addr.setImage(b);
		
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(s);
		session.save(addr);
		transaction.commit();
		session.close();
	}
}

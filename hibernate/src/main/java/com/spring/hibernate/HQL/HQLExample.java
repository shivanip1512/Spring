package com.spring.hibernate.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.spring.hibernate.Student;

public class HQLExample {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		//HQL syntax
		
		String query = "from Student where city=:x";

		Query createQuery = session.createQuery(query);
		createQuery.setParameter("x", "pune");
		//single - unique
		//multiple - list
		
		List<Student> list = createQuery.list();
		
		for (Student student : list) {
			System.out.println(student);
		}
		
		
		session.close();
		factory.close();

	}

}

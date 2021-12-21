package com.spring.hibernate.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.spring.hibernate.Student;

public class HQLPagination {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();

		Query<Student> query = session.createQuery("from Student",Student.class);
		
		//implementing pagination using hibernate
		query.setFirstResult(0);
		query.setMaxResults(5);
		
		List<Student> list = query.list();
		
		for (Student student : list) {
			System.out.println(student);
		}
		
		session.close();
		factory.close();

	}

}

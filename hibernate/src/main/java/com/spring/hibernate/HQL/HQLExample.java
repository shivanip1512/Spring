package com.spring.hibernate.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		
		System.out.println("________________________________");
		
		Transaction txn = session.beginTransaction();
		
		//delete query
		Query dq = session.createQuery("delete from Student s where s.city=:c");
		dq.setParameter("c", "XYZ");
		int deletedRows = dq.executeUpdate();
		System.out.println("deleted "+deletedRows+" rows");
		
		//update query
		Query uq = session.createQuery("update Student s set s.name=:newName where s.city=:c");
		uq.setParameter("c", "pune");
		uq.setParameter("newName", "James");
		int update = uq.executeUpdate();
		System.out.println(update+" rows updated.");
		
		
		
		txn.commit();
		session.close();
		factory.close();

	}

}

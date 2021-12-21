package com.spring.hibernate.SQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.spring.hibernate.Student;

public class SQLQuery {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String q = "Select * from student"; //  stdent represent tablename not entity
		NativeQuery nq = session.createSQLQuery(q);
		List<Object[]> list = nq.list();
		
		list.forEach(st->System.out.println(Arrays.toString(st)));
		
		session.close();
		factory.close();

	}

}

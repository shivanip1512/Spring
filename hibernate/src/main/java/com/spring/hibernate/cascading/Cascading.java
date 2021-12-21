package com.spring.hibernate.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.mappings.ManyToOne.Answer;
import com.spring.hibernate.mappings.ManyToOne.Question;

public class Cascading {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Question q1 = new Question();
		
		q1.setQuestion("What is cascading?");
		
		Answer a1 = new Answer(1, "first answer.");
		Answer a2 = new Answer(2, "second answer.");
		Answer a3 = new Answer(3, "third answer.");
		
		List<Answer> l = new ArrayList<Answer>();
		l.add(a1);
		l.add(a2);
		l.add(a3);
		
		q1.setAns(l);
		
		Transaction tx = session.beginTransaction();
		session.save(q1);
		// a1,a2,a3 will be auto saved bcoz we added cascade onto ans field
		tx.commit();
		session.close();
		factory.close();

	}

}

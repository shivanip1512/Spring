package com.spring.hibernate.mappings.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		Transaction transaction = session.beginTransaction();

		Question q = new Question();
		q.setQuestion("how are you?");

		Answer ans = new Answer();
		ans.setAnswerId(1);
		ans.setAnswer("I am fine");

		q.setAns(ans);
		ans.setQuestion(q);

		session.save(ans);
		session.save(q);

		transaction.commit();
		session.close();
		sf.close();
	}

}

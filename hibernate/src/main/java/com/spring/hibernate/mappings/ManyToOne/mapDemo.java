package com.spring.hibernate.mappings.ManyToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		Transaction transaction = session.beginTransaction();

		/*
		 * Question q = new Question(); q.setQuestion("how are you?");
		 * 
		 * Answer ans = new Answer(); ans.setAnswerId(1); ans.setAnswer("I am fine");
		 * 
		 * Answer ans1 = new Answer(); ans1.setAnswerId(2);
		 * ans1.setAnswer("I am Good!");
		 * 
		 * List<Answer> answers = new ArrayList<Answer>(); answers.add(ans);
		 * answers.add(ans1);
		 * 
		 * q.setAns(answers); ans.setQuestion(q); ans1.setQuestion(q);
		 */

		/*
		 * session.save(ans); session.save(ans1); session.save(q);
		 */
		
		Question question = session.get(Question.class, 1);
		
		System.out.println("Question :"+question);
		for (Answer answer : question.getAns()) {
			System.out.println(answer);
		}

		transaction.commit();
		session.close();
		sf.close();
	}

}

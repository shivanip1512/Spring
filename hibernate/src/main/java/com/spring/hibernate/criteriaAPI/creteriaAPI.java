package com.spring.hibernate.criteriaAPI;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.spring.hibernate.Student;
import com.spring.hibernate.xmlMappings.Person;

public class creteriaAPI {

	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Criteria criteria = session.createCriteria(Student.class);
//		criteria.add(Restrictions.eq("certi.course", "android"));
		criteria.add(Restrictions.gt("id", 10));
		
		List<Student> list = criteria.list();
		
		list.forEach(p->System.out.println(p));
		
		session.close();
	}

}

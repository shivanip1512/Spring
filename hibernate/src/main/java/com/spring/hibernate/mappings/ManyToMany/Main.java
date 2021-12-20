package com.spring.hibernate.mappings.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.mappings.ManyToOne.Question;

public class Main {

	public static void main(String[] args) {

		Project p1 = new Project();
		p1.setpId(1);
		p1.setName("p1");

		Project p2 = new Project();
		p2.setpId(2);
		p2.setName("p2");

		Employee e1 = new Employee();
		e1.seteID(101);
		e1.setName("ABC");

		Employee e2 = new Employee();
		e2.seteID(102);
		e2.setName("XYZ");

		List<Employee> listEmp = new ArrayList<Employee>();
		listEmp.add(e1);
		listEmp.add(e2);

		List<Project> listProj = new ArrayList<Project>();
		listProj.add(p1);
		listProj.add(p2);

		e1.setProj(listProj);
		p1.setEmployees(listEmp);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);


		transaction.commit();

		session.close();
		factory.close();

	}

}

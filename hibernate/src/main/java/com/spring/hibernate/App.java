package com.spring.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("hi");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); // //
		System.out.println(factory);
	}
}

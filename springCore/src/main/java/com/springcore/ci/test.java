package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/config.xml");
		Person p1 = (Person) context.getBean("p1");
		System.out.println(p1);
		Person p2 = (Person) context.getBean("p2");
		System.out.println(p2);
	}

}

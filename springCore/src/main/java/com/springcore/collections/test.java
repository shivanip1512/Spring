package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/collections/Collectionsconfig.xml");
		Citizen citizen1 = (Citizen) context2.getBean("citizen1");
		System.out.println(citizen1);

	}

}

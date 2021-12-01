package com.java.spring.orm.springORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.orm.springORM.dao.UserDao;
import com.java.spring.orm.springORM.entitiy.User;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/spring/orm/springORM/config.xml");
		UserDao dao = context.getBean("userDao", UserDao.class);

		/* insertion */
		User user = new User(1, "Shivani Pacharne", "sp", 1111);
		
		int addUser = dao.addUser(user);
		System.out.println(addUser + " user added...");

	}
}

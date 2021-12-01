package com.java.spring.orm.springORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.orm.springORM.dao.UserDao;
import com.java.spring.orm.springORM.entitiy.User;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/spring/orm/springORM/config.xml");
		UserDao dao = context.getBean("userDao", UserDao.class);

		// insert a user
		/*
		 * User user = new User(2, "Kirti Choudhary", "kc", 2222);
		 * 
		 * int addUser = dao.addUser(user); System.out.println(addUser +
		 * " user added...");
		 */

		// get user basedon id
		/*
		 * User user = dao.getUser(1); System.out.println(user);
		 */

		// get all users
		/*
		 * List<User> allUsers = dao.getAllUsers(); for (User user_ : allUsers) {
		 * System.out.println(user_); }
		 */

		// deleteUser
		/* dao.deleteUser(2); */

		// update user
		/*
		 * User u = new User(1, "Shivani P", "sbp", 1234); dao.updateUser(u);
		 */
	
		
	}
}

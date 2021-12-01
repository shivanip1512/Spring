package com.java.spring.orm.springORM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.orm.springORM.dao.UserDao;
import com.java.spring.orm.springORM.entitiy.User;

public class App {
	public static void main(String[] args) throws IOException {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/spring/orm/springORM/config.xml");
		UserDao dao = context.getBean("userDao", UserDao.class);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("\n\nPRESS OPTIONS BELOW TO PERFORM RESPECTIVE OPERATIONS :" + "\n\t1 : CREATE NEW USER"
					+ "\n\t2 : DISPLAY USER" + "\n\t3 : DISPLAY ALL USERs" + "\n\t4 : UPDATE USER"
					+ "\n\t5 : DELETE USER" + "\n\t6 : EXIT");

			try {
				int choice = Integer.parseInt(br.readLine());
				switch (choice) {
				case 1:
					System.out.println("Enter Full name :");
					String name = br.readLine();
					System.out.println("Enter User Name :");
					String userName = br.readLine();
					System.out.println("Enter 4-digit Pin :");
					int pin = Integer.parseInt(br.readLine());
					User user = new User(name, userName, pin);
					dao.addUser(user);

					System.out.println("\n\n\tUser added Successfully...");

					break;
				case 2:

					System.out.println("Enter ID :");
					int id = Integer.parseInt(br.readLine());

					User user1 = dao.getUserbyID(id);
					System.out.println(user1);

					break;
				case 3:

					List<User> allUsers = dao.getAllUsers();
					for (User user_ : allUsers) {
						System.out.println(user_);
					}

					break;

				case 4:

					System.out.println("Enter ID :");
					int id_ = Integer.parseInt(br.readLine());
					System.out.println("Enter Full name :");
					String name1 = br.readLine();
					System.out.println("Enter User Name :");
					String userName1 = br.readLine();
					System.out.println("Enter 4-digit Pin :");
					int pin1 = Integer.parseInt(br.readLine());

					User user2 = new User(id_, name1, userName1, pin1);
					dao.updateUser(user2);

					System.out.println("\n\n\tUser updated Successfully...");

					break;

				case 5:

					System.out.println("Enter ID :");
					int idFordelete = Integer.parseInt(br.readLine());
					dao.deleteUser(idFordelete);
					System.out.println("\n\n\tUser deleted Successfully...");

					break;

				case 6:
					System.exit(0);

				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("Please enter valid input!");
			}
		}

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

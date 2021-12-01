package com.java.spring.orm.springORM.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@Column(name = "id")
	private int userID;

	@Column(name = "name")
	private String name;

	@Column(name = "username")
	private String userName;

	@Column(name = "pin")
	private int pin;

	@Override
	public String toString() {
		return "User [userID=" + userID + ", name=" + name + ", userName=" + userName + ", pin=" + pin + "]";
	}

	public User(int userID, String name, String userName, int pin) {
		super();
		this.userID = userID;
		this.name = name;
		this.userName = userName;
		this.pin = pin;
	}

	public User() {
		super();
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

}

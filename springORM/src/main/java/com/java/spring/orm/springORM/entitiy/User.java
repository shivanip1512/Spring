package com.java.spring.orm.springORM.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
class User {
	
	@Id
	@Column(name = "id")
	private int userID;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "pin")
	private int pin;
	
	

}

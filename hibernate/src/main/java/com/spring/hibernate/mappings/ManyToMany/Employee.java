package com.spring.hibernate.mappings.ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int eID;

	@Column(name = "employee_name")
	private String name;

	@ManyToMany
	@JoinTable(name = "joinEmpProj", joinColumns = { @JoinColumn(name = "eid") }, inverseJoinColumns = {
			@JoinColumn(name = "pid") })

	private List<Project> proj;

	public Employee() {
		super();
	}

	public Employee(int eID, String name, List<Project> proj) {
		super();
		this.eID = eID;
		this.name = name;
		this.proj = proj;
	}

	public List<Project> getProj() {
		return proj;
	}

	public void setProj(List<Project> proj) {
		this.proj = proj;
	}

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

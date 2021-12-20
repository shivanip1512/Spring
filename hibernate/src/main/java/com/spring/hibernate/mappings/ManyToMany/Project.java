package com.spring.hibernate.mappings.ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pId;

	@Column(name = "project_name")
	private String name;

	@ManyToMany(mappedBy = "proj")
	private List<Employee> employees;

	public Project(int pId, String name, List<Employee> employees) {
		super();
		this.pId = pId;
		this.name = name;
		this.employees = employees;
	}

	public Project() {
		super();
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}

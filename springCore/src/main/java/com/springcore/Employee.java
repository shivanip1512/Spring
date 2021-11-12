package com.springcore;

import java.util.Map;

public class Employee {
	private int empID;
	private String empName;
	private String address;
	private Map map;

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee(int empID, String empName, String address) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", address=" + address + ", map=" + map + "]";
	}
}

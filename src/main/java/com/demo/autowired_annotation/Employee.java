package com.demo.autowired_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Employee {

	int id;
	String name;
//	@Autowired
	Department department;

	public Employee() {
		super();
		System.out.println("setting Dptmt by no-arg constructor");
	}
	@Autowired
	public Employee(int id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		System.out.println("setting Dptmt by all-arg constructor");
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}
//	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
		System.out.println("setting Department by setter");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

}

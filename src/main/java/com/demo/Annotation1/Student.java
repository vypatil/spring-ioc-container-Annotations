package com.demo.Annotation1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class Student {
	@Value(value="10")
	int rollNo;
	@Value(value="vaibhav")
	String name;
	@Value(value="kolhapur")
	String address;
	
	Subject subject;

	public Subject getSubject() {
		return subject;
	}

	@Autowired
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", subject=" + subject + "]";
	}

	

}

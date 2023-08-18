package com.demo.dependson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"beanB","beanC"})
public class A {

	@Autowired
	B b;

	public A() {
		super();
		System.out.println("no arg constructor invoked for class A");
	}

	public A(B b) {
		super();
		this.b = b;
		System.out.println("one arg constructor invoked for class A");
	}
	
	public void call() {
		b.print();
		
	}
	
	
	
	

}

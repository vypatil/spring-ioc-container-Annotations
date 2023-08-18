package com.demo.Annotation1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Annotation1.xml");
		
		Student s1 = context.getBean(Student.class);
		
		System.out.println(s1);
		
		
		
		
	}
}

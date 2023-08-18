package com.demo.qulifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestQulifier {
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		
		Student s1 = context.getBean(Student.class);
		
		System.out.println(s1);
	}

}

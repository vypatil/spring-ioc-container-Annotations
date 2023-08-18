package com.demo.autowired_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Autowired.Annotation.xml");
		
		Employee e1 = context.getBean("emp1",Employee.class);
		System.out.println(e1);
		
		
		Employee e2 = context.getBean("emp2",Employee.class);
		System.out.println(e2);
		
		Department d1 = context.getBean("dep3",Department.class);
		System.out.println(d1);
		
	}

}

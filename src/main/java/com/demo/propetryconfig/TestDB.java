package com.demo.propetryconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDB {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Dbconfig.class);
		
		MyDatabaseDetails obj = ctx.getBean(MyDatabaseDetails.class);
		
		System.out.println(obj);
		
	}

}

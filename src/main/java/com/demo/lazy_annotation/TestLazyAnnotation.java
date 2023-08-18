package com.demo.lazy_annotation;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLazyAnnotation {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ShoppingListConfig.class);
		
		
		System.out.println("count >>> " + context.getBeanDefinitionCount());
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		ShoppingList s1 = context.getBean(ShoppingList.class);
		
		Device d1 = context.getBean("lenovo",Laptop.class);
		Device d2 = context.getBean("hp",Laptop.class);
		
		
	}

}

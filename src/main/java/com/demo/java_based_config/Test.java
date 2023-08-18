package com.demo.java_based_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(ShoppingListConfig.class);
		
		Device lenovolaptop = context.getBean("lenovo",Laptop.class);
		Device hplaptop = context.getBean("hp",Laptop.class);
		
		Device iphone = context.getBean("iphone",Mobile.class);
		Device mi = context.getBean("mi",Mobile.class);
		
		System.out.println(lenovolaptop);
		System.out.println(hplaptop);
		
		System.out.println(iphone);
		System.out.println(mi);
		
		
		ShoppingList list1 = context.getBean(ShoppingList.class);
		list1.additems(iphone);
		list1.additems(mi);
		System.out.println("Shopping List 1 : "+list1.getitems());
		
		ShoppingList list2 = context.getBean(ShoppingList.class);
		list2.additems(lenovolaptop);
		list2.additems(hplaptop);
		System.out.println("Shopping List 2 : "+list2.getitems());

		System.out.println(list1==list2);
		
		
		
	}
}

package com.demo.scan_filter_demo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.DependsOn;

import com.demo.Package1.BeanC;

public class TestScanFilter {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		System.out.println(context.getBeanDefinitionCount());
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
	}

}

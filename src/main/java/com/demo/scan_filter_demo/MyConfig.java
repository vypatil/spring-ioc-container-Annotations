package com.demo.scan_filter_demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.demo.Package1.BeanA;
import com.demo.Package1.BeanB;
import com.demo.Package1.ParentBean;

@Configuration
//@ComponentScan(basePackages="com.demo.Package1")
@ComponentScan(basePackages="com.demo.Package1" , excludeFilters=@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,value=BeanA.class))
public class MyConfig {

}

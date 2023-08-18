package com.demo.autowired_annotation;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmpConfig {

	@Bean(name="emp2" , autowire=Autowire.BY_TYPE)
	public Employee getEmp1() {
		
		Employee e1 = new Employee();
		e1.setId(2);
		e1.setName("sush");
		return e1;
	}
	@Bean(name = "dep3")
	public Department getDep() {
		
		Department d1 = new Department();
		d1.setDepId(100);
		d1.setDepName("Farming Department");
		return d1;
		
	}
	
}

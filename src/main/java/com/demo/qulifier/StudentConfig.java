package com.demo.qulifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.demo.qulifier")
public class StudentConfig {
	
	
	@Bean
	@Primary
	public Address address1() {
		
		return new Address(123 , "pune");
		
	}
	
	@Bean
	public Address address2() {
		
		return new Address(555 , "kolhapur");
		
	}

}

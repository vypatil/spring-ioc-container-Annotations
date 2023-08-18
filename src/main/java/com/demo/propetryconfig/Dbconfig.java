package com.demo.propetryconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan("com.demo.propetryconfig")
public class Dbconfig {
	
	@Autowired
	Environment env;

	@Bean
	public MyDatabaseDetails dbdetails() {
		
		MyDatabaseDetails m1 = new MyDatabaseDetails();
		m1.setUrl(env.getProperty("dburl"));
		m1.setUsername(env.getProperty("dbusername"));
		m1.setPassword(env.getProperty("dbpassword"));
		
		m1.setMyarr(env.getProperty("arryaofstring",List.class));
		
		return m1;
		
	}
			
}

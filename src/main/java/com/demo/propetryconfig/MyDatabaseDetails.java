package com.demo.propetryconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
//@PropertySource("db.properties")
public class MyDatabaseDetails {
	
//	@Value("${dburl}")
	String url;
	
//	@Value("${dbusername}")
	String username;
	
//	@Value("${dbpassword}")
	String password;
	
	List<String> myarr;

	public List<String> getMyarr() {
		return myarr;
	}

	public void setMyarr(List<String> myarr) {
		this.myarr = myarr;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyDatabaseDetails [url=" + url + ", username=" + username + ", password=" + password + ", myarr="
				+ myarr + "]";
	}

	
	
	
	
	

}

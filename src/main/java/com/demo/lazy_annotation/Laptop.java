package com.demo.lazy_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Laptop extends Device {

	private boolean touchscreen;

	public Laptop() {
		super();

	}

	public Laptop(String name, double price) {
		super(name, price);

	}

	public boolean isTouchscreen() {
		return touchscreen;
	}

	public void setTouchscreen(boolean touchscreen) {
		this.touchscreen = touchscreen;
	}
	
	@PostConstruct
	public void init() {
		
		System.out.println("laptop bean is created!!");
	}
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("laptop bean is destroying!!");
	}

}

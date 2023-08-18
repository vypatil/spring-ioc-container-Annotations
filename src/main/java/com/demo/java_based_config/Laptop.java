package com.demo.java_based_config;

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

}

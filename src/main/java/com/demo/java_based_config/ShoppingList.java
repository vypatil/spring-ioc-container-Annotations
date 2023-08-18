package com.demo.java_based_config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ShoppingList {

	List<Device> items = new ArrayList<Device>();

	
	public List<Device> getitems(){
		
		return items;
		
	}
	
	public void additems(Device device) {
		
		items.add(device);
	}
	
	
}

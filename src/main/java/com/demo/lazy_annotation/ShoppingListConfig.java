package com.demo.lazy_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.demo.lazy_annotation")
public class ShoppingListConfig {

	@Bean(name = "lenovo")
	@Lazy
	public Device getLenovoLaptop() {
		
		Laptop lenovo = new Laptop();
		lenovo.setName("ThinkPad 10");
		lenovo.setPrice(45000);
		lenovo.setTouchscreen(true);
		return lenovo;
	}

	@Bean(name = "hp")
	@Lazy
	public Device getHpLaptop() {
		
		Laptop hp = new Laptop();
		hp.setName("hp pavalion");
		hp.setPrice(70000);
		hp.setTouchscreen(false);
		return hp;
	}

	@Bean(name = "iphone")
	public Device getIphone() {

		Mobile iphone = new Mobile();
		iphone.setName("iphone 12");
		iphone.setPrice(150000);
		iphone.setBatteryCapacity(4500);
		return iphone;

	}

	@Bean(name = "mi")
	@Primary
	public Device getMiphone() {
		
		Mobile mi = new Mobile();
		mi.setName("mi note 10");
		mi.setPrice(13000);
		mi.setBatteryCapacity(46000);
		return mi;
	}

}

package com.demo.Annotation1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subject {
	@Value(value="Maths")
	String sub1;
	@Value(value="Marathi")
	String sub2;
	@Value(value="English")
	String sub3;

	public String getSub1() {
		return sub1;
	}

	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}

	public String getSub2() {
		return sub2;
	}

	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}

	public String getSub3() {
		return sub3;
	}

	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}

	@Override
	public String toString() {
		return "Subject [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
	}

}

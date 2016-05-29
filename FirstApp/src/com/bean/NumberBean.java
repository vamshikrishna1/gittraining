package com.bean;

import javax.annotation.ManagedBean;

@ManagedBean
public class NumberBean {
	
	private int number=1;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	

}

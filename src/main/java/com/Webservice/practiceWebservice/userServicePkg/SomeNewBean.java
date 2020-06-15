package com.Webservice.practiceWebservice.userServicePkg;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("someBeanFilter")
public class SomeNewBean {
	
	private String name;
	private String phone;
	private double salary;
	
	public SomeNewBean(String name, String phone, double salary) {
		super();
		this.name = name;
		this.phone = phone;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}

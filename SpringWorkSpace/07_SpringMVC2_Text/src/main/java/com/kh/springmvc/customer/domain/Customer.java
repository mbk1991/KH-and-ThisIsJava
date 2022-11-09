package com.kh.springmvc.customer.domain;

public class Customer {
	private int customerNo;
	private String id;
	private String name;
	private int age;
	
	public Customer() {}

	public Customer(int customerNo, String id, String name, int age) {
		super();
		this.customerNo = customerNo;
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [customerNo=" + customerNo + ", id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	
}

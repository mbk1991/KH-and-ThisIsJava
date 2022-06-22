package com.kh.oop;

public class Person {
	//필드 , 속성
	private String citizenNo;
	private String name;
	private char gender;
	private String address;
	private String phone;
	private int age;
	public String hobby;
	public static String hobby2;
	
	//메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public void setAddress(String address) {
		this.address  = address;
	}
	public String getAddress() {
		return this.address;
	}
	
	
	public void takeWalk(int distance) {
		System.out.println(distance + "m를 산책 한다.");
	}
	public void dialPhone(int phoneNumber) {
		System.out.println(phoneNumber + "에  전화를 건다.");
	}
	
	
	//생성자
	public Person() {};
	public Person(String citizenNo, String name) {
		
		this.citizenNo = citizenNo;
		this.name = name;
	}
	
	
	
	
}

package com.kh.oop;

public class Person {
	//�ʵ� , �Ӽ�
	private String citizenNo;
	private String name;
	private char gender;
	private String address;
	private String phone;
	private int age;
	public String hobby;
	public static String hobby2;
	
	//�޼ҵ�
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
		System.out.println(distance + "m�� ��å �Ѵ�.");
	}
	public void dialPhone(int phoneNumber) {
		System.out.println(phoneNumber + "��  ��ȭ�� �Ǵ�.");
	}
	
	
	//������
	public Person() {};
	public Person(String citizenNo, String name) {
		
		this.citizenNo = citizenNo;
		this.name = name;
	}
	
	
	
	
}

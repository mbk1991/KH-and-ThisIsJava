package com.kh.oop;

public class Run {
	public static void main(String[] args) {
		Person person = new Person("10","ȫ�浿");
//		person.address = "����� ���α�";  // ���� ȣ�� �Ұ�
//		person.name = "ȫ�浿";
		
//		person.setAddress("����� ������");
		String address = person.getAddress();
		System.out.println(address);
		
//		person.setName("ȫ�浿");
//		person.getName();
//		
//		person.hobby = "";
//		Person.hobby2 = "";
//		
//		System.out.println(address);
		
		person.takeWalk(100);
		
	}
}

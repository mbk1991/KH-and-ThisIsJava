package com.kh.oop;

public class Run {
	public static void main(String[] args) {
		Person person = new Person("10","홍길동");
//		person.address = "서울시 종로구";  // 직접 호출 불가
//		person.name = "홍길동";
		
//		person.setAddress("서울시 강남구");
		String address = person.getAddress();
		System.out.println(address);
		
//		person.setName("홍길동");
//		person.getName();
//		
//		person.hobby = "";
//		Person.hobby2 = "";
//		
//		System.out.println(address);
		
		person.takeWalk(100);
		
	}
}

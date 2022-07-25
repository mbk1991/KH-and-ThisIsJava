package chap11.objectcompare;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		//객체의 문자정보 toString()
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}

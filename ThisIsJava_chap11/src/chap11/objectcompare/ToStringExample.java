package chap11.objectcompare;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		//��ü�� �������� toString()
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}

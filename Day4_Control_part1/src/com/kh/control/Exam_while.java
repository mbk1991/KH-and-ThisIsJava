package com.kh.control;

public class Exam_while {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println("출력된 i의 값 :" + i);
			i++;
		}
		System.out.println("-----");
		
		int j = 9;
		while(j>=0) {
			System.out.println("출력된 j의 값 : " + j);
			j--;
		}
		System.out.println("-----");
		
		char a = 'A';
		while(a<='Z') {
			System.out.println("출력된 a의 값 : " + a);
			a++;
		}
		
	}
}

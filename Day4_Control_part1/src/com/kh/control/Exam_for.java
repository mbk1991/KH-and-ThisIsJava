package com.kh.control;

public class Exam_for {
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i ++) {
			System.out.println("출력된 i의 값 : " + i);
		}
		
		System.out.println("-----");
		
		for(int i = 10 ; i > 0 ; i--) {
			System.out.println("출력된 i의 값 : " + i);
		}
		
		System.out.println("-----");
		for(int i = 0; i < 20 ; i+=2) {
			System.out.println("출력된 i의 값 : " + i);
		}
		
		System.out.println("-----");
		for(char a = 'a'; a <= 'z' ; a++) {
			System.out.println("출력된 a의 값 : " + a);
		}
	}
}

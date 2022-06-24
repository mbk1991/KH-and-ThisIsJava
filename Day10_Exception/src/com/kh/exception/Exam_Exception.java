package com.kh.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("정수 하나 입력 >");
				int choice = sc.nextInt();
				System.out.println("입력된 정수는 : " + choice);
			}catch (InputMismatchException e) {
				System.out.println(e.toString());
				sc.next();   // 잘 이해가 안되네. 발생하는 문자열을 받는역할?, sc를 초기화하는 역할이구나.
				System.out.println(sc.toString());
				continue;
			}
	}
	}
}


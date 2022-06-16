package com.kh.exercise;

import java.util.Scanner;

public class Exercise_If {
	public void exercise1() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("정수 하나 입력 : ");
			int inputNum = sc.nextInt();
	
			if (inputNum < 0) {
				System.out.println("양수를 입력하세요.");
			} else if (inputNum % 2 == 1) {
				System.out.println("홀수다.");
			} else {
				System.out.println("짝수다.");
			}
		}
		
	}
}

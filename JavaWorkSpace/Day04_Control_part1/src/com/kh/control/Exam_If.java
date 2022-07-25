package com.kh.control;

import java.util.Scanner;

public class Exam_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 하나 입력 : ");
			int num = sc.nextInt();
	//		boolean result = num == 0;
			
			String result = num == 0 ? "0입니다." : num > 0 ? "양수입니다." : "음수입니다.";
			System.out.println("삼항연산자 : " + result);
			
			if (num == 0) {
				System.out.println("0입니다.");
			} else if(num < 0) {
				System.out.println("음수입니다.");
			} else {
				System.out.println("양수입니다.");
			}
		}
	}
}

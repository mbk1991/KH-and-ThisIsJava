package com.kh.control;

import java.util.Scanner;

public class Exam_DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		do {
			sum += num;
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}while(num != -1);
		System.out.println("입력하신 수의 합은 " + sum + " 입니다.");
		
		
	}
}

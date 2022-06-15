package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	// 입력한 정수값이 1 ~ 100 사이의 숫자인지 확인하시오
	// 정수를 하나 입력해주세요 : 33
	// 1부터 100사이의 숫자인가? : true

	public static void main(String[] args) {
		System.out.println("입력한 정수값이 1~100 사이의 숫자인지 확인하는 문제");

		
		
		while(true) {
		
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("정수를 하나 입력해주세요 : ");
				int input = sc.nextInt();
				boolean checkBool = (input > 1) && (input < 100) ? true : false;
				System.out.println("1부터 100 사이의 숫자인가? : " + checkBool);
				
				
			} catch (Exception e) {
				System.out.println("정수를 입력하세요!");
				continue;
			}
		
		}
		
		
	}

}
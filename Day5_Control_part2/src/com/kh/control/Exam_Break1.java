package com.kh.control;

import java.util.Scanner;

public class Exam_Break1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 입력: ");
			String input = sc.nextLine();
			
			if(input.equals("end")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("문자열의 길이: " + input.length());
		}
		
	}
}

package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {

	// 입력한 문자 값이 대문자인지 확인하여 결과 출력하기
	// 문자 하나 입력해주세요 : a
	// 영어 대문자 확인 : false

	// 문자 하나 입력해주세요 : A
	// 영어 대문자 확인 : true

	public static void main(String[] args) {

		while (true) {
			
			System.out.println("입력한 문자 값이 대문자인지 확인하여 결과 출력하는 문제 (종료 q)");
			Scanner sc = new Scanner(System.in);
			System.out.print("문자 하나 입력해주세요  : ");
			char inputChar = sc.next().charAt(0); // 아스키코드65~90 대문자
			if (inputChar == 'q') {
				System.out.println("프로그램을 종료함");
				break;
			}

			System.out.println(inputChar);
			boolean capitalCheck = (inputChar >= 'A') && (inputChar <= 'Z') ? true : false;

			System.out.println("영어 대문자 확인 : " + capitalCheck);
			System.out.println('A' +'B');

		}

	}
}

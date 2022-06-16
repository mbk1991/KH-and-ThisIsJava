package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Switch {

	public void exercise1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~3 사이의 정수를 입력하세요 : ");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			System.out.println("빨간색입니다.");
			break;
		case 2:
			System.out.println("파란색입니다.");
			break;
		case 3:
			System.out.println("초록색입니다.");
			break;
		default:
			System.out.println("1~3 사이를 입력하세요.");
			break;
		}
	}

	public void exercise2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("switch 계산기 ");
		System.out.println();
		System.out.println("정수1 입력: ");
		int num1 = sc.nextInt();
		System.out.println("사칙연산 기호 입력: ");
		char operator = sc.next().charAt(0);
		System.out.println("정수2 입력: ");
		int num2 = sc.nextInt();
		int result = 0;
		int check = 0;
		
		switch (operator) {
			case '+': result = num1 + num2 ; break;
			case '-': result = num1 - num2 ; break;
			case '*': result = num1 * num2 ; break;
			case '/': result = num1 / num2 ; break;
			default: System.out.println("연산자를 잘못 입력하셨습니다."); check =1; break;
		}
		if(check == 0) {
			System.out.println(num1 + String.valueOf(operator) + num2 + "="+  result);
		}

	}

	public void exercise3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 월의 마지막 날짜 출력");
		System.out.println("1월~12월 중 하나를 입력하세요.");
		int month = sc.nextInt();
		int lastDay = 0;
		switch(month) {
			case 1: 
			case 3: 
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12: lastDay = 31 ; break;
			case 4: 
			case 6: 
			case 9: 
			case 11: lastDay = 30 ; break;
			case 2: lastDay = 28 ; break;
			default: System.out.println("잘못 입력했습니다."); break;
		}
		
		if(month >=1 && month <= 12) {
			System.out.println("입력하신" + month + "월은" + lastDay + "일 까지입니다.");
		}
		

	}

}

package com.kh.exercise;

import java.util.Scanner;

public class Exercise_For {
	
	public void exercise1() {
		//1부터 100사이 홀수의 합
		int result = 0;
		for(int i = 1 ; i <=100 ; i += 2) {
			result += i ;
			//System.out.println("i = " + i );
		}
		System.out.println("1부터 100사이 홀수의 합계는 " + result);
		
		
	}
	public void exercise2() {
		//구구단
		Scanner sc = new Scanner(System.in);
		System.out.println("1~9 사이의 정수 하나 입력 :");
		int input = sc.nextInt();
		
		if((input>=1 && input <=9)) {
			System.out.println("구구단" + input + "단 출력!");
			for(int i = 1 ; i <=9 ; i ++) {
				System.out.println(input + "곱하기" + i +"는" + input*i);
			}
		}else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		}
		
		
	}
	public void exercise3() {
		//1부터 10까지의 덧셈을 표시하고 합도 구하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 입력 정수까지의 합 구하기");
		System.out.print("정수 하나 입력 : ");
		int k = sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i <= k ; i ++) {
			sum += i;
			System.out.print(i);
			if(i<k) {System.out.print("+");	}
			if(i==k) {System.out.println("=" + sum); }
		}
		
	}
}

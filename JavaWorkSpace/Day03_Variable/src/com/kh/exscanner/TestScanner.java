package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   //System.in은 표준 입력스트림 스트림은 반복자//
		System.out.print("int 값을 입력해주세요 :");
		int input1 = sc.nextInt();
	
		System.out.print("int 두번째 값을 입력해주세요");
		int input2 = sc.nextInt();
		
		System.out.println("input1 : " + input1);
		System.out.println("input2 : " + input2);
		
		int result = input1 + input2 ;
		System.out.println("두 값의 합은 : " + result + "입니다.");
	}
}

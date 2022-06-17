package com.kh.exercise;

import java.util.Scanner;

public class Control_Exercise2 {
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실습9: 2,3의 공배수 갯수 출력");
		System.out.println("정수 하나 입력 : ");
		int input = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= input; i++) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				System.out.print(i + " ");
			}
			if ((i % 2 == 0) && (i % 3 == 0)) {
				count++;
			}
		}
		System.out.printf("\ncount: %d", count);
		System.out.println();
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실습10: 별 찍기");
		System.out.println("정수 하나 입력 : ");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = input - i; j >= 1; j--)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실습11: 별 찍기");
		System.out.println("정수 하나 입력 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) System.out.print("*");
			System.out.println();
		}
		
		for (int k = 1; k <= input-1; k++) {
			for (int l =input-1; l >= k; l--) {
				System.out.print("*");
			}
			System.out.println();
	}
}

	public void practice12() {
	}

	public void practice13() {
	}

	public void practice14() {
	}

	public void practice15() {
	}

	public void practice16() {
	}
}

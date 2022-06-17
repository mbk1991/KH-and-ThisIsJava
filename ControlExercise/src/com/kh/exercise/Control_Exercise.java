package com.kh.exercise;

import java.util.Scanner;

public class Control_Exercise {

	public void practice1() {
	}

	public void practice2() {
	}

	public void practice3() {
	}

	public void practice4() {
	}

	public void practice5() {
	}

	public void practice6() {
	}

	public void practice7() {
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = input ; j < i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

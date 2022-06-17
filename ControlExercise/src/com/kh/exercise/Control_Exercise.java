package com.kh.exercise;

import java.util.Scanner;

public class Control_Exercise {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int input = sc.nextInt();
		int i = 1;
		
		while (true) {
			System.out.print(i + " ");
			if (i == input) break;
			i++;
		}
	}

	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int input = sc.nextInt();

		if (input < 0) {
			System.out.println("1이상의 숫자를 입력하세요.");

		} else {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int input = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= input; i++) {
			sum += i;
			System.out.print(i);
			if (i < input)
				System.out.print(" + ");
			if (i == input)
				System.out.println(" = " + sum);
		}
	}

	public void practice4() {
		// 두 개의 값을 입력받아 그 사이의 숫자를 모두 출력
		// 1미만의 숫자가 입력됐다면 1이상의 숫자를 입력
		Scanner sc = new Scanner(System.in);

		System.out.println("");
		System.out.print("첫 번째 숫자: ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자: ");
		int input2 = sc.nextInt();

		int largeNum = 0;
		int smallNum = 0;

		if (input1 < 0 || input2 < 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");

		} else {
			if (input1 < input2) {
				largeNum = input2;
				smallNum = input1;
			} else if (input1 > input2) {
				largeNum = input1;
				smallNum = input2;
			} else {
				// 같은경우
				largeNum = input1;
				smallNum = input2;
			}

			for (int i = smallNum; i <= largeNum; i++) {
				System.out.print(i + " ");
			}

		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 출력할 단 : ");
		int input = sc.nextInt();

		System.out.printf("=====%d단=====\n", input);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * % d = %d\n", input, i, input * i);
		}

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int input = sc.nextInt();
		if (input > 9)
			System.out.println("9이하의 숫자만 입력하세요.");
		for (int i = input; i <= 9; i++) {
			System.out.printf("=====%d단=====\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%dX%d = %d \n", i, j, i * j);
			}
			System.out.println();

		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = input; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

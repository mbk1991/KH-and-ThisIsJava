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
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		for (int k = 1; k <= input - 1; k++) {
			for (int l = input - 1; l >= k; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실습12: 별찍기");
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input - i; j++)
				System.out.print(" ");
			for (int k = 1; k <= i * 2 - 1; k++)
				System.out.print("*");
			System.out.println();
		}

	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실습13: 별찍기");
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			if ((i == 1) || (i == input)) {
				for (int j = 1; j <= input; j++)
					System.out.print("*");
				System.out.println();
			} else {
				for (int k = 1; k <= input; k++) {
					if ((k == 1) || (k == input))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}

	}

	public void practice14() {
//		소수를 판별하는 방법을 생각해보면
//		1) 1부터 n까지 나누어보고 나머지가 0인 경우가 두 번 이면 소수
//		2) 1부터 n까지 나누어보고 나머지가 0인 i값의 합이 1+n이면 소수
//		3) 1과 n 이외의 값으로 나누어지는 순간 소수가 아님

		Scanner sc = new Scanner(System.in);
		System.out.println("실습14:소수판별");
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		quit: if (input < 2)
			System.out.println("잘못 입력하셨습니다.");
		else {
			for (int i = 1; i <= input; i++) {
				if ((input % i == 0) && ((i != 1) && (i != input))) {
					System.out.println(i);
					System.out.println("소수가 아닙니다.");
					break quit;
				}
			}
			System.out.println("소수입니다.");
		}

	}

	public void practice15() {
		// 위 문제와 동일하나 잘못입력한 경우 다시 입력을 받도록 하기
		// 그냥 2부터 n-1까지로 나눠보면 될 듯 -> 입력값이 2일때 문제가 생김.
		Scanner sc = new Scanner(System.in);
		System.out.println("실습15:소수판별, 잘못입력한 경우 재입력");
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		while (input < 2) {
			System.out.println("잘못입력하셨습니다.");
			System.out.print("정수 하나 다시 입력 : ");
			input = sc.nextInt();
		}
		for (int i = 2; i <= (input - 1); i++) {
			if (input % i == 0) {
				System.out.println("소수가 아닙니다.");
				break;
			} else {
				System.out.println("소수입니다.");
				break;
			}
		}
		if (input == 2)
			System.out.println("소수입니다.");

	}

	public void practice16() {

		Scanner sc = new Scanner(System.in);
		System.out.println("실습16: 입력 수까지 소수의 갯수");
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		while (input < 2) {
			System.out.println("잘못 입력했습니다.");
			System.out.print("정수 하나 다시 입력 : ");
			input = sc.nextInt();
		}
		System.out.printf("2부터 %d까지의 소수 목록",input);
		System.out.print("\n>> ");
		
		int count = 0;
		for (int i = 2; i <= input; i++) {
			int zeroCount = 0 ;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) zeroCount ++;
			}
			if(zeroCount == 2) {
				System.out.print(i + " ");
				count ++;
			}
		}
		System.out.printf("\n2부터 %d까지의 소수 갯수\n>> %d",input,count);
	}
}
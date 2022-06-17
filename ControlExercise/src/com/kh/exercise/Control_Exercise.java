package com.kh.exercise;

import java.util.Scanner;

public class Control_Exercise {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
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
		System.out.print("���� �ϳ� �Է�: ");
		int input = sc.nextInt();

		if (input < 0) {
			System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");

		} else {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
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
		// �� ���� ���� �Է¹޾� �� ������ ���ڸ� ��� ���
		// 1�̸��� ���ڰ� �Էµƴٸ� 1�̻��� ���ڸ� �Է�
		Scanner sc = new Scanner(System.in);

		System.out.println("");
		System.out.print("ù ��° ����: ");
		int input1 = sc.nextInt();
		System.out.print("�� ��° ����: ");
		int input2 = sc.nextInt();

		int largeNum = 0;
		int smallNum = 0;

		if (input1 < 0 || input2 < 0) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");

		} else {
			if (input1 < input2) {
				largeNum = input2;
				smallNum = input1;
			} else if (input1 > input2) {
				largeNum = input1;
				smallNum = input2;
			} else {
				// �������
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
		System.out.println("������ ����� �� : ");
		int input = sc.nextInt();

		System.out.printf("=====%d��=====\n", input);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * % d = %d\n", input, i, input * i);
		}

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int input = sc.nextInt();
		if (input > 9)
			System.out.println("9������ ���ڸ� �Է��ϼ���.");
		for (int i = input; i <= 9; i++) {
			System.out.printf("=====%d��=====\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%dX%d = %d \n", i, j, i * j);
			}
			System.out.println();

		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
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
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = input; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

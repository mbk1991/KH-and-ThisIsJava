package com.kh.exercixe;

import java.util.Scanner;

public class Exercise_Break_Continue {
	public void exercise1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� �Է°������� ���� ���");
		System.out.print("���� �ϳ� �Է�: ");
		int input = sc.nextInt();
		int i = 1;
		int sum = 0;

		while (true) {
			sum += i;
			i++;
			if (i > input) break;

		}
		System.out.println("1����" + input + "������ ��: " + sum);
	}

	public void exercise2() {

		int sum2 = 0;
		for (int j = 1; j <= 100; j++) {
			if (j % 4 == 0)
				continue;
			sum2 += j;
		}
		System.out.println("4�� ����� ������ 1~100���� ������ �� = " + sum2);

	}
}

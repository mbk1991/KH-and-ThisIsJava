package com.kh.exercixe;

import java.util.Scanner;

public class Exercise_Break_Continue {
	public void exercise1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 입력값까지의 합을 출력");
		System.out.print("숫자 하나 입력: ");
		int input = sc.nextInt();
		int i = 1;
		int sum = 0;

		while (true) {
			sum += i;
			i++;
			if (i > input) break;

		}
		System.out.println("1부터" + input + "까지의 합: " + sum);
	}

	public void exercise2() {

		int sum2 = 0;
		for (int j = 1; j <= 100; j++) {
			if (j % 4 == 0)
				continue;
			sum2 += j;
		}
		System.out.println("4의 배수를 제외한 1~100사이 정수의 합 = " + sum2);

	}
}

package com.kh.exercixe;

import java.util.Scanner;

public class Exercise_ForDouble {

	public void exercise1() {
		// 0�� 0�к��� 23�� 59�б������

		for (int i = 0; i <= 23; i++) {
			for (int j = 0; j <= 59; j++) {
				System.out.print(i + "��" + j + "��");
			}
			System.out.println();
		}

	}

	public void exercise2() {
//		*
//		**
//		***
//		****
//		*****
//		******
		Scanner sc = new Scanner(System.in);
		System.out.println("*�� �� ���? : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int k = 1; k <= (input - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void exercise3() {
		// ������ \t
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <=9; j ++){
				System.out.print(j+"X"+i+"= "+(i*j)+"\t");
			}
			System.out.println(" ");
		}
	}
	
}

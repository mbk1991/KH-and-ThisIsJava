package com.kh.exercixe;

import java.util.Scanner;

public class Exercise_ForDouble {

	public void exercise1() {
		// 0시 0분부터 23시 59분까지출력

		for (int i = 0; i <= 23; i++) {
			for (int j = 0; j <= 59; j++) {
				System.out.print(i + "시" + j + "분");
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
		System.out.println("*몇 단 출력? : ");
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
		// 구구단 \t
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <=9; j ++){
				System.out.print(j+"X"+i+"= "+(i*j)+"\t");
			}
			System.out.println(" ");
		}
	}
	
}

package com.kh.exercise;

import java.util.Scanner;

public class Exercise_If {
	public void exercise1() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("���� �ϳ� �Է� : ");
			int inputNum = sc.nextInt();
	
			if (inputNum < 0) {
				System.out.println("����� �Է��ϼ���.");
			} else if (inputNum % 2 == 1) {
				System.out.println("Ȧ����.");
			} else {
				System.out.println("¦����.");
			}
		}
		
	}
}

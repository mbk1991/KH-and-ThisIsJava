package com.kh.control;

import java.util.Scanner;

public class Exam_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �ϳ� �Է� : ");
			int num = sc.nextInt();
	//		boolean result = num == 0;
			
			String result = num == 0 ? "0�Դϴ�." : num > 0 ? "����Դϴ�." : "�����Դϴ�.";
			System.out.println("���׿����� : " + result);
			
			if (num == 0) {
				System.out.println("0�Դϴ�.");
			} else if(num < 0) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("����Դϴ�.");
			}
		}
	}
}

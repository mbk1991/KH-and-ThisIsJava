package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String[] args) {
		//�Է¹��� �� �߿��� ������ �Է¹޾ҽ��ϴ�.
		//�Ǽ�, ���� ,���ڿ��� �Է¹޴� ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int iNum = sc.nextInt();
		
		System.out.print("�Ǽ��� �Է����ּ��� : " );
		double dNum = sc.nextDouble();
		
		System.out.print("���ڿ��� �Է����ּ��� : ");
		String inputStr = sc.next();
		
		System.out.print("���ڿ��� �Է����ּ���(nextLing()���) : ");
		String inputStr2 = sc.nextLine();
		
		System.out.print("���ڸ� �Է����ּ���  : ");
		char inputChar = sc.next().charAt(0);
		
		System.out.println("�Է��� ������ : " + iNum);
		System.out.println("�Է��� �Ǽ��� : " + dNum);
		System.out.println("�Է��� ���ڿ��� : " + inputStr);
		System.out.println("�Է��� ���ڿ�2�� : " + inputStr2);
		System.out.println("�Է��� ���ڴ� : " + inputChar);
		
		

	}
}
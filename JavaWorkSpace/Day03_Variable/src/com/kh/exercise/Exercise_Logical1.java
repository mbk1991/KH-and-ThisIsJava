package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	// �Է��� �������� 1 ~ 100 ������ �������� Ȯ���Ͻÿ�
	// ������ �ϳ� �Է����ּ��� : 33
	// 1���� 100������ �����ΰ�? : true

	public static void main(String[] args) {
		System.out.println("�Է��� �������� 1~100 ������ �������� Ȯ���ϴ� ����");

		
		
		while(true) {
		
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("������ �ϳ� �Է����ּ��� : ");
				int input = sc.nextInt();
				boolean checkBool = (input > 1) && (input < 100) ? true : false;
				System.out.println("1���� 100 ������ �����ΰ�? : " + checkBool);
				
				
			} catch (Exception e) {
				System.out.println("������ �Է��ϼ���!");
				continue;
			}
		
		}
		
		
	}

}
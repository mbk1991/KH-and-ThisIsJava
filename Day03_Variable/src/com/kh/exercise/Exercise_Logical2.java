package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {

	// �Է��� ���� ���� �빮������ Ȯ���Ͽ� ��� ����ϱ�
	// ���� �ϳ� �Է����ּ��� : a
	// ���� �빮�� Ȯ�� : false

	// ���� �ϳ� �Է����ּ��� : A
	// ���� �빮�� Ȯ�� : true

	public static void main(String[] args) {

		while (true) {
			
			System.out.println("�Է��� ���� ���� �빮������ Ȯ���Ͽ� ��� ����ϴ� ���� (���� q)");
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �ϳ� �Է����ּ���  : ");
			char inputChar = sc.next().charAt(0); // �ƽ�Ű�ڵ�65~90 �빮��
			if (inputChar == 'q') {
				System.out.println("���α׷��� ������");
				break;
			}

			System.out.println(inputChar);
			boolean capitalCheck = (inputChar >= 'A') && (inputChar <= 'Z') ? true : false;

			System.out.println("���� �빮�� Ȯ�� : " + capitalCheck);
			System.out.println('A' +'B');

		}

	}
}
package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		int[] intArray = new int[100];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
			System.out.printf("arra1[%d] : %d\n", i, intArray[i]);
		}
	}

	public void exercise2() {
//		String[] strArray = new String[5];
//		strArray = new String[] { "����", "�ٳ���", "������", "Ű��", "���", "�ٳ���" };
		String[] fruits = { "����", "������", "Ű��", "���", "�ٳ���" };
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("�ٳ���")) {
				System.out.println("strArray[" + i + "] : " + strArray[i]);
			}
		}
	}

	public void exercise3() {
		Scanner sc = new Scanner(System.in);
		int[] intArray2 = new int[5];

		System.out.println("���� ���� 5�� �Է�> ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("����%d> ", i + 1);
			intArray2[i] = sc.nextInt();
			while (intArray2[i] < 0) {
				System.out.printf("���� ������ �Է��ϼ���\n ����%d> ", i + 1);
				intArray2[i] = sc.nextInt();
			}
		}
//		for(int i=0; i<5; i++) {
//			System.out.println("intArray2["+i+"]" + intArray2[i]);
//		}

		int max = 0;
		for (int i = 0; i < intArray2.length; i++) {
			if (intArray2[i] >= max) {
				max = intArray2[i];
			}
		}
		System.out.println("�Է��� ���� �� �ִ밪�� " + max);

	}

	public void exercise4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� 5�� �Է�> ");
		int[] intArray3 = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.printf("����%d> ", i + 1);
			intArray3[i] = sc.nextInt();
			while (intArray3[i] < 0) {
				System.out.printf("���� ������ �Է��ϼ���\n����%d> ", i + 1);
				intArray3[i] = sc.nextInt();
			}
		}
		double avg = 0.0;
		int sum = 0;
		for (int i = 0; i < intArray3.length; i++) {
			sum += intArray3[i];
		}
		avg = (double) sum / intArray3.length;
		System.out.println("�Է��� ���ڵ��� ����� " + avg);
	}

	public void exercise5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է� >");
		String number = sc.next();
		while ((number.charAt(6) != '-') || (number.length() > 14)) {
			System.out.println("��Ŀ� ���� �Է��ϼ���.");
			System.out.println("xxxxxx-xxxxxxx");
			System.out.println("�ֹι�ȣ �Է� >");
			number = sc.next();
		}

		char[] charArray = new char[14];
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = number.charAt(i);
		}

		for (int i = 0; i < charArray.length; i++) {
			if (i < 7) {
				System.out.print(charArray[i]);
			} else {
				System.out.print("*");
			}
		}

	}

}

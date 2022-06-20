package com.kh.exercise;

import java.util.Random;
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
				System.out.println("fruits[" + i + "] : " + fruits[i]);
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
		// *�� �����Ͽ� ����̳� �����ϰ� *�� �����.

		char[] charArray = new char[number.length()];
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = number.charAt(i);
		}

		// ���� ����.
		char[] maskingArray = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			if (i < 8) {
				maskingArray[i] = charArray[i];
			} else {
				maskingArray[i] = '*';
			}
		}

		for (int i = 0; i < maskingArray.length; i++) {
			System.out.print(maskingArray[i]);
		}
	}

	public void exercise6() {
		// �������� ����

		Scanner sc = new Scanner(System.in);
//		System.out.println("5���� ��� �Է�");
//		
//		int[] arrs = new int[5];
//		for (int i = 0; i < arrs.length; i++) {
//			System.out.print("����" + (i + 1) + "�Է�> ");
//			arrs[i] = sc.nextInt();
//			while(arrs[i]<0) {
//				System.out.println("����� �Է��ϼ���.");
//				System.out.print("����"+(i+1) +"> ");
//				arrs[i] = sc.nextInt();
//			}
//			
//		}

		// �Է��� �������� �������� �־��.
		System.out.print("�迭�� ���� �Է�>");
		int arrayLength = sc.nextInt();
		while (arrayLength <= 0) {
			System.out.println("1�̻��� ����� �Է��ϼ���.");
			arrayLength = sc.nextInt();
		}

		int[] arrs = new int[arrayLength];
		Random rand = new Random();

		for (int i = 0; i < arrayLength; i++) {
			arrs[i] = rand.nextInt(1000);
		}

		System.out.println("���� ��");
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}

		for (int i = 1; i < arrs.length; i++) {
			for (int j = (i - 1); j >= 0; j--) {
				if (arrs[j + 1] < arrs[j]) {
					int temp = arrs[j + 1];
					arrs[j + 1] = arrs[j];
					arrs[j] = temp;
				}
			}

			System.out.println("\n���� ��-----");
			for (int k = 0; k < arrs.length; k++) {
				System.out.print(arrs[k] + " ");
			}

		}

		System.out.println("\n���� ��");
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

	public void exercise7() {
		// �ζ� �ڵ� ������ ���α׷�
		// �ߺ����� ��������

		Random rand = new Random();
		int[] lottos = new int[6];
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = rand.nextInt(45) + 1;
			for(int j =0; j<i; j++) {
				if(lottos[j]==lottos[i] {
					i--;  //�̰� ����Ʈ /�ߺ��� ��� �����İ� ������ ���� i���� �ٽ� �̰Ե�.
					break;  //
				}
			}

			System.out.print(lottos[i] + " ");
		}

		// �������� ����

		int minIndex;
		for (int i = 0; i < lottos.length; i++) {
			minIndex = i;
			for (int j = i; j < lottos.length; j++) {
				if (lottos[minIndex] > lottos[j]) {
					minIndex = j;
				}
			}
			int temp = lottos[i];
			lottos[i] = lottos[minIndex];
			lottos[minIndex] = temp;
		}

		System.out.println();
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}

	}

}

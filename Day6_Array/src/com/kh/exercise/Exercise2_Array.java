package com.kh.exercise;

import java.util.Scanner;

public class Exercise2_Array {
	public void practice1() {
		// ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ�����
		// �̿��Ͽ� ������� �迭 �ε����� ���� �� �� ���� ���

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		// ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ����
		// �ݺ����� �̿��Ͽ� �������� �迭 �ε����� ���� ��
		// �� ���� ���

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
		// ����ڿ��� �Է¹��� ���� ������ŭ �迭 ũ�⸦ �Ҵ�
		// 1���� �Է¹��� ������ �迭�� �ʱ�ȭ�� �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ���� �Է� > ");
		int arrLength = sc.nextInt();
		while (arrLength < 0) {
			System.out.println("���� ���� �Է�>");
			arrLength = sc.nextInt();
		}

		int[] arr = new int[arrLength];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		// ���̰� 5�� String�迭�� �����ϰ�
		// "���","��","����","������","����"�� �ʱ�ȭ �� ��
		// �迭 �ε����� Ȱ���Ͽ� ���� ���

		String[] strArray = new String[5];
		strArray = new String[] { "���", "��", "����", "������", "����" };

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals("��")) {
				System.out.println("strArray[" + i + "] ��/�� " + strArray[i]);
			}
		}
	}

	public void practice5() {
		// ���ڿ��� �Է¹޾� ���� �ϳ��ϳ��� �迭�� �ְ�
		// �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������
		// �� ��° �ε����� ��ġ�ϴ��� �ε����� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�> ");
		String inputString = sc.next();
		System.out.print("�˻��� ����> ");
		char searchChar = sc.next().charAt(0);

		char[] charArray = new char[inputString.length()];
		int count = 0;

		System.out.print(searchChar + "��/�� �����ϴ� �ε��� :");
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = inputString.charAt(i);
			if (charArray[i] == searchChar) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n" + searchChar + "�� ���� : " + count);
	}

	public void practice6() {
		// "��" ~ "��"���� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0����
		// 6���� ���ڸ� �Է¹޾� �Է��� ���ڿ� ���� �ε����� �ִ�
		// ������ ����ϰ� ������ ���� �� �߸��Է� ���

		String[] week = { "��", "ȭ", "��", "��", "��", "��", "��" };
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�> ");
		int inputNum = sc.nextInt();
		while (inputNum < 1 || inputNum > 7) {
			System.out.println("1���� 7���̸� �Է��ϼ���.");
			inputNum = sc.nextInt();
		}

//		switch (inputNum) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//		case 6:
//		case 7:
//			System.out.println("�Է°�: " + inputNum + ": " + week[inputNum-1]);
//			break;

		if (inputNum >= 1 && inputNum <= 7) {
			System.out.println("�Է°�: " + inputNum + ": " + week[inputNum - 1]);
		}
	}

	public void practice7() {
		// �迭�� ���̸� �����Է�, �� ����ŭ ������ �迭�� ���� �� �Ҵ�
		// �迭�� ũ�⸸ŭ ����ڰ� ���� �ε��� ���� �ʱ�ȭ
		// �迭 ��ü���� �����ϰ� �� �ε����� ����� ������ ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ���� �Է�> ");
		int inputLength = sc.nextInt();
		while (inputLength < 0) {
			System.out.println("����� �Է��ϼ���. >");
			inputLength = sc.nextInt();
		}
		int[] intArray = new int[inputLength];
		for (int i = 0; i < intArray.length; i++) {
			System.out.printf("intArray[%d] �� �Է�:", i);
			intArray[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
			System.out.print(intArray[i] + " ");
		}
		System.out.println("\n�� �� : " + sum);

	}

	public void practice8() {
		// 3�̻��� Ȧ�� �ڿ����� �Է¹޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ��������
		// �߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ���
		// �Է� ������ Ȧ���� �ƴϰų� 3�̸��� ��� �ٽ� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("3�̻� Ȧ�� �Է��ϼ���");
		int input = sc.nextInt();
		while ((input < 3) || (input % 2 != 1)) {
			System.out.println("3�̻� Ȧ���� �Է��ϼ���>");
			input = sc.nextInt();
		}

		int[] arr = new int[input];
		for (int i = 0; i < arr.length; i++) {
			if (i <= ((input - 1) / 2)) {
				arr[i] = i + 1;
			} else {
				arr[i] = input - i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public void practice9() {
//		//����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ�
//	    ������ "OOOġŲ ��� ����" ������ "OOOġŲ�� ���� �޴��Դϴ�"�� ���
//	    ��, ġŲ �޴��� �� �ִ� �迭�� ���ν����� ����
		Scanner sc = new Scanner(System.in);

		String[] chickenMenu = { "���", "�Ķ��̵�", "����", "�Ĵ�", "�����������" };

		System.out.print("ġŲ �̸��� �Է��ϼ���: ");
		String inputString = sc.next();

		int count =0;
		for (int i = 0; i < chickenMenu.length; i++) {
			if (chickenMenu[i].equals(inputString)) {
				System.out.println(inputString + "ġŲ�� ��� ����");
				count ++;
				break;
			}
		}
		if(count==0) {
			System.out.println("���¸޴��Դϴ�.");
		}
	}
	public void practice10() {
		//�ֹι�ȣ ����ŷ ���� ���� �� ǯ
	}
}

package com.kh.exercise;

import java.util.Scanner;

public class Control_Exercise2 {
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ǽ�9: 2,3�� ����� ���� ���");
		System.out.println("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= input; i++) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				System.out.print(i + " ");
			}
			if ((i % 2 == 0) && (i % 3 == 0)) {
				count++;
			}
		}
		System.out.printf("\ncount: %d", count);
		System.out.println();
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ǽ�10: �� ���");
		System.out.println("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = input - i; j >= 1; j--)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ǽ�11: �� ���");
		System.out.println("���� �ϳ� �Է� : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		for (int k = 1; k <= input - 1; k++) {
			for (int l = input - 1; l >= k; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ǽ�12: �����");
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input - i; j++)
				System.out.print(" ");
			for (int k = 1; k <= i * 2 - 1; k++)
				System.out.print("*");
			System.out.println();
		}

	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ǽ�13: �����");
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			if ((i == 1) || (i == input)) {
				for (int j = 1; j <= input; j++)
					System.out.print("*");
				System.out.println();
			} else {
				for (int k = 1; k <= input; k++) {
					if ((k == 1) || (k == input))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}

	}

	public void practice14() {
//		�Ҽ��� �Ǻ��ϴ� ����� �����غ���
//		1) 1���� n���� ������� �������� 0�� ��찡 �� �� �̸� �Ҽ�
//		2) 1���� n���� ������� �������� 0�� i���� ���� 1+n�̸� �Ҽ�
//		3) 1�� n �̿��� ������ ���������� ���� �Ҽ��� �ƴ�

		Scanner sc = new Scanner(System.in);
		System.out.println("�ǽ�14:�Ҽ��Ǻ�");
		System.out.print("���� �Է�: ");
		int input = sc.nextInt();
		quit: if (input < 2)
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		else {
			for (int i = 1; i <= input; i++) {
				if ((input % i == 0) && ((i != 1) && (i != input))) {
					System.out.println(i);
					System.out.println("�Ҽ��� �ƴմϴ�.");
					break quit;
				}
			}
			System.out.println("�Ҽ��Դϴ�.");
		}

	}

	public void practice15() {
		// �� ������ �����ϳ� �߸��Է��� ��� �ٽ� �Է��� �޵��� �ϱ�
		// �׳� 2���� n-1������ �������� �� �� -> �Է°��� 2�϶� ������ ����.
		Scanner sc = new Scanner(System.in);
		System.out.println("�ǽ�15:�Ҽ��Ǻ�, �߸��Է��� ��� ���Է�");
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		while (input < 2) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			System.out.print("���� �ϳ� �ٽ� �Է� : ");
			input = sc.nextInt();
		}
		for (int i = 2; i <= (input - 1); i++) {
			if (input % i == 0) {
				System.out.println("�Ҽ��� �ƴմϴ�.");
				break;
			} else {
				System.out.println("�Ҽ��Դϴ�.");
				break;
			}
		}
		if (input == 2)
			System.out.println("�Ҽ��Դϴ�.");

	}

	public void practice16() {

		Scanner sc = new Scanner(System.in);
		System.out.println("�ǽ�16: �Է� ������ �Ҽ��� ����");
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		while (input < 2) {
			System.out.println("�߸� �Է��߽��ϴ�.");
			System.out.print("���� �ϳ� �ٽ� �Է� : ");
			input = sc.nextInt();
		}
		System.out.printf("2���� %d������ �Ҽ� ���",input);
		System.out.print("\n>> ");
		
		int count = 0;
		for (int i = 2; i <= input; i++) {
			int zeroCount = 0 ;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) zeroCount ++;
			}
			if(zeroCount == 2) {
				System.out.print(i + " ");
				count ++;
			}
		}
		System.out.printf("\n2���� %d������ �Ҽ� ����\n>> %d",input,count);
	}
}
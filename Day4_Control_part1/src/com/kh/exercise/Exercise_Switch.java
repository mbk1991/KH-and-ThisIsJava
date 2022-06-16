package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Switch {

	public void exercise1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~3 ������ ������ �Է��ϼ��� : ");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			System.out.println("�������Դϴ�.");
			break;
		case 2:
			System.out.println("�Ķ����Դϴ�.");
			break;
		case 3:
			System.out.println("�ʷϻ��Դϴ�.");
			break;
		default:
			System.out.println("1~3 ���̸� �Է��ϼ���.");
			break;
		}
	}

	public void exercise2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("switch ���� ");
		System.out.println();
		System.out.println("����1 �Է�: ");
		int num1 = sc.nextInt();
		System.out.println("��Ģ���� ��ȣ �Է�: ");
		char operator = sc.next().charAt(0);
		System.out.println("����2 �Է�: ");
		int num2 = sc.nextInt();
		int result = 0;
		int check = 0;
		
		switch (operator) {
			case '+': result = num1 + num2 ; break;
			case '-': result = num1 - num2 ; break;
			case '*': result = num1 * num2 ; break;
			case '/': result = num1 / num2 ; break;
			default: System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�."); check =1; break;
		}
		if(check == 0) {
			System.out.println(num1 + String.valueOf(operator) + num2 + "="+  result);
		}

	}

	public void exercise3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� ���� ������ ��¥ ���");
		System.out.println("1��~12�� �� �ϳ��� �Է��ϼ���.");
		int month = sc.nextInt();
		int lastDay = 0;
		switch(month) {
			case 1: 
			case 3: 
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12: lastDay = 31 ; break;
			case 4: 
			case 6: 
			case 9: 
			case 11: lastDay = 30 ; break;
			case 2: lastDay = 28 ; break;
			default: System.out.println("�߸� �Է��߽��ϴ�."); break;
		}
		
		if(month >=1 && month <= 12) {
			System.out.println("�Է��Ͻ�" + month + "����" + lastDay + "�� �����Դϴ�.");
		}
		

	}

}

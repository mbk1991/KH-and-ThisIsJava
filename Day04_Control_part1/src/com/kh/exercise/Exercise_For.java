package com.kh.exercise;

import java.util.Scanner;

public class Exercise_For {
	
	public void exercise1() {
		//1���� 100���� Ȧ���� ��
		int result = 0;
		for(int i = 1 ; i <=100 ; i += 2) {
			result += i ;
			//System.out.println("i = " + i );
		}
		System.out.println("1���� 100���� Ȧ���� �հ�� " + result);
		
		
	}
	public void exercise2() {
		//������
		Scanner sc = new Scanner(System.in);
		System.out.println("1~9 ������ ���� �ϳ� �Է� :");
		int input = sc.nextInt();
		
		if((input>=1 && input <=9)) {
			System.out.println("������" + input + "�� ���!");
			for(int i = 1 ; i <=9 ; i ++) {
				System.out.println(input + "���ϱ�" + i +"��" + input*i);
			}
		}else {
			System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�.");
		}
		
		
	}
	public void exercise3() {
		//1���� 10������ ������ ǥ���ϰ� �յ� ���Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� �Է� ���������� �� ���ϱ�");
		System.out.print("���� �ϳ� �Է� : ");
		int k = sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i <= k ; i ++) {
			sum += i;
			System.out.print(i);
			if(i<k) {System.out.print("+");	}
			if(i==k) {System.out.println("=" + sum); }
		}
		
	}
}

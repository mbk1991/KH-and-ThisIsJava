package com.kh.exercise;

import java.util.Scanner;

public class Exercise_while {
	
	public void exercise1() {
		//while ���� �̿��Ͽ� 1~100 ������ Ȧ���� �� ���
		
		int sum = 0;
		int i = 1;
		while(i<=100) {
			sum += i;
			i+=2;	
		}
		System.out.println("1���� 100 ���� Ȧ���� �� �ⷰ : " + sum);
		
		
	}
	public void exercise2() {
		//while���� �̿��Ͽ� ������
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		while(true) {
			System.out.println("while���� �̿��� ������!");
			System.out.print("1~9���� ���� �Է�: ");
			int input = sc.nextInt();
			if(input>=1 && input<= 9) {
				int j = 1;
				while(j<=9) {
					System.out.println(input+ "*" + j+ "="+ input*j);
					j++;
				}
			}else {System.out.println("1~9������ ����� �Է��Ͽ����մϴ�.");}
		}
		
		
	}
	public void exercise3() {
		// -1�� �Էµ� ������ ������ �Է¹ް� -1�Է¹����� �������� �Է��� ���� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("-1�� �Է¹ޱ� ������ �Է¹��� ���� ��");
		
		int sum = 0;
		boolean check = true;
		while(check) {
			System.out.print("���� �ϳ� �Է�: ");
			int input2 = sc.nextInt();		
			if(input2 == -1) {
				System.out.println("�Է��Ͻ� ���� ���� : " + sum);
				check = false;
			}else {
				sum += input2;
			}
		}

		
		
	}
	public void exercise4() {
		//while���� �̿��Ͽ� -1�� �� ������ ���� �������� �Է¹ް� ����� ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("-1�� �Է¹ޱ� ������ �Է¹��� ���� ������ ���� ���");
		
		int sum = 0;
		int count = 0;
		double average = 0;
		boolean check2 = true;
		
		while(check2) {
			System.out.print("���� �ϳ� �Է� : ");
			int input3 = sc.nextInt();	
			
			if(input3 == -1) {
				if(count == 0) {
					System.out.println("�Էµ� ���� �����ϴ�.");
					check2 =false;
				}else {
					average = (double)sum / (double)count;
					System.out.println("������ ������" + count +"���̸� �����" + average + "�Դϴ�.");
					check2 =false;
				}
			}else {
				sum += input3;
				count++;		
					}
			}
 }
}


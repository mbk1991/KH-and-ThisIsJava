package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner3 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("�̸��� �Է����ּ��� : ");
	String name = sc.next();
	System.out.print("�¾ ���� �Է����ּ��� (���ڸ�): ");
	int month = sc.nextInt();
	System.out.print("Ű�� �Է����ּ��� (�Ǽ�): ");
	double height = sc.nextDouble();
	System.out.print("������ �Է����ּ��� : ");
	char gender = sc.next().charAt(0);
	System.out.print("�ּ��� �Է����ּ��� : ");
	sc.nextLine();  //�� �κ��� ����Ʈ
	String adress = sc.nextLine();
	
	System.out.println("�̸��� " + name +"�Դϴ�.");
	System.out.println("�¾ ���� " + month + "�� �Դϴ�.");
	System.out.println("Ű�� " + height + "�Դϴ�.");
	System.out.println("������ " + gender + "�Դϴ�.");
	System.out.println("�ּҴ� " + adress + "�Դϴ�.");
	
	
 }
}
package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   //System.in�� ǥ�� �Է½�Ʈ�� ��Ʈ���� �ݺ���//
		System.out.print("int ���� �Է����ּ��� :");
		int input1 = sc.nextInt();
	
		System.out.print("int �ι�° ���� �Է����ּ���");
		int input2 = sc.nextInt();
		
		System.out.println("input1 : " + input1);
		System.out.println("input2 : " + input2);
		
		int result = input1 + input2 ;
		System.out.println("�� ���� ���� : " + result + "�Դϴ�.");
	}
}
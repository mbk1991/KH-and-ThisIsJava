package com.kh.exercise;
import java.util.Scanner;


public class Exercise_Triple1 {
	// �Է¹��� ������ ���, 0, �������� �Ǻ� �� ����ϼ���..
	// �ʹ� ������ ���, ���� �Ǻ����� �غ�����
	// ������ �Է����ּ��� : -1
	// -1��/�� �����Դϴ�.

	// ������ �Է����ּ��� : 1
	// 1��/�� ����Դϴ�.

	// ������ �Է����ּ��� : 0
	// 0��/�� 0�Դϴ�.

	public static void main(String[] args) {
		System.out.println("�Է¹��� ������ ���, 0, �������� �Ǻ�");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �Է����ּ��� : ");
			int input = sc.nextInt();
			String result = (input == 0) ? "0" : ((input > 0) ? "���" : "����");
			System.out.println(input + "��/��" + result + " �Դϴ�.");
		}
	}
	
	
}
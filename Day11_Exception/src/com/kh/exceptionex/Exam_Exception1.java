package com.kh.exceptionex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception1 {
	public static void main(String[] args) {
		// InputMismatchException
		// ArithmeticException
		// ���� 2���� �Է¹޾Ƽ� ������ ���� ����
		// 0���� ���� �� �߻��ϴ� ����ó��
		// ���� �Է¹��� �� �߻��ϴ� ����ó��

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("ù��° ���� �Է� :");
				int num1 = sc.nextInt();
				System.out.print("�ι�° ���� �Է� :");
				int num2 = sc.nextInt();
				int result = num1 / num2;
				System.out.println(num1 + "��" + num2 + "�� ���� ���� " + result + "�Դϴ�.");
			} catch (InputMismatchException e) {
				System.out.println("���ڿ��� �Է��� �� �����ϴ�.");
				sc.next();
				continue;
			} catch (ArithmeticException ex) {
				System.out.println("0���� ���� �� �����ϴ�." + ex.getMessage());
			} finally {
				System.out.println("finally");
			}
			System.out.println("try�� ��");
		}
	}
}

package com.kh.student;

import java.util.Scanner;

public class ManageStudent {
	private Student[] student;

	public ManageStudent() {
		student = new Student[3];
		// student ��ü�� ���� �� �ִ�
		// ũ�� 3�� �迭�� ����
		// ->������� �ʱ�ȭ
		// �����ڿ��� ��
	}

	public int showMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n====�л��������� ���α׷�====");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ���α׷� ����");
		System.out.print("�޴��Է� > ");
		int choice = sc.nextInt();
		return choice;
	}

	public void inserInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====�л� ���� �Է�=====");
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
			System.out.print("�̸� > ");
			String name = sc.next();
			System.out.print("�������� > ");
			int kor = sc.nextInt();
			System.out.print("�������� > ");
			int eng = sc.nextInt();
			System.out.print("��������> ");
			int math = sc.nextInt();
			// ����
			student[i].setName(name);
			student[i].setKor(kor);
			student[i].setEng(eng);
			student[i].setMath(math);
		}
	}

	public void printInfo() {
		System.out.println("\n=====�л� ���� ���=====");
		for (int i = 0; i < student.length; i++) {
			Student std = student[i];
			System.out.println((i+1)+"��° "+std.getName()+"�л��� ����");
			System.out.println("�������� : " + std.getKor());
			System.out.println("�������� : " + std.getEng());
			System.out.println("�������� : " + std.getMath());
			System.out.println("�л��� ���� : " + std.getSum());
			System.out.println("�л��� ��� : "+ std.getAvg());
			System.out.println("\n=====���м�=====");
			
			
		}
	}
}

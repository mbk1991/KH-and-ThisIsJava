package com.kh.student;

import java.util.Scanner;

public class ManageStudent {
	Student student;
	Student[] students = new Student[3];

	public ManageStudent() {
		student = new Student();
	}

	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("=====�л� ���� ���� ���α׷� v1.0=====");
		System.out.println("1.�л������Է�");
		System.out.println("2.�л��������");
		System.out.println("3.����");
		System.out.println();
		System.out.print("�Է� > ");
		int choice = sc.nextInt();

		return choice;
	}

	public void insertInfomation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====�л� ���� �Է�=====");
		System.out.print("�̸� �Է� >");
		String name = sc.next();
		System.out.print("�������� �Է� >");
		int kor = sc.nextInt();
		System.out.print("�������� �Է� >");
		int eng = sc.nextInt();
		System.out.print("�������� �Է� >");
		int math = sc.nextInt();
		// ��������� private ��������x , setter�� �̿��� ����.
		student.setName(name);
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);

	}

	public void printResult() {

		System.out.println("=====" + student.getName() + "�л� ���� ���=====");
		System.out.println("����� : " + student.getKor());
		System.out.println("����� : " + student.getEng());
		System.out.println("���м��� : " + student.getMath());
		System.out.println("���� ���� : " + student.printTotal());
		System.out.println("���� ��� : " + student.printAvg());

	}
	
	public void saveStudent() {
		
	}
	
	public void listStudent() {
		
	}

}

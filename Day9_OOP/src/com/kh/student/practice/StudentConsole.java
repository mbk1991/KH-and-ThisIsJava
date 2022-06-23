package com.kh.student.practice;

import java.util.Scanner;

public class StudentConsole {
	private StudentController sController;
	
	
	public StudentConsole() {
		sController = new StudentController();
	}
	
	
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====�л� �������� ���α׷�=====");
		System.out.println("1.�л� ���� �Է�");
		System.out.println("2.�л� ���� ���");
		System.out.println("3.���α׷� ����");
		System.out.print("�޴��Է� > ");
		int input = sc.nextInt();
		
		return input;
	}

	public void insertInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====�л� ���� �Է�=====");
		Student[] students = new Student[3];
	
		for (int i = 0; i < 3; i++) {
			students[i] = new Student();
			System.out.println("�л� ���� �Է�");
			System.out.print("�̸� > ");
			String name = sc.next();
			System.out.print("�������� > ");
			int kor = sc.nextInt();
			System.out.print("�������� > ");
			int eng = sc.nextInt();
			System.out.print("�������� > ");
			int math = sc.nextInt();
			
			students[i].setName(name);
			students[i].setKor(kor);
			students[i].setEng(eng);
			students[i].setMath(math);
		}
		sController.setStudents(students);
	}

	public void printInfo() {
		System.out.println("=====�л� ���� ���=====");
		
		for(int i = 0; i<3; i++) {
			Student std = sController.getStudents()[i];
			System.out.println((i+1)+"�� ° �л� "+ std.getName());
			System.out.println("��������: " + std.getKor());
			System.out.println("��������: " + std.getEng());
			System.out.println("��������: " + std.getMath());
			System.out.println("���� : " + std.getSum());
			System.out.println("��� : " + std.getAvg());
		}
	}
 
}

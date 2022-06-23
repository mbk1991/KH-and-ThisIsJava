package com.kh.student.practice;

import java.util.Scanner;

public class StudentConsole {
	private StudentController sController;
	
	
	public StudentConsole() {
		sController = new StudentController();
	}
	
	
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====학생 정보관리 프로그램=====");
		System.out.println("1.학생 정보 입력");
		System.out.println("2.학생 정보 출력");
		System.out.println("3.프로그램 종료");
		System.out.print("메뉴입력 > ");
		int input = sc.nextInt();
		
		return input;
	}

	public void insertInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====학생 정보 입력=====");
		Student[] students = new Student[3];
	
		for (int i = 0; i < 3; i++) {
			students[i] = new Student();
			System.out.println("학생 정보 입력");
			System.out.print("이름 > ");
			String name = sc.next();
			System.out.print("국어점수 > ");
			int kor = sc.nextInt();
			System.out.print("영어점수 > ");
			int eng = sc.nextInt();
			System.out.print("수학점수 > ");
			int math = sc.nextInt();
			
			students[i].setName(name);
			students[i].setKor(kor);
			students[i].setEng(eng);
			students[i].setMath(math);
		}
		sController.setStudents(students);
	}

	public void printInfo() {
		System.out.println("=====학생 정보 출력=====");
		
		for(int i = 0; i<3; i++) {
			Student std = sController.getStudents()[i];
			System.out.println((i+1)+"번 째 학생 "+ std.getName());
			System.out.println("국어점수: " + std.getKor());
			System.out.println("영어점수: " + std.getEng());
			System.out.println("수학점수: " + std.getMath());
			System.out.println("총점 : " + std.getSum());
			System.out.println("평균 : " + std.getAvg());
		}
	}
 
}

package com.kh.student;

import java.util.Scanner;

public class ManageStudent {
	private Student[] student;

	public ManageStudent() {
		student = new Student[3];
		// student 객체를 담을 수 있는
		// 크기 3인 배열을 만듦
		// ->멤버변수 초기화
		// 생성자에서 함
	}

	public int showMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n====학생정보관리 프로그램====");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴입력 > ");
		int choice = sc.nextInt();
		return choice;
	}

	public void inserInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====학생 정보 입력=====");
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
			System.out.print("이름 > ");
			String name = sc.next();
			System.out.print("국어점수 > ");
			int kor = sc.nextInt();
			System.out.print("영어점수 > ");
			int eng = sc.nextInt();
			System.out.print("수학점수> ");
			int math = sc.nextInt();
			// 저장
			student[i].setName(name);
			student[i].setKor(kor);
			student[i].setEng(eng);
			student[i].setMath(math);
		}
	}

	public void printInfo() {
		System.out.println("\n=====학생 정보 출력=====");
		for (int i = 0; i < student.length; i++) {
			Student std = student[i];
			System.out.println((i+1)+"번째 "+std.getName()+"학생의 성적");
			System.out.println("국어점수 : " + std.getKor());
			System.out.println("영어점수 : " + std.getEng());
			System.out.println("수학점수 : " + std.getMath());
			System.out.println("학생의 총점 : " + std.getSum());
			System.out.println("학생의 평균 : "+ std.getAvg());
			System.out.println("\n=====구분선=====");
			
			
		}
	}
}

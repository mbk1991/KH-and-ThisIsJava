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
		System.out.println("=====학생 성적 관리 프로그램 v1.0=====");
		System.out.println("1.학생정보입력");
		System.out.println("2.학생정보출력");
		System.out.println("3.종료");
		System.out.println();
		System.out.print("입력 > ");
		int choice = sc.nextInt();

		return choice;
	}

	public void insertInfomation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====학생 정보 입력=====");
		System.out.print("이름 입력 >");
		String name = sc.next();
		System.out.print("국어점수 입력 >");
		int kor = sc.nextInt();
		System.out.print("영어점수 입력 >");
		int eng = sc.nextInt();
		System.out.print("수학점수 입력 >");
		int math = sc.nextInt();
		// 멤버변수는 private 직접접근x , setter를 이용한 접근.
		student.setName(name);
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);

	}

	public void printResult() {

		System.out.println("=====" + student.getName() + "학생 정보 출력=====");
		System.out.println("국어성적 : " + student.getKor());
		System.out.println("영어성적 : " + student.getEng());
		System.out.println("수학성적 : " + student.getMath());
		System.out.println("점수 총합 : " + student.printTotal());
		System.out.println("점수 평균 : " + student.printAvg());

	}
	
	public void saveStudent() {
		
	}
	
	public void listStudent() {
		
	}

}

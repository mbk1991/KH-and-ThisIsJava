package com.kh.oop.studentmanage;

import java.util.Scanner;

public class StudentView {
	public char viewMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====학생 관리 프로그램=====");
		System.out.println("1. 학생 정보 전체조회");
		System.out.println("2. 학생 번호로 조회");
		System.out.println("3. 학생 이름으로 조회");
		System.out.println("4. 학생정보 입력");
		System.out.println("5. 학생 정보 변경");
		System.out.println("6. 학생 정보 수정");
		System.out.println("7. 학생 정보 삭제");
		System.out.println("8. save");
		System.out.println("9. load");
		System.out.println("0. 종료");
		System.out.println("메뉴 선택 > ");
		return sc.next().charAt(0);
	}
	
	public void viewStudenCreate() {}
	public void viewStudentRead() {}
	public void viewStudentDelete() {}
	public void viewSudentUpdate() {}
	

}

package com.kh.oop.studentmanage;

import java.util.Scanner;

public class StudentView {
	public char viewMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====�л� ���� ���α׷�=====");
		System.out.println("1. �л� ���� ��ü��ȸ");
		System.out.println("2. �л� ��ȣ�� ��ȸ");
		System.out.println("3. �л� �̸����� ��ȸ");
		System.out.println("4. �л����� �Է�");
		System.out.println("5. �л� ���� ����");
		System.out.println("6. �л� ���� ����");
		System.out.println("7. �л� ���� ����");
		System.out.println("8. save");
		System.out.println("9. load");
		System.out.println("0. ����");
		System.out.println("�޴� ���� > ");
		return sc.next().charAt(0);
	}
	
	public void viewStudenCreate() {}
	public void viewStudentRead() {}
	public void viewStudentDelete() {}
	public void viewSudentUpdate() {}
	

}

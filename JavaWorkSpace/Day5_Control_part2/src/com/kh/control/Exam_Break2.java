package com.kh.control;

import java.util.Scanner;

public class Exam_Break2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		quit:
		while(true) {
			System.out.println("-----");
			System.out.println("1. �Է�");
			System.out.println("2. ����");
			System.out.println("3. ��ȸ");
			System.out.println("4. ����");
			System.out.println("0. ����");
			System.out.println("�޴� ��ȣ�� �Է��ϼ��� :");
			System.out.println("-----");
	
			int select = sc.nextInt();
			switch (select) {
			case 1: System.out.println("�Է¸޴��Դϴ�."); break;
			case 2: System.out.println("�����޴��Դϴ�."); break;
			case 3: System.out.println("��ȸ�޴��Դϴ�."); break;
			case 4: System.out.println("�����޴��Դϴ�."); break;
			case 0: System.out.println("����޴��Դϴ�."); break quit;
			default : System.out.println(); break;
			
   }
  }
 }
}


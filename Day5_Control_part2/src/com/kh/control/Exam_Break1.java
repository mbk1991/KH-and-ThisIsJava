package com.kh.control;

import java.util.Scanner;

public class Exam_Break1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���ڿ� �Է�: ");
			String input = sc.nextLine();
			
			if(input.equals("end")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.println("���ڿ��� ����: " + input.length());
		}
		
	}
}

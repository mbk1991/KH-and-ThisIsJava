package com.kh.program;

import java.util.Scanner;

public class ScoreProgram {

	
	public static void main(String[] args) {

		 int kor = 0;
		 int eng = 0;
		 int math = 0;
		
		Scanner sc = new Scanner(System.in);
		EXIT: while (true) {
			printMainMenu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				int[] scores = insertScore();
				kor = scores[0];
				eng = scores[1];
				math = scores[2];
				break;

			case 2:
				printScore(kor,eng,math);
				break;

			case 3:
				System.out.println("Good Bye~");
				break EXIT;

			default:
				quit();
				break;
			}
		}
	}

	static void printMainMenu() {
		System.out.println("===== ���� �޴�=====");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println(("3.����"));
		System.out.print("����: ");

	}

	static int[] insertScore() {
		Scanner sc = new Scanner(System.in);
		int [] scores = new int[3];
		System.out.println("=====���� �Է�=====");
		System.out.print("����: ");
		scores[0] = sc.nextInt();
		System.out.print("����: ");
		scores[1] = sc.nextInt();
		System.out.print("����: ");
		scores[2] = sc.nextInt();
		
		return scores;
	}

	static void printScore(int kor, int eng, int math) {
		System.out.println("=====���� ���=====");
		int total = kor + eng + math;
		double avg = total / 3;
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + math);
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
	}

	static void quit() {
		System.out.println("�߸��Է��ϼ̽��ϴ�.");
	}

}

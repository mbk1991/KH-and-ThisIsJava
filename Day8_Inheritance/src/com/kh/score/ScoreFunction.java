package com.kh.score;

import java.util.Scanner;

public class ScoreFunction {
	private int kor;
	private int eng;
	private int math;

	public int printMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====�������� ���α׷� v1.0=====");
		System.out.println("1.�����Է� 2.������� 3.����");
		int choice = sc.nextInt();
		return choice;
	}

	public void insertScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====���� �Է�=====");
		System.out.print("���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		math = sc.nextInt();

	}

	public void printScore() {
		System.out.println("=====���� ���=====");
		int total = kor + eng + math;
		double avg = total / 3;
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + math);
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		

	}
}

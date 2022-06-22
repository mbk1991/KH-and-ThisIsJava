package com.kh.score;

import java.util.Scanner;

public class ScoreFunction {
	private int kor;
	private int eng;
	private int math;

	public int printMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====성적관리 프로그램 v1.0=====");
		System.out.println("1.성적입력 2.성적출력 3.종료");
		int choice = sc.nextInt();
		return choice;
	}

	public void insertScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====성적 입력=====");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();

	}

	public void printScore() {
		System.out.println("=====성적 출력=====");
		int total = kor + eng + math;
		double avg = total / 3;
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		

	}
}

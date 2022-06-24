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
		System.out.println("===== 메인 메뉴=====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println(("3.종료"));
		System.out.print("선택: ");

	}

	static int[] insertScore() {
		Scanner sc = new Scanner(System.in);
		int [] scores = new int[3];
		System.out.println("=====성적 입력=====");
		System.out.print("국어: ");
		scores[0] = sc.nextInt();
		System.out.print("영어: ");
		scores[1] = sc.nextInt();
		System.out.print("수학: ");
		scores[2] = sc.nextInt();
		
		return scores;
	}

	static void printScore(int kor, int eng, int math) {
		System.out.println("=====성적 출력=====");
		int total = kor + eng + math;
		double avg = total / 3;
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}

	static void quit() {
		System.out.println("잘못입력하셨습니다.");
	}

}

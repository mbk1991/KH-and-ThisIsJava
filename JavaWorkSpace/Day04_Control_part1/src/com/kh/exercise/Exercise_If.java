package com.kh.exercise;

import java.util.Scanner;

public class Exercise_If {

	public void exercise1() {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("정수 하나 입력 : ");
			int inputNum = sc.nextInt();

			if (inputNum < 0) {
				System.out.println("양수를 입력하세요.");
			} else if (inputNum % 2 == 1) {
				System.out.println("홀수다.");
			} else {
				System.out.println("짝수다.");
			}
		}

	}

	public void exercise2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------");
		System.out.println("수업 패스 확인");
		System.out.println("----------");
		System.out.println();
		System.out.println("중간고사 점수 입력 : ");
		int midGrade = sc.nextInt();
		if (midGrade > 100) {
			midGrade = 100;
		}

		System.out.println("기말고사 점수 입력 : ");
		int finalGrade = sc.nextInt();
		if (finalGrade > 100) {
			finalGrade = 100;
		}

		System.out.println("과제 점수 입력 : ");
		int homeWorkGrade = sc.nextInt();
		if (homeWorkGrade > 100) {
			homeWorkGrade = 100;
		}

		System.out.println("출석횟수 입력 : ");
		int attend = sc.nextInt();
		if (attend > 20) {
			attend = 20;
		}

		double midTrans = midGrade * 0.2;
		double finalTrans = finalGrade * 0.3;
		double hwTrans = homeWorkGrade * 0.3;

		double totalGrade = midTrans + finalTrans + hwTrans + attend;
		boolean checkAttend = true;
		if ((20 - attend) >= (20 * 0.3)) {
			checkAttend = false;
		}
		String result = "";
		int checkFail = 0;
		if (checkAttend == false) {
			System.out.println("출석체크 Fail");
			result = "Fail";
			checkFail = 1;
		} else if (totalGrade >= 70) {
			System.out.println("출석체크 Pass");
			result = "Pass";
		} else {
			result = "Fail";
			checkFail = 1;
		}

		System.out.println("중간고사 점수(20%) : " + midGrade);
		System.out.println("기말고사 점수(30%) : " + finalGrade);
		System.out.println("과제 점수(30%) : " + homeWorkGrade);
		System.out.println("출석 점수 : " + attend);
		System.out.println("*");
		System.out.println("총점 : " + totalGrade);
		System.out.println(result + "입니다.");
		
		if(checkFail ==1) {
			if(totalGrade <= 70) {
					System.out.println("FAIL[점수미달] : " + (70-totalGrade) + "점 부족");
			if((20-attend) >= 20*0.3) {
					System.out.println("FAIL[출석률미달] : "+ (int)(((20*0.7)+1) - attend) + "일 부족");
				}
			}
		}

	}

}

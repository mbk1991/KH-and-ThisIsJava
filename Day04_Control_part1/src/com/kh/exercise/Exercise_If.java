package com.kh.exercise;

import java.util.Scanner;

public class Exercise_If {

	public void exercise1() {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("���� �ϳ� �Է� : ");
			int inputNum = sc.nextInt();

			if (inputNum < 0) {
				System.out.println("����� �Է��ϼ���.");
			} else if (inputNum % 2 == 1) {
				System.out.println("Ȧ����.");
			} else {
				System.out.println("¦����.");
			}
		}

	}

	public void exercise2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------");
		System.out.println("���� �н� Ȯ��");
		System.out.println("----------");
		System.out.println();
		System.out.println("�߰���� ���� �Է� : ");
		int midGrade = sc.nextInt();
		if (midGrade > 100) {
			midGrade = 100;
		}

		System.out.println("�⸻��� ���� �Է� : ");
		int finalGrade = sc.nextInt();
		if (finalGrade > 100) {
			finalGrade = 100;
		}

		System.out.println("���� ���� �Է� : ");
		int homeWorkGrade = sc.nextInt();
		if (homeWorkGrade > 100) {
			homeWorkGrade = 100;
		}

		System.out.println("�⼮Ƚ�� �Է� : ");
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
			System.out.println("�⼮üũ Fail");
			result = "Fail";
			checkFail = 1;
		} else if (totalGrade >= 70) {
			System.out.println("�⼮üũ Pass");
			result = "Pass";
		} else {
			result = "Fail";
			checkFail = 1;
		}

		System.out.println("�߰���� ����(20%) : " + midGrade);
		System.out.println("�⸻��� ����(30%) : " + finalGrade);
		System.out.println("���� ����(30%) : " + homeWorkGrade);
		System.out.println("�⼮ ���� : " + attend);
		System.out.println("*");
		System.out.println("���� : " + totalGrade);
		System.out.println(result + "�Դϴ�.");
		
		if(checkFail ==1) {
			if(totalGrade <= 70) {
					System.out.println("FAIL[�����̴�] : " + (70-totalGrade) + "�� ����");
			if((20-attend) >= 20*0.3) {
					System.out.println("FAIL[�⼮���̴�] : "+ (int)(((20*0.7)+1) - attend) + "�� ����");
				}
			}
		}

	}

}

package com.kg.program;

import java.util.Scanner;

public class ScoreProgram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int koreanScore = 0;
		int englishScore = 0;
		int mathScore =0;
		int sumScore = 0;
		double averScore = 0.0;
		
		quit:
		while(true) {
			System.out.println("=====���� �޴�=====");
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����: ");
			int input = sc.nextInt();
			System.out.println();
			
	
			switch(input) {
			case 1:
				System.out.println("-----���� �Է�-----");
				System.out.print("�������� :");
				koreanScore = sc.nextInt();
				if(koreanScore > 100) {
					System.out.println("100���� �ʰ��Ͽ� 100������ �Է��մϴ�.");
					koreanScore = 100;
				}
				System.out.print("��������: ");
				englishScore = sc.nextInt();
				if(englishScore > 100) {
					System.out.println("100���� �ʰ��Ͽ� 100������ �Է��մϴ�.");
					englishScore = 100;
				}
				System.out.print("�������� : ");
				mathScore = sc.nextInt();
				if(mathScore > 100) {
					System.out.println("100���� �ʰ��Ͽ� 100������ �Է��մϴ�.");
					mathScore = 100;
				}
				System.out.println("----------------");
				System.out.println();
				
				break;
			case 2:
				
				sumScore = koreanScore + englishScore + mathScore;
				averScore = sumScore / 3.0;
				
				System.out.println("-----���� ���-----");
				System.out.printf("�������� : %d\n",koreanScore);
				System.out.println("�������� : " + englishScore);
				System.out.printf("�������� : %d\n", mathScore);
				System.out.println();
				System.out.printf("���� : %d\n",sumScore);
				System.out.printf("��� : %f\n", averScore);
				System.out.println("----------------");
				System.out.println();
				
						
				break;
			case 3:
				System.out.println("Good Bye~");
				System.out.println();
				break quit;
			default:
				System.out.println("!!\n 1~3���� �޴��� �����ϼ���.\n!!");
				break;
				
			}
		
		}
	}

}

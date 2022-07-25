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
			System.out.println("=====메인 메뉴=====");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.종료");
			System.out.print("선택: ");
			int input = sc.nextInt();
			System.out.println();
			
	
			switch(input) {
			case 1:
				System.out.println("-----성적 입력-----");
				System.out.print("국어점수 :");
				koreanScore = sc.nextInt();
				if(koreanScore > 100) {
					System.out.println("100점을 초과하여 100점으로 입력합니다.");
					koreanScore = 100;
				}
				System.out.print("영어점수: ");
				englishScore = sc.nextInt();
				if(englishScore > 100) {
					System.out.println("100점을 초과하여 100점으로 입력합니다.");
					englishScore = 100;
				}
				System.out.print("수학점수 : ");
				mathScore = sc.nextInt();
				if(mathScore > 100) {
					System.out.println("100점을 초과하여 100점으로 입력합니다.");
					mathScore = 100;
				}
				System.out.println("----------------");
				System.out.println();
				
				break;
			case 2:
				
				sumScore = koreanScore + englishScore + mathScore;
				averScore = sumScore / 3.0;
				
				System.out.println("-----성적 출력-----");
				System.out.printf("국어점수 : %d\n",koreanScore);
				System.out.println("영어점수 : " + englishScore);
				System.out.printf("수학점수 : %d\n", mathScore);
				System.out.println();
				System.out.printf("총점 : %d\n",sumScore);
				System.out.printf("평균 : %f\n", averScore);
				System.out.println("----------------");
				System.out.println();
				
						
				break;
			case 3:
				System.out.println("Good Bye~");
				System.out.println();
				break quit;
			default:
				System.out.println("!!\n 1~3에서 메뉴를 선택하세요.\n!!");
				break;
				
			}
		
		}
	}

}

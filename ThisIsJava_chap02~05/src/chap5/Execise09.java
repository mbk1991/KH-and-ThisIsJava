package chap5;

import java.util.Scanner;

public class Execise09 {
	// 학생들의 점수를 입력받아 최고 점수 및 평균점수를 구하는 프로그램
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				System.out.println("현재 학생수 : "+studentNum);
				scores = new int[studentNum];
				
			}else if(selectNo == 2) {
				System.out.println("점수입력> ");
				for(int i =0; i<studentNum; i++) {
					System.out.print("학생"+(i+1)+"점수 입력> ");
					scores[i] = sc.nextInt();
				}
				
			}else if(selectNo == 3) {
				System.out.println("점수리스트");
				for(int i=0; i<studentNum; i++) {
					System.out.printf("학생%d : %d\n", i+1, scores[i]);
				}
		
			}else if(selectNo == 4) {
				int sum = 0;
				double avg =0.0;
				int max = 0;
				for(int i=0; i<studentNum; i++) {
					sum += scores[i];
				}
				for(int i =0; i<studentNum-1; i++) {
					if(scores[i]>=scores[i+1]) max = scores[i];
					else max = scores[i+1];
				}
				avg = (double) sum/studentNum;
				System.out.println("최고 점수 : " + max );
				System.out.println("평균 점수 : " + avg);
				
			}else if(selectNo == 5) {
				run = false;
			}
	}
		System.out.println("프로그램 종료");
  }
}

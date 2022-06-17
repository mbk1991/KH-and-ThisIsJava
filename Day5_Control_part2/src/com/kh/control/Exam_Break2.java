package com.kh.control;

import java.util.Scanner;

public class Exam_Break2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		종료:
		while(true) {
			System.out.println("-----");
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.println("메뉴 번호를 입력하세요 :");
			System.out.println("-----");
	
			int select = sc.nextInt();
			switch (select) {
			case 1: System.out.println("입력메뉴입니다."); break;
			case 2: System.out.println("수정메뉴입니다."); break;
			case 3: System.out.println("조회메뉴입니다."); break;
			case 4: System.out.println("삭제메뉴입니다."); break;
			case 0: System.out.println("종료메뉴입니다."); break 종료;
			default : System.out.println(); break;
			
   }
  }
 }
}


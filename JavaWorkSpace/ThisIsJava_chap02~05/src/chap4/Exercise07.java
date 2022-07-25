package chap4;

import java.util.Scanner;

public class Exercise07 {
	//while문과 Scanner를 이용, 예금,출금,조회,종료 기능을 제공하는 코드 작성
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----");
			System.out.println("1.예금| 2.출금| 3.잔고| 4.종료");
			System.out.println("-----");
			System.out.print("선택>");
			int input = sc.nextInt();
			switch(input) {
			case 1: 
				System.out.println("예금 메뉴");
				System.out.print("얼마를 예금할까요?:");
				int deposit = sc.nextInt();
				balance += deposit;
				break;
			case 2:
				System.out.println("출금 메뉴");
				System.out.print("얼마를 출금할까요?:");
				int withraw = sc.nextInt();
				balance -= withraw;
				break;
			case 3:
				System.out.println("잔고 확인 메뉴");
				System.out.println("잔고: " + balance);
			case 4:
				run = false;
				break;
			default : System.out.println("1~4사이의 정수를 입력하세요.");
			}
			
		}
		System.out.println("프로그램 종료");
	}
}

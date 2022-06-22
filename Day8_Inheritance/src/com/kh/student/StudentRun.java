package com.kh.student;

public class StudentRun {
	public static void main(String[] args) {
		
		ManageStudent mStd = new ManageStudent();
		end: 
			while (true) {
				int choice = mStd.showMenu();
				switch (choice) {
					case 1:
						System.out.println("정보 입력");
						mStd.insertInfomation();
						break;
					case 2:
						System.out.println("정보 출력");
						mStd.printResult();
						break;
					case 3:
						System.out.println("프로그램 종료");
						break end;
					default:
						System.out.println("잘못 입력하셨습니다.");
						break;
			}
		}
	}
}

package com.kh.student;

public class StudentRun {
	public static void main(String[] args) {
		ManageStudent mStd = new ManageStudent();
		��: 
		while (true) {
			int input = mStd.showMainMenu();
			switch (input) {
				case 1:
					mStd.inserInfo();
					break;
				case 2:
					mStd.printInfo();
					break;
				case 3:
					System.out.println("Good Bye");
					break ��;
				default:
					System.out.println("�߸��Է��ϼ̽��ϴ�.");

			}
		}
	}
}

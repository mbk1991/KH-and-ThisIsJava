package com.kh.student;

public class StudentRun {
	public static void main(String[] args) {
		
		ManageStudent mStd = new ManageStudent();
		end: 
			while (true) {
				int choice = mStd.showMenu();
				switch (choice) {
					case 1:
						System.out.println("���� �Է�");
						mStd.insertInfomation();
						break;
					case 2:
						System.out.println("���� ���");
						mStd.printResult();
						break;
					case 3:
						System.out.println("���α׷� ����");
						break end;
					default:
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						break;
			}
		}
	}
}

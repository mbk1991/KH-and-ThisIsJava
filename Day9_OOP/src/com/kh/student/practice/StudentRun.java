package com.kh.student.practice;

import java.util.Scanner;

public class StudentRun {
	public static void main(String[] args) {
		StudentConsole sConsole = new StudentConsole();
		
		EXIT:
		while(true) {
			int input = sConsole.printMenu();
			switch(input) {
			case 1:
				sConsole.insertInfo();
				break;
			case 2:
				sConsole.printInfo();
				break;
			case 3:
				System.out.println("Good Bye~");
				break EXIT;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	
		
	}
}

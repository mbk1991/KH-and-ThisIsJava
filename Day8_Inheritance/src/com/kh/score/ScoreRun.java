package com.kh.score;

import java.util.Scanner;

public class ScoreRun {
	public static void main(String[] args) {

		ScoreFunction sFunc = new ScoreFunction();

		quit: while (true) {

			int choice = sFunc.printMainMenu();

			switch (choice) {
			case 1:
				sFunc.insertScore();
				break;
			case 2:
				sFunc.printScore();
				break;
			case 3:
				System.out.println("GoodBye~");
				break quit;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}
}

package control.exercise.game;

import java.util.Scanner;

public class PlayerUser extends Player {
	int win;
	String name = "유져";

	@Override
	String decisionBet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보를 입력하세요.");
		System.out.print("1:가위 , 2:바위, 3:보");
		int input = sc.nextInt();
		String bet = "";
		
		switch (input) {
		case 1:
			bet = "가위";
			break;
		case 2:
			bet = "바위";
			break;
		case 3:
			bet = "보";
			break;
		}
		return bet;
	}

	@Override
	int scoreWin() {
		win ++;
		return win;
	}

}

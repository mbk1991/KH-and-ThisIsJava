package control.exercise.game;

import java.util.Scanner;

public class PlayerUser extends Player {
	int win;
	String name = "����";

	@Override
	String decisionBet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������ �Է��ϼ���.");
		System.out.print("1:���� , 2:����, 3:��");
		int input = sc.nextInt();
		String bet = "";
		
		switch (input) {
		case 1:
			bet = "����";
			break;
		case 2:
			bet = "����";
			break;
		case 3:
			bet = "��";
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

package control.exercise.game;

import java.util.Random;

public class PlayerCom extends Player {
	int win;
	String name = "컴퓨터";

	@Override
	String decisionBet() {
		Random rand = new Random();
		int com = rand.nextInt(3) + 1;
		String bet = "";

		switch (com) {
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
		win++;
		return win;
	}

}

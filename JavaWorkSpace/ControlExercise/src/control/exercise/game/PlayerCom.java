package control.exercise.game;

import java.util.Random;

public class PlayerCom extends Player {
	int win;
	String name = "��ǻ��";

	@Override
	String decisionBet() {
		Random rand = new Random();
		int com = rand.nextInt(3) + 1;
		String bet = "";

		switch (com) {
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
		win++;
		return win;
	}

}

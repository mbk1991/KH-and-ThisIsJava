package game.rockpaperscissors;

import java.util.Random;

public class Com extends Player{

	@Override
	public String rockPaperScissors() {
		Random rand = new Random();
		int random = rand.nextInt(3)+1;
		String comChoice = "";
		
		switch(random) {
		case 1 :
			comChoice = "가위";
			break;
		case 2 :
			comChoice = "바위";
			break;
		case 3 :
			comChoice = "보";
			break;
		}
		
		return comChoice;
	}

}

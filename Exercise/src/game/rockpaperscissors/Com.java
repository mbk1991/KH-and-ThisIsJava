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
			comChoice = "����";
			break;
		case 2 :
			comChoice = "����";
			break;
		case 3 :
			comChoice = "��";
			break;
		}
		
		return comChoice;
	}

}

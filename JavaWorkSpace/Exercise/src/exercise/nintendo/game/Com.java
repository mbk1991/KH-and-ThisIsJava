package exercise.nintendo.game;

import java.util.Random;

public class Com implements Player {
	public String name = "COM";
	Random rand = null;
	public int diceSum = 0;

	@Override
	public int choice(int gamePointerNumber) {
		Random rand = new Random();
		
		if ((((gamePointerNumber + 1)) - 2) % 4 == 0) {
			return 1;
		} else if((((gamePointerNumber + 2)) - 2) % 4 == 0) {
			return 2;
		} else if((((gamePointerNumber + 3)) - 2) % 4 == 0) {
			return 3;
		} else {
			return rand.nextInt(3)+1;
		}
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public int dice() {
		rand = new Random();
		return rand.nextInt(6)+1;
	}

}

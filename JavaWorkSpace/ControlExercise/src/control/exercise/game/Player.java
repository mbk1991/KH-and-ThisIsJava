package control.exercise.game;

public abstract class Player {
	private int win;
	private int bet;
	String name;
	
	
	abstract String decisionBet();
	abstract int scoreWin();
	

}

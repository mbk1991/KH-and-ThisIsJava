package exercise.nintendo.game;

public class RunBeskinGame {
	public static void main(String[] args) {
		Player user = new User();
		Player com = new Com();
		
		BeskinGame bg = new BeskinGame();
		System.out.println("����Ų��� 31 ������ �����մϴ�.");
		if(bg.setOrder() ==1) {
			bg.baskinGame(user, com);
		}else {
			bg.baskinGame(com, user);
		}
	}
}

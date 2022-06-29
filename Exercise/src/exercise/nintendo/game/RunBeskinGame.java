package exercise.nintendo.game;

public class RunBeskinGame {
	public static void main(String[] args) {
		Player user = new User();
		Player com = new Com();
		
		BeskinGame bg = new BeskinGame();
		System.out.println("베스킨라빈스 31 게임을 시작합니다.");
		if(bg.setOrder() ==1) {
			bg.baskinGame(user, com);
		}else {
			bg.baskinGame(com, user);
		}
	}
}

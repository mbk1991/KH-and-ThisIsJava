package control.exercise.game;

public class Game {
	public static void main(String[] args) {
		PlayerCom com = new PlayerCom();
		PlayerUser user = new PlayerUser();

		System.out.println("=====5판 3선승제 가위바위보=====");
		for (int i = 0; i < 5; i++) {
			System.out.println(user.name+"이"+user.decisionBet()+"을/를 내었습니다.");
			System.out.println(com.name+"이"+com.decisionBet()+"을/를 내었습니다.");
		
		}
	}
	
	public static Player winner(Player user, Player com) {
		
//		(비기는 경우)
//		(가위 바위)
//		(가위 보)
//		(바위 보)
		String userBet = user.decisionBet();
		String comBet = com.decisionBet();
		
		if(userBet.equals("가위")) {
			
		}
		
	
		
		return null;
		
	}
	
}

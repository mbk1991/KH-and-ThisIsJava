package control.exercise.game;

public class Game {
	public static void main(String[] args) {
		PlayerCom com = new PlayerCom();
		PlayerUser user = new PlayerUser();

		System.out.println("=====5�� 3������ ����������=====");
		for (int i = 0; i < 5; i++) {
			System.out.println(user.name+"��"+user.decisionBet()+"��/�� �������ϴ�.");
			System.out.println(com.name+"��"+com.decisionBet()+"��/�� �������ϴ�.");
		
		}
	}
	
	public static Player winner(Player user, Player com) {
		
//		(���� ���)
//		(���� ����)
//		(���� ��)
//		(���� ��)
		String userBet = user.decisionBet();
		String comBet = com.decisionBet();
		
		if(userBet.equals("����")) {
			
		}
		
	
		
		return null;
		
	}
	
}

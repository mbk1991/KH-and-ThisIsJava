package game.rockpaperscissors;

public class Run {

	public void play() {
		Player user = new User();
		Player com = new Com();
		
		while(true) {
			System.out.println("=====���������� ����=====");
			
			String comChoice = com.rockPaperScissors();
			String userChoice = user.rockPaperScissors();
			
			String battle = userChoice + " VS " + comChoice;
			
			System.out.println("User: " + battle + " :Com");
			
			if(userChoice.equals(comChoice)) {
				//���º�
				System.out.println("���º�!");
			}else {
				switch(userChoice) {
				case "����":
					if(comChoice.equals("��")) {
						//user win
						System.out.println("User Win!");
						user.point++;
					}else {
						//com win
						System.out.println("Com Win!");
						com.point++;
					}
					break;
				case "����":
					if(comChoice.equals("����")) {
						//user win
						System.out.println("User Win!");
						user.point++;
					}else {
						//com win
						System.out.println("Com Win!");
						com.point++;
					}
					break;
				case "��":
					if(comChoice.equals("����")) {
						//user win
						System.out.println("User Win!");
						user.point++;
					}else {
						//com win
						System.out.println("Com Win!");
						com.point++;
					}
					break;
				}
			}
			System.out.println("User's Point  " + user.point + " : " + com.point + "  Com's Point");
			System.out.println();
		}
		
	}
}

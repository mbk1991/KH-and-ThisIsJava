package game.rockpaperscissors;

public class Run {

	public void play() {
		Player user = new User();
		Player com = new Com();
		
		while(true) {
			System.out.println("=====가위바위보 게임=====");
			
			String comChoice = com.rockPaperScissors();
			String userChoice = user.rockPaperScissors();
			
			String battle = userChoice + " VS " + comChoice;
			
			System.out.println("User: " + battle + " :Com");
			
			if(userChoice.equals(comChoice)) {
				//무승부
				System.out.println("무승부!");
			}else {
				switch(userChoice) {
				case "가위":
					if(comChoice.equals("보")) {
						//user win
						System.out.println("User Win!");
						user.point++;
					}else {
						//com win
						System.out.println("Com Win!");
						com.point++;
					}
					break;
				case "바위":
					if(comChoice.equals("가위")) {
						//user win
						System.out.println("User Win!");
						user.point++;
					}else {
						//com win
						System.out.println("Com Win!");
						com.point++;
					}
					break;
				case "보":
					if(comChoice.equals("바위")) {
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

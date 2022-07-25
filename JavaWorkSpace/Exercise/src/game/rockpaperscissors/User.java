package game.rockpaperscissors;

import java.util.Scanner;

public class User extends Player{

	@Override
	public String rockPaperScissors() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1) 바위(2) 보(3) 입력하세요 > ");
		int input = sc.nextInt();
		String userChoice = "";
		
		switch(input) {
		case 1 : 
			userChoice = "가위";
			break;
		case 2 : 
			userChoice = "바위";
			break;
		case 3 :
			userChoice = "보";
			break;
		default :
			System.out.println("잘못입력하셨습니다. 패배!");
			break;
		}
				
		return userChoice;
	}

}

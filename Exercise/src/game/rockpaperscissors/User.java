package game.rockpaperscissors;

import java.util.Scanner;

public class User extends Player{

	@Override
	public String rockPaperScissors() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����(1) ����(2) ��(3) �Է��ϼ��� > ");
		int input = sc.nextInt();
		String userChoice = "";
		
		switch(input) {
		case 1 : 
			userChoice = "����";
			break;
		case 2 : 
			userChoice = "����";
			break;
		case 3 :
			userChoice = "��";
			break;
		default :
			System.out.println("�߸��Է��ϼ̽��ϴ�. �й�!");
			break;
		}
				
		return userChoice;
	}

}

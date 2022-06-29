package exercise.nintendo.game;

import java.util.Scanner;

public class User implements Player {
	String name = "USER";

	@Override
	public int choice(int gamePointerNumber) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이 선택 >");
		int choice = sc.nextInt();
		
		return choice;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}

package exercise.nintendo.game;

import java.util.Random;
import java.util.Scanner;

public class User implements Player {
	public String name = "USER";
	private int gameChip = 0;
	Random rand = null;
	public int diceSum = 0;

	public User() {
	}

	public User(int gameChip) {
		this.gameChip = gameChip;
	}

	@Override
	public int choice(int gamePointerNumber) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 ���� ���� >");
		int choice = sc.nextInt();

		return choice;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int dice() {
		rand = new Random();
		Scanner sc = new Scanner(System.in);
		String start = "";
		
		while(true) {
		System.out.println("�ֻ����� �����ϴ�!!  (�ƹ� Ű�� �����ÿ�)");
		start = sc.nextLine();
		if(start.length()>=1) {
			break;
		}
				}
		return rand.nextInt(6) + 1;
	}

	public void payGameChip() {
		System.out.println("1������ �����մϴ�.");
		this.gameChip--;
	}
	public void winGameChip() {
		System.out.println("2���� ȹ��!!");
		this.gameChip +=2;
	}
	public void checkGameChip() {
		System.out.println("��User's GameChip :" +this.gameChip+"����");
	}
	public int getGameChip() {
		return gameChip;
	}
	public void setGameChip(int gameChip) {
		this.gameChip = gameChip;
	}
}

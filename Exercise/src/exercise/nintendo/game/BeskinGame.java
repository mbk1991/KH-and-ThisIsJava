package exercise.nintendo.game;

import java.util.Random;
import java.util.Scanner;

public class BeskinGame {
	int gamePointerNumber = 0;
	public static final int GOAL_NUMBER = 31;
	public static boolean gamePlay = true;

	public void RunBeskin(User user) {
//		Player user = new User();
		Player com = new Com();
		int winUser = 0;

		System.out.println("����Ų��� 31 ������ �����մϴ�.");
		if (setOrder() == 1) {
			winUser = baskinGame(user, com);
			if(winUser == 1) user.winGameChip();
		} else {
			winUser = baskinGame(com, user);
			if(winUser ==1) user.winGameChip();
		}
	}

	public int baskinGame(Player p1, Player p2) {
		int winUser = 0;
		while (gamePlay) {
			int choice1 = p1.choice(gamePointerNumber);
			winUser = gameProgress(p1, choice1);

			int choice2 = p2.choice(gamePointerNumber);
			winUser = gameProgress(p2, choice2);
		}
		return winUser;
	}

	public int setOrder() {
		System.out.println("�������� ������ ���մϴ�.");
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ո�(1) �޸�(2) >");
		int choice = sc.nextInt();
		int coinSide = rand.nextInt(2) + 1;
		if (coinSide == 1) {
			System.out.println("������ �ո�!");
		} else {
			System.out.println("������ �޸�!");
		}
		if (choice == coinSide) {
			System.out.println("������ϴ�. User ���� �����մϴ�.");
			return 1;
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�. Com ���� �����մϴ�.");
			return 2;
		}
	}

	public int gameProgress(Player p, int choice) {
		
		for (int i = 1; i <= choice; i++) {
			gamePointerNumber++;
			System.out.println(p.getName() + " : " + gamePointerNumber + "!!");
			try {
				Thread.sleep(400);
				if (gamePointerNumber == GOAL_NUMBER) {
					System.out.println("31�� �ҷ����ϴ�.");
					System.out.println(p.getName() + "�� �й�!");
					
					if(p instanceof Com) {
						System.out.println("User�� �¸�!");
						gamePlay = false;
						return 1;
//						((User)p).winGameChip();
					}
					
					
					gamePlay = false;
					return 0;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}

package exercise.nintendo.game;

import java.util.Random;
import java.util.Scanner;

public class BeskinGame {
	int gamePointerNumber = 0;
	public static final int GOAL_NUMBER = 31;
	public static boolean gamePlay = true;

	public void baskinGame(Player p1, Player p2) {
		while (gamePlay) {
			int choice1 = p1.choice(gamePointerNumber);
			gameProgress(p1, choice1);

			int choice2 = p2.choice(gamePointerNumber);
			gameProgress(p2, choice2);
		}

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

	public void gameProgress(Player p, int choice) {

		for (int i = 1; i <= choice; i++) {
			gamePointerNumber++;
			System.out.println(p.getName() + " : " + gamePointerNumber + "!!");
			try {
				Thread.sleep(400);
				if (gamePointerNumber == GOAL_NUMBER) {
					System.out.println("31�� �ҷ����ϴ�.");
					System.out.println(p.getName() + "�� �й�!");
					gamePlay = false;
					return;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

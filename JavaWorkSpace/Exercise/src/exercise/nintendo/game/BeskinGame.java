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

		System.out.println("베스킨라빈스 31 게임을 시작합니다.");
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
		System.out.println("동전으로 순서를 정합니다.");
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("선택 앞면(1) 뒷면(2) >");
		int choice = sc.nextInt();
		int coinSide = rand.nextInt(2) + 1;
		if (coinSide == 1) {
			System.out.println("동전은 앞면!");
		} else {
			System.out.println("동전은 뒷면!");
		}
		if (choice == coinSide) {
			System.out.println("맞췄습니다. User 먼저 진행합니다.");
			return 1;
		} else {
			System.out.println("틀렸습니다. Com 먼저 진행합니다.");
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
					System.out.println("31을 불렀습니다.");
					System.out.println(p.getName() + "의 패배!");
					
					if(p instanceof Com) {
						System.out.println("User의 승리!");
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

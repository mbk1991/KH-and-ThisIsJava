package exercise.nintendo.game;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static int p1DiceSum = 0;
	public static int p2DiceSum = 0;

	
	
	
	public void RunDiceGame(User user) {
//		User user = new User();
		Com com = new Com();
		
		if(setOrder() == 1) {
			diceGame(user,com);
		}else {
			diceGame(com,user);
		}
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
	
	
	
	public void diceGame(Player p1, Player p2) {

		for (int i = 0; i < 2; i++) {
			System.out.println("주사위 게임을 시작합니다.");
			Random rand = new Random();

			int p1Dice = p1.dice();
			System.out.println(p1.getName() + "이 주사위를 던집니다.");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			System.out.println(p1Dice + "!!");
			p1DiceSum += p1Dice;
			System.out.println(p1.getName() + "의 "+(i+1)+"회차 눈금 합계 : " + p1DiceSum);

			/////

			int p2Dice = p2.dice();
			System.out.println(p2.getName() + "이 주사위를 던집니다.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(p2Dice + "!!");
			p2DiceSum += p2Dice;
			System.out.println(p2.getName() + "의 "+(i+1)+"회차 눈금 합계 : " + p2DiceSum);

		}
		
		if(p1DiceSum > p2DiceSum) {
			System.out.println(p1.getName() + "의 승리");
			if(p1 instanceof User) {
				((User) p1).winGameChip();
			}
		}else if(p1DiceSum == p2DiceSum){
			System.out.println("무승부!!");
		}else {
			System.out.println(p2.getName() +"의 승리");
			if(p2 instanceof User) {
				((User)p2).winGameChip();
			}
		}
	}
}

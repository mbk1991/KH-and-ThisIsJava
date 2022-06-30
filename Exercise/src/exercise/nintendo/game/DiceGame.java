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
	
	
	
	public void diceGame(Player p1, Player p2) {

		for (int i = 0; i < 2; i++) {
			System.out.println("�ֻ��� ������ �����մϴ�.");
			Random rand = new Random();

			int p1Dice = p1.dice();
			System.out.println(p1.getName() + "�� �ֻ����� �����ϴ�.");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			System.out.println(p1Dice + "!!");
			p1DiceSum += p1Dice;
			System.out.println(p1.getName() + "�� "+(i+1)+"ȸ�� ���� �հ� : " + p1DiceSum);

			/////

			int p2Dice = p2.dice();
			System.out.println(p2.getName() + "�� �ֻ����� �����ϴ�.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(p2Dice + "!!");
			p2DiceSum += p2Dice;
			System.out.println(p2.getName() + "�� "+(i+1)+"ȸ�� ���� �հ� : " + p2DiceSum);

		}
		
		if(p1DiceSum > p2DiceSum) {
			System.out.println(p1.getName() + "�� �¸�");
			if(p1 instanceof User) {
				((User) p1).winGameChip();
			}
		}else if(p1DiceSum == p2DiceSum){
			System.out.println("���º�!!");
		}else {
			System.out.println(p2.getName() +"�� �¸�");
			if(p2 instanceof User) {
				((User)p2).winGameChip();
			}
		}
	}
}

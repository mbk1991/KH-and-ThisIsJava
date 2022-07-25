package exercise.nintendo.game;

import java.util.Random;
import java.util.Scanner;

public class NintendoGameMachine {
	public static boolean power = false;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BeskinGame bg = new BeskinGame();
		DiceGame dg = new DiceGame();
		
		System.out.println("���ٵ� ������ �ѽðڽ��ϱ�? (y) >");
		char onPower = sc.next().charAt(0);
		while(onPower != 'y') {
			System.out.println("������ �Ѿ���");
			onPower = sc.next().charAt(0);
		}
		power = true;
		
		
		System.out.println("======���ٵ� ���ӱ�======");
		System.out.println("User 5������ ������ ����");
		User user = new User(5);
		user.checkGameChip();
		
		System.out.println("\n �ش��ٵ� ���ӱ��� ���");
		System.out.println(" ���� ����� 1���� �ʿ�");
		System.out.println("���� �¸� �� 2���� ȹ��");
		System.out.println();
		
		while(power) {
			System.out.println("<<���Ӽ���>>");
			System.out.println("1. �ֻ��� ���� 2.����Ų31���� 3.���ӱ� ����\n");
			user.checkGameChip();
			
			if(user.getGameChip() <= 0) {
				System.out.println("����Ĩ�� �����մϴ�. �󸶸� �����Ͻðڽ��ϱ�.");
				int gameChip;
				user.setGameChip(sc.nextInt());
				user.checkGameChip();
			}
			

			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :   // �ֻ�������
				user.payGameChip();
				user.checkGameChip();
				dg.RunDiceGame(user);
				break;
			case 2 :  // ����Ų31����
				user.payGameChip();
				user.checkGameChip();
				bg.RunBeskin(user);
				
				break;
			case 3 :
				System.out.println("���ٵ� ���ӱ� ����");
				power = false;
				break;
			default :
				System.out.println("1~2 �� �����ϼ���.");
			
			}
		}
	}
}

package exercise.nintendo.game;

import java.util.Random;
import java.util.Scanner;

public class NintendoGameMachine {
	public static boolean power = false;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BeskinGame bg = new BeskinGame();
		DiceGame dg = new DiceGame();
		
		System.out.println("닌텐도 전원을 켜시겠습니까? (y) >");
		char onPower = sc.next().charAt(0);
		while(onPower != 'y') {
			System.out.println("전원을 켜야함");
			onPower = sc.next().charAt(0);
		}
		power = true;
		
		
		System.out.println("======닌텐도 게임기======");
		System.out.println("User 5코인을 가지고 입장");
		User user = new User(5);
		user.checkGameChip();
		
		System.out.println("\n ※닌텐도 게임기의 룰※");
		System.out.println(" 게임 실행시 1코인 필요");
		System.out.println("게임 승리 시 2코인 획득");
		System.out.println();
		
		while(power) {
			System.out.println("<<게임선택>>");
			System.out.println("1. 주사위 게임 2.베스킨31게임 3.게임기 종료\n");
			user.checkGameChip();
			
			if(user.getGameChip() <= 0) {
				System.out.println("게임칩이 부족합니다. 얼마를 충전하시겠습니까.");
				int gameChip;
				user.setGameChip(sc.nextInt());
				user.checkGameChip();
			}
			

			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :   // 주사위게임
				user.payGameChip();
				user.checkGameChip();
				dg.RunDiceGame(user);
				break;
			case 2 :  // 베스킨31게임
				user.payGameChip();
				user.checkGameChip();
				bg.RunBeskin(user);
				
				break;
			case 3 :
				System.out.println("닌텐도 게임기 종료");
				power = false;
				break;
			default :
				System.out.println("1~2 중 선택하세요.");
			
			}
		}
	}
}

package com.kh.nintendo;

import java.util.Scanner;

public class GameMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player player = null;
		while(true) {
			System.out.print("����: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				player = new Player();
				player.setName("�Ͽ���");
				player.setMoney(1000);
				break;
				
			case 2:
				System.out.print("�󸶸� �����Ͻðڽ��ϱ�?");
				int bettingMoney = sc.nextInt();
				if(bettingMoney > player.getMoney()) {
					
				}
				break;
				
			}
		}
	}
}

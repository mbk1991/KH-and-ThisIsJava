package com.kh.exercise;

import java.util.Scanner;

public class Motel {

	boolean[] rooms = new boolean[10];

	public int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====���� ���� ���α׷� v1.0=====");
		System.out.println("1.�Խ� 2.��� 3.�溸�� 4.����\n");
		int choice = sc.nextInt();
		return choice;
	}

	public void checkIn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �濡 �Խ��ϰڽ��ϱ�? > ");
		int roomNum = sc.nextInt();
		if (rooms[roomNum - 1] == true) {
			System.out.println(roomNum + "�� ���� �̿����Դϴ�.");
		} else {
			System.out.println(roomNum + "�� �濡 �Խ��Ͽ����ϴ�.");
		}

		rooms[roomNum - 1] = true;
	}

	public void checkOut() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �濡�� ����ϰڽ��ϱ�? >");
		int roomNum = sc.nextInt();
		if (rooms[roomNum - 1] == false) {
			System.out.println(roomNum + "�� ���� �̹� �� ���Դϴ�.");
		} else {
			System.out.println(roomNum + "�濡�� ����Ͽ����ϴ�.");
		}
		rooms[roomNum - 1] = false;
	}

	public void roomStatus() {
//		for (int i = 0; i < rooms.length; i++) {
//			if (rooms[i] == true) {
//				System.out.println((i + 1) + "�� ���� ���� �մ��� �ֽ��ϴ�.");
//			} else {
//				System.out.println((i + 1) + "�� ���� ���� ��� �ֽ��ϴ�.");
//			}
//		}
		System.out.println("=====���� ����=====");
		System.out.println("\n�� : �̿���, �� : �� ��");
		for (int i = 0; i < rooms.length; i++) {
			System.out.print((i + 1) + "room\t");
		}
		System.out.println();
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] == true) {
				System.out.print("��\t");
			} else {
				System.out.print("��\t");
			}
		}
		System.out.println();
	}
}

package com.kh.exercise;

import java.util.Scanner;

public class Motel {

	boolean[] rooms = new boolean[10];

	public int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====모텔 관리 프로그램 v1.0=====");
		System.out.println("1.입실 2.퇴실 3.방보기 4.종료\n");
		int choice = sc.nextInt();
		return choice;
	}

	public void checkIn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번 방에 입실하겠습니까? > ");
		int roomNum = sc.nextInt();
		if (rooms[roomNum - 1] == true) {
			System.out.println(roomNum + "번 방은 이용중입니다.");
		} else {
			System.out.println(roomNum + "번 방에 입실하였습니다.");
		}

		rooms[roomNum - 1] = true;
	}

	public void checkOut() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번 방에서 퇴실하겠습니까? >");
		int roomNum = sc.nextInt();
		if (rooms[roomNum - 1] == false) {
			System.out.println(roomNum + "번 방은 이미 빈 방입니다.");
		} else {
			System.out.println(roomNum + "방에서 퇴실하였습니다.");
		}
		rooms[roomNum - 1] = false;
	}

	public void roomStatus() {
//		for (int i = 0; i < rooms.length; i++) {
//			if (rooms[i] == true) {
//				System.out.println((i + 1) + "번 방은 현재 손님이 있습니다.");
//			} else {
//				System.out.println((i + 1) + "번 방은 현재 비어 있습니다.");
//			}
//		}
		System.out.println("=====객실 상태=====");
		System.out.println("\n■ : 이용중, □ : 빈 방");
		for (int i = 0; i < rooms.length; i++) {
			System.out.print((i + 1) + "room\t");
		}
		System.out.println();
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] == true) {
				System.out.print("■\t");
			} else {
				System.out.print("□\t");
			}
		}
		System.out.println();
	}
}

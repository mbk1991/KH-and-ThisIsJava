package com.kh.run;

import com.kh.exercise.Motel;

public class RunMotel {
	public static void main(String[] args) {
		Motel motel = new Motel();
		
		exit:
			while(true) {
				int choice = motel.menu();
				switch(choice) {
				case 1:
					motel.checkIn();
					break;
				case 2:
					motel.checkOut();
					break;
				case 3:
					motel.roomStatus();
					break;
				case 4:
					System.out.println("모텔프로그램을 종료합니다.");
					break exit;
				default:
					System.out.println("1~4 중 입력하세요");
					break ;
		}			
	}
	}
}

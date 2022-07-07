package com.kh.music.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.music.model.vo.Music;

public class MusicView {

	Music music = null;

	public char showMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====뮤직 프로그램=====");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.println("s. save");
		System.out.println("l. load");
		System.out.print("메뉴선택 > ");
		return sc.next().charAt(0);
	}

	public Music addSong(int i) {
		Scanner sc = new Scanner(System.in);
		if (i == 1) {
			System.out.println("===마지막 위치에 곡 추가===");
		} else {
			System.out.println("===첫 위치에 곡 추가===");
		}
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		return new Music(title, singer);
	}

	public void showList(List<Music> mList) {
		System.out.println("=====전체 곡 리스트=====");
		for (int i = 0; i < mList.size(); i++) {
			System.out.println(mList.get(i).toString());
			System.out.println();
		}
	}

	public void showOneSong(Music music) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====검색한 곡=====");
		System.out.print(music.toString());
	}

	public String showSearchByTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====특정 곡 검색=====");
		System.out.print("검색할 곡 > ");
		return sc.nextLine();
	}

	public void updateSong(Music music) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====곡 정보 수정=====");
		System.out.print("제목 수정 > ");
		music.setSong(sc.nextLine());
		System.out.print("가수이름 수정 > ");
		music.setSinger(sc.next());
	}

}

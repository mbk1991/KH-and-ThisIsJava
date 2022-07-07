package com.kh.music.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.music.model.vo.Music;

public class MusicView {

	Music music = null;

	public char showMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=====���� ���α׷�=====");
		System.out.println("1. ������ ��ġ�� �� �߰�");
		System.out.println("2. ù ��ġ�� �� �߰�");
		System.out.println("3. ��ü �� ��� ���");
		System.out.println("4. Ư�� �� �˻�");
		System.out.println("5. Ư�� �� ����");
		System.out.println("6. Ư�� �� ���� ����");
		System.out.println("7. ��� �������� ����");
		System.out.println("8. ������ �������� ����");
		System.out.println("0. ����");
		System.out.println("s. save");
		System.out.println("l. load");
		System.out.print("�޴����� > ");
		return sc.next().charAt(0);
	}

	public Music addSong(int i) {
		Scanner sc = new Scanner(System.in);
		if (i == 1) {
			System.out.println("===������ ��ġ�� �� �߰�===");
		} else {
			System.out.println("===ù ��ġ�� �� �߰�===");
		}
		System.out.print("��� : ");
		String title = sc.nextLine();
		System.out.print("������ : ");
		String singer = sc.nextLine();
		return new Music(title, singer);
	}

	public void showList(List<Music> mList) {
		System.out.println("=====��ü �� ����Ʈ=====");
		for (int i = 0; i < mList.size(); i++) {
			System.out.println(mList.get(i).toString());
			System.out.println();
		}
	}

	public void showOneSong(Music music) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====�˻��� ��=====");
		System.out.print(music.toString());
	}

	public String showSearchByTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====Ư�� �� �˻�=====");
		System.out.print("�˻��� �� > ");
		return sc.nextLine();
	}

	public void updateSong(Music music) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====�� ���� ����=====");
		System.out.print("���� ���� > ");
		music.setSong(sc.nextLine());
		System.out.print("�����̸� ���� > ");
		music.setSinger(sc.next());
	}

}

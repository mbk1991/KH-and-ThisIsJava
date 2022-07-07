package com.kh.music.run;

import java.util.ArrayList;

import com.kh.music.controller.MusicController;
import com.kh.music.model.vo.Music;
import com.kh.music.view.MusicView;

public class Run {
	public static void main(String[] args) {
		MusicView mView = new MusicView();
		MusicController mController = new MusicController();
		Music music = null;
//		ArrayList<Music> mList = null;
		
		EXIT:
		while(true) {
			switch(mView.showMainMenu()) {
			case '1': 
				music = mView.addSong(1);
				mController.createAtLast(music);
				break;
			case '2':
				music = mView.addSong(2);
				mController.createAtFirst(music);
				break;
			case '3':
				mView.showList(mController.getMList());
				break;
			case '4':
				try {
				mView.showOneSong(mController.searchByTitle(mView.showSearchByTitle()));
				} catch (NullPointerException e) {
					mController.displayError("�˻� �Ұ�");
				}
				break;
			case '5':
				try {
					mController.deleteByTitle(mController.searchByTitle(mView.showSearchByTitle()));
					mController.displaySuccess("���� �Ϸ�");
					
				} catch (Exception e) {
					mController.displayError("�˻� �Ұ�");
					}
				break;
			case '6':
				try {
					mView.updateSong((mController.searchByTitle(mView.showSearchByTitle())));
					mController.displaySuccess("���� �Ϸ�");
					
				} catch (Exception e) {
					mController.displayError("�˻� �Ұ�");
				}
				break;
			case '7':
				mView.showList(mController.sortAscendingByTitle(mController.copyMList()));
				mController.displaySuccess("�뷡���� �������� ���� ���");
				break;
			case '8':
				mView.showList(mController.sortDescendingBySinger(mController.copyMList()));
				mController.displaySuccess("�����̸� �������� ���� ���");
				break;
			case '0':
				break EXIT;
			case 's':
				mController.saveFile(mController.getMList());
				mController.displaySuccess("���� ����");
				break;
			case 'l':
				mController.loadFile();
				
				break;
			
			}
		}
	}
}

package com.kh.music.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.music.file.MusicFile;
import com.kh.music.model.vo.DescSinger;
import com.kh.music.model.vo.Music;

public class MusicController {
	ArrayList<Music> mList = null;

	public MusicController() {
		mList = new ArrayList<Music>();
	}

	public void createAtLast(Music music) {
		mList.add(music);
	}

	public void createAtFirst(Music music) {
		mList.add(0, music);
	}

	public List<Music> getMList() {
		return mList;
	}

	public void deleteByTitle(Music music) {
		mList.remove(mList.indexOf(music));
	}

	public void updateByTitle(Music music) {
		mList.set(mList.indexOf(music), music);
	}

	public List<Music> sortAscendingByTitle(List<Music> mList) {
		for (int i = 0; i < mList.size() - 1; i++) {
			for (int j = 0; j < mList.size() - 1 - i; j++) {
				if (mList.get(j).getSong().charAt(0) > mList.get(j + 1).getSong().charAt(0)) {
					Music temp = mList.get(j + 1);
					mList.set((j + 1), mList.get(j));
					mList.set(j, temp);
				}
			}
		}
		return mList;
	}

	public List<Music> sortDescendingBySinger(List<Music> mList) {
		for (int i = 0; i < mList.size() - 1; i++) {
			for (int j = 0; j < mList.size() - 1 - i; j++) {
				if (mList.get(j).getSinger().charAt(0) < mList.get(j + 1).getSinger().charAt(0)) {
					Music temp = mList.get(j + 1);
					mList.set((j + 1), mList.get(j));
					mList.set(j, temp);
				}
			}
		}
		return mList;
	}

	public Music searchByTitle(String song) {
		for (int i = 0; i < mList.size(); i++) {
			if (song.equals(mList.get(i).getSong())) {
				return mList.get(i);
			}
		}
		return null;
	}

	public void displaySuccess(String message) {
		System.out.println("[처리 성공]" + message);
	}

	public void displayError(String message) {
		System.out.println("[처리 실패] " + message);
	}

	public List<Music> copyMList() {
		List<Music> mListCopy = new ArrayList<Music>();
		mListCopy.addAll(mList);
		return mListCopy;
	}

	public void saveFile(List<Music> mList) {
		MusicFile mFile = new MusicFile();

		String saveStr = "";
		for (int i = 0; i < mList.size(); i++) {
			saveStr += mList.get(i).fileFormat();
			if (i < mList.size() - 1)
				saveStr += ",,";
		}
		mFile.saveFile(saveStr);
	}

	public void loadFile() {
		MusicFile mFile = new MusicFile();
		String loadStr = mFile.readFile();
		String[] objSplit = loadStr.split(",,");

		for (int i = 0; i < objSplit.length; i++) {
			Music music = new Music(objSplit[i].split(",")[0], objSplit[i].split(",")[1]);
			mList.add(music);
		}
		this.mList = mList;
	}

	// 강사님 정렬 방법
	public List<Music> sortByTitle(List<Music> mList) {
		Collections.sort(mList);  //기본이 오름차순이고,,
		// sort메소드는List인터페이스를 매개변수로 받음.
		// mList를 ArrayList변수가 아닌 List변수로 했던 이유.
		return mList;
	}

	public List<Music> sortBySinger(List<Music> mList) {
		Comparator comparator = new Comparator<Music>() {
			@Override
			public int compare(Music o1, Music o2) {
				return o1.getSinger().compareTo(o2.getSinger()) * -1;
			}
		};
		Collections.sort(mList, comparator);
		return mList;
	}
}

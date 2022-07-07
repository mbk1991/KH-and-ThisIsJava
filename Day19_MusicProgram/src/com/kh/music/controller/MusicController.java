package com.kh.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.music.model.vo.Music;

public class MusicController {
	List<Music> mList = null;
	
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
	public void readByTitle() {}
	public void deleteByTitle(Music music) {
		mList.remove(mList.indexOf(music));
	}
	public void updateByTitle(Music music) {
		mList.set(mList.indexOf(music), music);
	}
	public void sortAscending() {}
	public void sortDescending() {}
	public Music searchByTitle(String song) {
		for(int i = 0; i < mList.size(); i++) {
			if(song.equals(mList.get(i).getSong())) {
				return mList.get(i);
			}
		}
		return null;
	}
	
	public void displaySuccess(String message) {
		System.out.println("[贸府 己傍]" + message);
	}
	public void displayError(String message) {
		System.out.println("[贸府 角菩] " + message);
	}
}

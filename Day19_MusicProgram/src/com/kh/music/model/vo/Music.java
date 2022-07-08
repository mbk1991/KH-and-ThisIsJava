package com.kh.music.model.vo;

import java.util.Comparator;

public class Music implements Comparable<Music>{
	private String song;
	private String singer;

	public Music(String song, String singer) {
		this.song = song;
		this.singer = singer;
	}

	@Override
	public int compareTo(Music o) {
		return this.song.compareTo(o.getSong());
	}
	
	public void setSong(String song) {
		this.song = song;
	}

	public String getSong() {
		return song;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getSinger() {
		return singer;
	}
	
	@Override
	public String toString() {
		String printInfo = 
				"[title= " + this.song + " , " + "singer= " + this.singer + " ]";
		return printInfo;
	}
	
	public String fileFormat() {
				return this.song+","+this.singer;
	}


}

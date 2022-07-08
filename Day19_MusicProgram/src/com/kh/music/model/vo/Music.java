package com.kh.music.model.vo;

public class Music implements Comparable<Music>{
	private String song;
	private String singer;

	public Music(String song, String singer) {
		this.song = song;
		this.singer = singer;
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

	@Override
	public int compareTo(Music o) {
		return 0;
	}
}

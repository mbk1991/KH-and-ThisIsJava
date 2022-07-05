package com.kh.nintendo;

public class Player {
	private String name;
	private String id;
	private String pw;
	private int money;
	private int ranking;
	public String getId() {
		return id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public void setId(String id) {
		this.id = id;
	}
}

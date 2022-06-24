package com.kh.interfaceex;

public interface Car {
	//인터페이스는 추상클래스의 변형체
	//추상클래스는 일반 변수, 메소드도 선언가능하지만
	//인터페이스는 상수형필드, 추상메소드만 가능하다.
//	public String carName;
//	public void stop() {
//		System.out.println("멈춥니다.");
//	}
	
	String carName = "차차차";
	void move(int x);
	void stop();

}

package com.kh.exercise;

import com.kh.ingeritance.Parent;

public class Child extends Parent {
	private int myMoney = 1000;
	private int money = super.money + myMoney;
	
//	public Child() {
//		super();
//	}  // 이 생성자가 생략되어잇다.
// //자식클래스의 생성자 첫 줄에는 부모 생성자가 있어야 한다.
//	//작성하지 않은 경우 JVM이  디폴트로 생성해줌
	
	
	public void printInfo() {
		System.out.println("Parant money : "+ super.money);
		System.out.println("Child Money : " + this.money);
		System.out.println("Child myMoney :" +this.myMoney);
	}
	
	@Override
	public void pizzaRecipe() {
		super.pizzaRecipe();
		System.out.println("도우는 두껍고 햄을 많이");
	}
	
}

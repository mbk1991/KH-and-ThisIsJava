package com.kh.exercise;

import com.kh.ingeritance.Parent;

public class Child extends Parent {
	private int myMoney = 1000;
	private int money = super.money + myMoney;
	
//	public Child() {
//		super();
//	}  // �� �����ڰ� �����Ǿ��մ�.
// //�ڽ�Ŭ������ ������ ù �ٿ��� �θ� �����ڰ� �־�� �Ѵ�.
//	//�ۼ����� ���� ��� JVM��  ����Ʈ�� ��������
	
	
	public void printInfo() {
		System.out.println("Parant money : "+ super.money);
		System.out.println("Child Money : " + this.money);
		System.out.println("Child myMoney :" +this.myMoney);
	}
	
	@Override
	public void pizzaRecipe() {
		super.pizzaRecipe();
		System.out.println("����� �β��� ���� ����");
	}
	
}

package com.kh.interfaceex;

public interface Car {
	//�������̽��� �߻�Ŭ������ ����ü
	//�߻�Ŭ������ �Ϲ� ����, �޼ҵ嵵 ���𰡴�������
	//�������̽��� ������ʵ�, �߻�޼ҵ常 �����ϴ�.
//	public String carName;
//	public void stop() {
//		System.out.println("����ϴ�.");
//	}
	
	String carName = "������";
	void move(int x);
	void stop();

}

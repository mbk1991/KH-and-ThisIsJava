package chap6;

public class CarExample {
	// �ܺ� Ŭ�������� Car�ʵ尪 �б�� ����
	public static void main(String[] args) {
		// ��ü ����
//		Car myCar = new Car();
//
//		// �ʵ尪 �б�
//		System.out.println("����ȸ��: " + myCar.company);
//		System.out.println("�𵨸�: " + myCar.model);
//		System.out.println("����: " + myCar.color);
//		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
//		System.out.println("����ӵ�: " + myCar.speed);
//		
//		//�ʵ尪 ����
//		myCar.maxSpeed = 60;
//		System.out.println("������ �ӵ�: "+ myCar.speed);

		Car car1 = new Car();
		Car car2 = new Car("�Ķ���", 3500);
		Car car3 = new Car("ĳ����", "�ʷϻ�");
		Car car4 = new Car("����", "������", 280);

		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		System.out.println("car1.speed : " + car1.speed);
		System.out.println("car1.cc : " + car1.cc);
		System.out.println();
		System.out.println("=====");

		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);
		System.out.println("car2.speed : " + car2.speed);
		System.out.println("car2.cc : " + car2.cc);
		System.out.println();
		System.out.println("=====");

		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println("car3.speed : " + car3.speed);
		System.out.println("car3.cc : " + car3.cc);
		System.out.println();
		System.out.println("=====");

		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println("car4.speed : " + car4.speed);
		System.out.println("car4.cc : " + car4.cc);
		System.out.println();
		System.out.println("=====");

	}
}

package chap7.promotion;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i<=10; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
				car.setFrontLeftTire(new HankookTire("�տ���",7));
//				car.frontLeftTire = new HankookTire("�տ���",20);
				break;
			case 2:
				System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�տ�����",30);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.backLeftTire = new HankookTire(22,"�ڿ���");
				break;
			case 4:
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				car.backRightTire = new KumhoTire(10,"�ڿ�����");
			}
			System.out.println("=====\n");
		}
	}
}

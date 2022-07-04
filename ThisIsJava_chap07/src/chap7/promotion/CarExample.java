package chap7.promotion;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i<=10; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].getLocation() + "HankookTire로 교체");
				car.tires[problemLocation-1] =
						new HankookTire(car.tires[problemLocation-1].getLocation(),15);
			}
			
			
			
//			switch(problemLocation) {
//			case 1:
//				System.out.println("앞왼쪽 HankookTire로 교체");
//				car.setFrontLeftTire(new HankookTire("앞왼쪽",7));
////				car.frontLeftTire = new HankookTire("앞왼쪽",20);
//				break;
//			case 2:
//				System.out.println("앞오른쪽 KumhoTire로 교체");
//				car.frontRightTire = new KumhoTire("앞오른쪽",30);
//				break;
//			case 3:
//				System.out.println("뒤왼쪽 HankookTire로 교체");
//				car.backLeftTire = new HankookTire(22,"뒤왼쪽");
//				break;
//			case 4:
//				System.out.println("뒤오른쪽 KumhoTire로 교체");
//				car.backRightTire = new KumhoTire(10,"뒤오른쪽");
//			}
//			System.out.println("=====\n");
		}
	}
}

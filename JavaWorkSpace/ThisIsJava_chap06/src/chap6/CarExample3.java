package chap6;

public class CarExample3 {
	public static void main(String[] args) {
		Car3 myCar = new Car3();
		myCar.keyTurnOn();
		myCar.run();
		
		int speed = myCar.getSpeed();
		System.out.println("현재 속도:" + speed);
	}
}

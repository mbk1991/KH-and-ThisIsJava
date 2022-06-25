package chap7.promotion;

public class Car {
	//필드
	private Tire frontLeftTire = new Tire(6,"앞왼쪽");
	Tire frontRightTire = new Tire(2,"앞오른쪽");
	Tire backLeftTire = new Tire(3,"뒤왼쪽");
	Tire backRightTire = new Tire(4,"오른쪽");
	
	//메소드  //여기서 포인트는 if문의 조건식에 메소드가 들어갈 경우 해당 메소드의 return값을 반환받기 위해서 실행이 된다는 점.
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
		
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	public Tire getFrontLeftTire() {
		return frontLeftTire;
	}
	public void setFrontLeftTire(Tire frontLeftTire) {
		this.frontLeftTire = frontLeftTire;
	}
	
}

package chap7.promotion;

public class Car {
	//필드
	
	
//	Tire[] tires = new Tire[4];
	
	Tire[] tires = {
			new Tire("앞왼쪽",6),
			new Tire("앞오른쪽",5),
			new Tire("뒤왼쪽",4),
			new Tire("뒤오른쪽",3)
	};
	
	

//	private Tire frontLeftTire = new Tire(6,"앞왼쪽");
//	Tire frontRightTire = new Tire(2,"앞오른쪽");
//	Tire backLeftTire = new Tire(3,"뒤왼쪽");
//	Tire backRightTire = new Tire(4,"오른쪽");
	
	//메소드  //여기서 포인트는 if문의 조건식에 메소드가 들어갈 경우 해당 메소드의 return값을 반환받기 위해서 실행이 된다는 점.
	int run() {
		System.out.println("자동차가 달립니다.");
		
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll()==false) {stop(); return (i+1);}
		}
		return 0;
		
		
		
//		if(frontLeftTire.roll()==false) {stop(); return 1;}
//		if(frontRightTire.roll()==false) {stop(); return 2;}
//		if(backLeftTire.roll()==false) {stop(); return 3;}
//		if(backRightTire.roll()==false) {stop(); return 4;}
//		return 0;
		
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	public Tire getTires(int i) {
		return tires[i];
	}
	public void setTires(int i) {
		this.tires[i] = tires[i];
	}
	
}

package chap6;

public class Car4 {
	//인스턴스 멤버와 this
	//필드
	String model;
	int speed;
	
	//생성자
	Car4(String model){
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=0; i<=50; i+=10) {
			this.setSpeed(i);
	System.out.println(this.model+ "가 달립니다.(시속 "+ this.speed +"km/h");
		}
	}
}

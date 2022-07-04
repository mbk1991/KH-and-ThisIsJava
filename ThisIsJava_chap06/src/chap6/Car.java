package chap6;

public class Car {
	//다른 생성자를 호출해서 중복 코드 줄이기.
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	int cc;
	
	//생성자
	Car(){}
	Car(String color, int cc){
		this.color = color;
		this.cc = cc;
	}
//	Car(String model){
//		this.model = model;
//	}
//	Car(String model,String color){
//		this.model = model;
//		this.color = color;
//	}
//	Car(String model, String color, int maxSpeed){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car(String model){
		this(model,null,0);
	}
	Car(String model, String color){
		this(model,color,0);
	}
	
}

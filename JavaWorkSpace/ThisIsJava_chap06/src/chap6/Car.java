package chap6;

public class Car {
	//�ٸ� �����ڸ� ȣ���ؼ� �ߺ� �ڵ� ���̱�.
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	int speed;
	int cc;
	
	//������
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

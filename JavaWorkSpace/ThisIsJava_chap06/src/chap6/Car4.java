package chap6;

public class Car4 {
	//�ν��Ͻ� ����� this
	//�ʵ�
	String model;
	int speed;
	
	//������
	Car4(String model){
		this.model = model;
	}
	
	//�޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=0; i<=50; i+=10) {
			this.setSpeed(i);
	System.out.println(this.model+ "�� �޸��ϴ�.(�ü� "+ this.speed +"km/h");
		}
	}
}

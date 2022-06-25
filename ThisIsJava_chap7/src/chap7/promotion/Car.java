package chap7.promotion;

public class Car {
	//�ʵ�
	private Tire frontLeftTire = new Tire(6,"�տ���");
	Tire frontRightTire = new Tire(2,"�տ�����");
	Tire backLeftTire = new Tire(3,"�ڿ���");
	Tire backRightTire = new Tire(4,"������");
	
	//�޼ҵ�  //���⼭ ����Ʈ�� if���� ���ǽĿ� �޼ҵ尡 �� ��� �ش� �޼ҵ��� return���� ��ȯ�ޱ� ���ؼ� ������ �ȴٴ� ��.
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
		
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
	
	public Tire getFrontLeftTire() {
		return frontLeftTire;
	}
	public void setFrontLeftTire(Tire frontLeftTire) {
		this.frontLeftTire = frontLeftTire;
	}
	
}

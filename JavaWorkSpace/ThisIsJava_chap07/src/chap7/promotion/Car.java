package chap7.promotion;

public class Car {
	//�ʵ�
	
	
//	Tire[] tires = new Tire[4];
	
	Tire[] tires = {
			new Tire("�տ���",6),
			new Tire("�տ�����",5),
			new Tire("�ڿ���",4),
			new Tire("�ڿ�����",3)
	};
	
	

//	private Tire frontLeftTire = new Tire(6,"�տ���");
//	Tire frontRightTire = new Tire(2,"�տ�����");
//	Tire backLeftTire = new Tire(3,"�ڿ���");
//	Tire backRightTire = new Tire(4,"������");
	
	//�޼ҵ�  //���⼭ ����Ʈ�� if���� ���ǽĿ� �޼ҵ尡 �� ��� �ش� �޼ҵ��� return���� ��ȯ�ޱ� ���ؼ� ������ �ȴٴ� ��.
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		
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
		System.out.println("�ڵ����� ����ϴ�.");
	}
	
	public Tire getTires(int i) {
		return tires[i];
	}
	public void setTires(int i) {
		this.tires[i] = tires[i];
	}
	
}

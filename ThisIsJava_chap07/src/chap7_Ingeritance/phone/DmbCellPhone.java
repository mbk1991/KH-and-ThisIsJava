package chap7_Ingeritance.phone;

public class DmbCellPhone extends CellPhone {
	//�ʵ�
	int channel;
	
	//������
	DmbCellPhone(String model,String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�
	
	@Override
	void powerOn() {
		System.out.println("DMB���� ������ �մϴ�.");
	}
	
	void turnOnDmb() {
		System.out.println("ä�� "+ channel +"�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� "+channel+"������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	

}

package chap7.abstractexam;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();  // �Ұ�
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}

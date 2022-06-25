package chap7.abstractexam;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();  // ºÒ°¡
		
		SmartPhone smartPhone = new SmartPhone("È«±æµ¿");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}

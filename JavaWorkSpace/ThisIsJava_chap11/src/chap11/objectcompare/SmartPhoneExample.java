package chap11.objectcompare;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����","�ȵ���̵�");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
	}
}



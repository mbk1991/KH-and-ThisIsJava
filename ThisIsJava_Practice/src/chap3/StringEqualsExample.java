package chap3;

public class StringEqualsExample {
	//���ڿ� ��
	public static void main(String[]args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö");
		
		System.out.println(strVar1 == strVar2);  //true
		System.out.println(strVar1 == strVar3); //false
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //true
		System.out.println(strVar1.equals(strVar3)); //true
	}

}

package chap2;

public class OperationsPromotionExample {
	//����Ŀ��� �ڵ� Ÿ�Ժ�ȯ
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		byte byteValue3 = (byte)(byteValue1 + byteValue2); //byte������ �����ε� int�� �Ǿ����
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		char charValue3 = (char)(charValue1 + charValue2); // char������ �����ε� int�� �Ǿ����
		int intValue2 = charValue1 +charValue2;
		System.out.println("�����ڵ� = " + intValue2);
		System.out.println("��¹��� = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		int intValue6 = (int)(10/ 4.0); // double�� ��Ʈ�� �ٲ� �� ����
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}

}

package chap2;

public class FromIntToFloat {
	public static void main(String[] args) {
		// ����ȯ ����Ÿ�� �Ǽ�Ÿ�� ��ȯ �� ���е� �ս� �߻�.
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		System.out.println("num1 : " + num1 + "num2 : " + num2);
		
		float num3 = num2;
		num2 = (int) num3;
		System.out.println("num1 : " + num1 + "num2 : " + num2 + "num3 : " + num3);
		
		int result = num1 - num2;
		System.out.println(result);
		System.out.println("num1 : " + num1 + "num2 : " + num2 + "num3 : " + num3);
	}
}

package chap3;

public class AccuracyExample1 {
	// �ε��Ҽ������� ����� �� ��� 0.1�� ��Ȯ�� ǥ���� �� ���� ���� Ʋ����...
	public static void main(String[] args) {
//		int apple = 1;
//		double pieceUnit = 0.1;
//		int number = 7;
//		
//		double result = apple - number*pieceUnit;
		
		//-> int�� ����� �Ǽ�Ÿ������ �������־����.
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		int totalApple = 1*10;
		int temp = (totalApple - number);
		double result = temp/10.0;
		
		
		System.out.println("��� �� ������");
		System.out.println("0.7 ������ ����");
		System.out.println(result + "������ ���´�.");

	}

}

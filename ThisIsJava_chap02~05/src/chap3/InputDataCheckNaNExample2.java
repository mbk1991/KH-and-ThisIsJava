package chap3;

public class InputDataCheckNaNExample2 {
	//NaN�� üũ�ϰ� ���� ����
	public static void main(String[]args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);
		
	}

}
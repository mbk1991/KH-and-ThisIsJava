package chap3;

public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		//NaN���ڿ��� Double.valueOf �޼��忡 ���� NaN�� �ȴ�.
		
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		System.out.println(val);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}

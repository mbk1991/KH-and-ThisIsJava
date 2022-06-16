package chap3;

public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		//NaN문자열은 Double.valueOf 메서드에 의해 NaN이 된다.
		
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		System.out.println(val);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}

package chap6;

public class StaticCalculatorExample {
	public static void main(String[] args) {
		
		double result1 = 10*10*StaticCalculator.pi;
		int result2 = StaticCalculator.plus(10, 14);
		int result3 = StaticCalculator.minus(12, 8);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	}
}

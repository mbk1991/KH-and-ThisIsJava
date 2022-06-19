package chap6;

public class CalculatorOverLoadingExample {
	public static void main(String[] args) {
		CalculatorOverLoading myCalc = new CalculatorOverLoading();
		
		double result1 = myCalc.areaRectangle(10);
		double result2 = myCalc.areaRectangle(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
	}
}

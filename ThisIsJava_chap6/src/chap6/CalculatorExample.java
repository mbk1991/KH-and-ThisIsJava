package chap6;

public class CalculatorExample {
	//�޼ҵ� ȣ��
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(10, 20);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x,y);
		System.out.println("result2 : " + result2);
		
		myCalc.turnOff();
		
		
	}
	
}

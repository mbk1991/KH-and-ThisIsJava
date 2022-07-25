package chap3;

public class AccuracyExample1 {
	// 부동소수점으로 계산을 할 경우 0.1을 정확히 표현할 수 없어 값이 틀리다...
	public static void main(String[] args) {
//		int apple = 1;
//		double pieceUnit = 0.1;
//		int number = 7;
//		
//		double result = apple - number*pieceUnit;
		
		//-> int로 계산후 실수타입으로 변경해주어야함.
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		int totalApple = 1*10;
		int temp = (totalApple - number);
		double result = temp/10.0;
		
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + "조각이 남는다.");

	}

}

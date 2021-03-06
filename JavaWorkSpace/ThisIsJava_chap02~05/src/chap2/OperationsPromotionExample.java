package chap2;

public class OperationsPromotionExample {
	//연산식에서 자동 타입변환
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		byte byteValue3 = (byte)(byteValue1 + byteValue2); //byte끼리의 연산인데 int가 되어버림
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		char charValue3 = (char)(charValue1 + charValue2); // char끼리의 연산인데 int가 되어버림
		int intValue2 = charValue1 +charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		int intValue6 = (int)(10/ 4.0); // double을 인트로 바꿀 수 없음
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}

}

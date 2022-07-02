package chap10.exception;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		try {

//			data1 = args[0];
//			data2 = args[1];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("실행방법에대한 설명..");
//			return;
		}

		try {

			int value = Integer.parseInt("abc");
			int value2 = Integer.parseInt("123");

			int result = value + value2;
			System.out.println("result = " + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}

	}
}

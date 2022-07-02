package chap10.exception;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		try {

//			data1 = args[0];
//			data2 = args[1];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("������������ ����..");
//			return;
		}

		try {

			int value = Integer.parseInt("abc");
			int value2 = Integer.parseInt("123");

			int result = value + value2;
			System.out.println("result = " + result);
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���");
		}

	}
}

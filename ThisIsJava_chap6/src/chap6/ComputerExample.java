package chap6;

public class ComputerExample {
	// �Ű� ������ ���� �� ���
	public static void main(String[] args) {
		Computer myCom = new Computer();
		int[] values = { 1, 2, 3 };
		int result1 = myCom.sum(values);
		System.out.println("result1 : " + result1);

		int result2 = myCom.sum(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result1 : " + result2);

		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 : " + result4);

	}
}

package chap3;

public class InfinityAndnaNCheckExample {
	// Infinity�� NaN �� �� �ѹ�
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;

		//double z = x / y;
		 double z = x % y;

		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		//�ش� ���� ���Ǵ�Ƽ���� ������ ����, infinite�� NaN�� ���� �� ������ �ǹǷ�
		//�����Ѵ�.
			
		System.out.println(z + 2); // ������ �Ǵ� �ڵ�

	}
}

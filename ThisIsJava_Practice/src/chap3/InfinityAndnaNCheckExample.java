package chap3;

public class InfinityAndnaNCheckExample {
	// Infinity와 NaN 낫 어 넘버
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;

		//double z = x / y;
		 double z = x % y;

		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		//해당 값이 인피니티인지 난인지 구분, infinite와 NaN은 연산 시 문제가 되므로
		//주의한다.
			
		System.out.println(z + 2); // 문제가 되는 코드

	}
}

package chap4;

public class Exercise06 {
	// for문 이용. *삼각형을 출력하는 코드 작성
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

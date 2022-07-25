package chap3;

public class OverflowExample {
	// 오버플로우 , 컴파일 에러는 없지만 쓰레기값이 나옴.
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
	// 해결을 위해 long 유형을 사용한다.
	}
}

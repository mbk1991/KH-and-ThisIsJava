package chap11.objects.compare;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));  // null이 아니면 객체를 반환함.
	}
}

package chap11.objects.compare;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));  // null�� �ƴϸ� ��ü�� ��ȯ��.
	}
}

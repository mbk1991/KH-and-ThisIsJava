package sec07.stream.looping;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		
		System.out.println("[peek()�� �������� ȣ���� ���]");
		Arrays.stream(intArr)
			.filter(a->a%2==0)
			.peek(n->System.out.println(n));
		
		System.out.println("[���� ó�� �޼ҵ带 �������� ȣ���� ���]");
		int total = Arrays.stream(intArr)
				.filter(a->a%2 ==0)
				.peek(n-> System.out.println(n))
				.sum();
		System.out.println("���� :" + total);
		
	}
}

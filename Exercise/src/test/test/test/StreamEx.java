package test.test.test;

import java.util.stream.IntStream;

public class StreamEx {
	public static void main(String[] args) {

		int answer = IntStream.range(1,10).filter(i -> 10%i ==1).findFirst().orElse(0);
		
		System.out.println(answer);
		
		
		System.out.println(Math.pow(4,3));
		System.out.println(Math.sqrt(64));
		
		Math.floor(5);  // �Ű��������� ũ�� ���� ������ ����. 
}
}

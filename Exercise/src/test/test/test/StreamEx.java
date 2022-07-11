package test.test.test;

import java.util.stream.IntStream;

public class StreamEx {
	public static void main(String[] args) {

		int answer = IntStream.range(1,10).filter(i -> 10%i ==1).findFirst().orElse(0);
		
		System.out.println(answer);
}
}

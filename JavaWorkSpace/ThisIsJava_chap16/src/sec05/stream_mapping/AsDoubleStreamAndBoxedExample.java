package sec05.stream_mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };
		
		IntStream intStream = Arrays.stream(intArray);
		
		intStream.asDoubleStream().forEach(d->System.out.println(d));  // 인트스트림을 더블스트림으로 변환
		
		System.out.println();
		
		//박싱
		
		intStream = Arrays.stream(intArray);
		intStream
			.boxed()
			.forEach(obj -> obj.intValue());

		
	}

}

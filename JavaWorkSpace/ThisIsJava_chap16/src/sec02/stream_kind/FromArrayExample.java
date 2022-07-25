package sec02.stream_kind;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {

	public static void main(String[] args) {

		String[] strArrays = {"È«±æµ¿","½Å¿ë±Ç","±è¹Ì³ª"};
		Stream<String> strStream = Arrays.stream(strArrays);
		strStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
		
		int[] intArrays = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArrays);
		intStream.forEach(a ->System.out.print(a + ","));
		
	}

}

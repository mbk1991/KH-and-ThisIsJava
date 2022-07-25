package chap16.streamexam;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEercise {
	public class FromIntRangeExample{
	}
	
	public static void main(String[] args) {
		
		int [] arrInt = {1,2,3,4,5,6,7,8,9,0};
		IntStream intStream = Arrays.stream(arrInt);
		intStream.forEach(num -> System.out.println(num));
		

		IntStream intStream2 = IntStream.rangeClosed(1,100);
		System.out.println( intStream2.filter(i -> i%2==0));
	}
}

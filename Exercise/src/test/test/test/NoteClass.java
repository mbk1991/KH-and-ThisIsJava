package test.test.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class NoteClass {
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,65,67,4};
		//배열을 넣으면 IntSteram을 반환하는 메소드
		System.out.println(Arrays.stream(array));
		
	}
	
	
	public void exercise() {
//		Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
	}
}

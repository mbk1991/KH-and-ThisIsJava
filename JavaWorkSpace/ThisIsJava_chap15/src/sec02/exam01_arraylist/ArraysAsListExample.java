package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동","신용권","감자바");
		
		for(String name:list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3,4,5); // new Integer(1) 같이 주는게 정석이나 오토박싱 이용
		for(int value: list2) {
			System.out.println(value);
		}
		
	}

}

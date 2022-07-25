package sec04.stream_filtering;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping"); //
		
		inputList1.stream()
			.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(System.out::println);
		
		System.out.println();
		List<String> inputList2 = Arrays.asList("10,20,30","40,50");
		
		inputList2.stream()
			.flatMapToInt(data->{
				String[] strArray = data.split(",");
				int[] intArr = new int[strArray.length];
				for(int i = 0; i< strArray.length; i++) {
					intArr[i] = Integer.parseInt(strArray[i].trim());
				}
				return Arrays.stream(intArr);
			})
			.forEach(System.out::println);
		
		
	}

}

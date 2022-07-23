package sec08.stream_match;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		
		//int[]배열로 하면 타입 불일치 에러 발생.
		Integer[] intArr = {1,2,3,4,5,6,7};
		List<Integer> list = new ArrayList<>(Arrays.asList(intArr));
//		
//		에러가 발생한다. 이유는 값이 없는데 집계를 하기 때문.	
//   	java.util.NoSuchElementException: 
//		double avg = list.stream()
//				.mapToInt(Integer :: intValue)
//				.average()
//				.getAsDouble();
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer ::intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println("방법_1평균:" +optional.getAsDouble());
		}else {
			System.out.println("방법1_평균: 0.0");
		}
			
		
		double avg = list.stream()
		.mapToInt(Integer ::intValue)
		.average()
		.orElse(0.0);
		
		System.out.println("방법2_평균:" + avg);
		
		list.stream()
			.mapToInt(n->n.intValue())
			.average()
			.ifPresent(a->System.out.println("방법3_평균:" + a));
		

	}

}

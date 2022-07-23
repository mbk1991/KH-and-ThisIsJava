package sec08.stream_match;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		
		//int[]�迭�� �ϸ� Ÿ�� ����ġ ���� �߻�.
		Integer[] intArr = {1,2,3,4,5,6,7};
		List<Integer> list = new ArrayList<>(Arrays.asList(intArr));
//		
//		������ �߻��Ѵ�. ������ ���� ���µ� ���踦 �ϱ� ����.	
//   	java.util.NoSuchElementException: 
//		double avg = list.stream()
//				.mapToInt(Integer :: intValue)
//				.average()
//				.getAsDouble();
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer ::intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println("���_1���:" +optional.getAsDouble());
		}else {
			System.out.println("���1_���: 0.0");
		}
			
		
		double avg = list.stream()
		.mapToInt(Integer ::intValue)
		.average()
		.orElse(0.0);
		
		System.out.println("���2_���:" + avg);
		
		list.stream()
			.mapToInt(n->n.intValue())
			.average()
			.ifPresent(a->System.out.println("���3_���:" + a));
		

	}

}

package sec09.stream_aggregate;

import java.util.Arrays;

public class AgrregateExample {
	
	//stream의  최종처리 : 집계
	// SQL의 집계함수처럼 대량의 데이터를 하나의 값으로 만들어줌
	// 이를 리덕션 (Reduction)이라고 한다.
	//Optional 클래스
	//집계 메소드의 리턴 타입으로 사용되어 집계값을 가지고 있음
	//값이 존재하지 않는 경우 디폴트 값을 설정할 수도 있다.
	//집계 값을 처리하는 Consumer를 등록할 수 있다.

	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5})
		.filter(n->n%2==0)
		.count();
		System.out.println(count);
		
		long sum = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n->n%2 ==0)
				.sum();
		System.out.println(sum);
		
		int max = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n->n%2==0)
				.max()
				.getAsInt();
		
		System.out.println(max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n->n%2==0)
				.min()
				.getAsInt();
		System.out.println(min);
		
		int first = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n->n%2==0)
				.findFirst()
				.getAsInt();
		System.out.println(first);
		
	}

}

package sec10.stream_reduce;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		
		
		//reduce를 이용한 개발자 정의 집계 처리!!
		
		List<Student> studentList = Arrays.asList(
				new Student("홍길동",92),
				new Student("신용권",95),
				new Student("감자바",70)
				);
	
		int sum1 = studentList.stream()
				.mapToInt(s->s.getScore())
				.sum();
		
		int sum2 = studentList.stream()
				.mapToInt(Student::getScore)
				.reduce((a,b) -> a+b)
				.getAsInt();
		
		int sum3 = studentList.stream()
				.mapToInt(Student::getScore)
				.reduce(0,(a,b)->a+b);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
	}
}

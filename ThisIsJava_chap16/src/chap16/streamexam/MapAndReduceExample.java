package chap16.streamexam;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList( /// 매개변수 ... 을 잊고 있었다. 값을 여러개 주면 자체적으로 배열로만들어 처리하는 형태
				new Student("홍길동", 90), 
				new Student("신용권", 92), 
				new Student("김자바", 95)
				);
		
//		list.stream().mapToInt(s->s.getScore())
		double avg =  list.stream()  // Student타입의 stream을 만들고
				.mapToInt(Student::getScore)  //(중간처리) Student의 메소드 getScore를 참조하여 Int중간Stream을 만들고
				.average()  // (최종처리) 평균을 구하는 최종처리를 함. OptionalDouble타입 반환 OptionalDouble? 클래스임.
				.getAsDouble();
		
		System.out.println("평균 점수 : " + avg);
		
	}
}

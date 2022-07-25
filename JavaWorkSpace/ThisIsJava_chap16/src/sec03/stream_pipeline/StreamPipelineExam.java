package sec03.stream_pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipelineExam {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(  //asList 는 배열을 받아 ArrayList로 반환.
				new Member("홍길동",Member.MALE,30),
				new Member("김나리",Member.FEMALE,20),
				new Member("신용권",Member.MALE,45),
				new Member("박수미",Member.FEMALE,27)
				);
		
		// 1. 스트림을 얻어낸다 2.중간처리하여 중간스트림을 얻어낸다 3. 최종처리하여 값을 얻어낸다.// lazy 개념 상기: 최종처리가 시작되어야 중간처리가 진행됨.
		// 이 과정이 왠지 SQL의 집계함수를 사용하는 과정과 유사한 것 같다.
		
		Stream<Member> maleFemaleStream = list.stream(); //list컬렉션으로 stream객체를 얻고
		Stream<Member> maleStream = maleFemaleStream.filter(m->m.getSex() == Member.MALE); //m.getSex가 남자인 경우만 필터링하여 스트림으로
		IntStream ageStream = maleStream.mapToInt(m->m.getAge());  // getAge 값들을 IntStream으로 뽑아냄
		OptionalDouble optionalDouble = ageStream.average(); // 뽑아낸 것들을 평균으로 최종처리하여 OptionalDouble 타입으로 
		double avg = optionalDouble.getAsDouble(); // 이를 다시 double 으로 변환
		
		System.out.println(avg);
		
		//이를 불필요한 변수 선언을 없애 메소드체이닝하면
		
		double avg2 = list.stream().filter(m->m.getSex() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble();
		System.out.println(avg2);
		
		
		
		
	}
	
}

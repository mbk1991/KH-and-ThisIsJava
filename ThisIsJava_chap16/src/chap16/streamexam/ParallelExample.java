package chap16.streamexam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","신용권","김자바","람다식","박병렬");
		
		//순차처리
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample::print);  // ParallelExample의 print메소드를 참조한다.7
		//forEach에대한 설명이 요소를 하나씩 계속 반복해서 가져오라는 의미라고 설명(이것이자바다 유튜브인강)
		//메소드 참조 인 것 같은데..
		System.out.println();
		
		//병렬처리
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample::print);
		
		
	}


//내부 반복자의 이점
//개발자는 요소처리 코드에만 집중
//멀티코어 cpu를 최대한 활용하기 위해 요소들을 분배시켜 병렬처리작업을 할 수 있다.
//병렬(parallel)처리 한가지 작업을 서브 작업으로 나누고 서브 작업들을 분리된 스레드에서 병렬적으로 
//처리한 후 서브 작업들의 결과들을 최종 결합하는 방법
// 1부터 1000까지의 합을 구할 때 1~500까지의 합, 501~ 1000까지의 합을 구하는 식으로
//서브작업으로 나누고 병렬적으로 처리함
//병렬처리를 할 수 있는 스트림 ForkJoinPool 쓰레드풀.
// stream 은 싱글스레드
// parallelStream은 멀티스레드 병렬처리
	
//14장 메소드 참조   람다식을 메소드참조로 변경한다?
//람다식에서 매개변수를 단순히 전달만 하는 경우 -> 메소드참조 ::
	//람다식에서 객체를 단순히 생성만 하는 경우 -> 매소드참조(생성자 참조) ::

public static void print(String str) {
	System.out.println(str + ":" + Thread.currentThread().getName());
}
}
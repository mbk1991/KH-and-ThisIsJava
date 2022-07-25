package chap16.streamexam;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","신용권","김자바");
		
		//Iterator 이용
		Iterator<String> iterator = list.iterator();  // List는 Iterator의 자식인터페이스. Iterator객체를 생성하는 메소드.
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println("=====");
		
		Stream<String> stream = list.stream();  //Collections인터페이스의 stream메소드는 Stream객체를 생성한다.
		stream.forEach(name ->System.out.println(name));  //forEach는 Stream의 컨슈머 메소드이다!. 컨슈머는 리턴값이 없는 함수적 인터페이스
							     //forEach의 매개변수는 함수적인터페이스 Consumer가 들어갈 수 있는 자리이므로 람다식이 가능하다.
								//forEach는 다양하게 오버라이드 되어있다.
								 //Consumer에는 accept추상메소드가 있다. 람다식은 accept추상메소드를 정의하여 쓰는것. 파라미터는  T타입 1개.
	
		//함수적 인터페이스를 매개변수로 갖는 메소드를 이용하여 람다식을 이용한다.
		// 함수적인터페이스 Consumer를 매개변수로 갖는 forEach메소드에 람다식으로 accept를 재정의하여 함수로 사용함.
	}					
}

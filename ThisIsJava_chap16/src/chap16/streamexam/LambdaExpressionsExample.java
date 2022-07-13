package chap16.streamexam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList( /// 매개변수 ... 을 잊고 있었다. 값을 여러개 주면 자체적으로 배열로만들어 처리하는 형태
				new Student("홍길동", 90), 
				new Student("신용권", 92), 
				new Student("김자바", 95)
				);

		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
		
		List<Student> list2 = Arrays.asList(
				new Student("김김김",10), new Student("이이이",20),new Student("박박박",30));
		///asList는 arrayList를 반환한다.
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i).getName() + "-" + list2.get(i).getScore());
		}
		
				
		
		
		
	}
}

package chap16.exercise;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		// List에 저장되어 있는 String요소에서 대소문자와 상관없아"java"라는 단어가 포함된 문자열만
		//필터링해서 출력하기
		
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		//이 부분이 문제 :
		list.stream()
		.filter(s->s.toLowerCase().contains("java"))
		
		//
		.forEach(a->System.out.println(a));
		
	}
}

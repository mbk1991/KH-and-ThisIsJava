package chap16.exercise;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		//List에 저장되어 있는 Member의 평균 나이를 출력하기
		List<Member> list = Arrays.asList(
				new Member("홍길동",30),
				new Member("신용권",40),
				new Member("감자바",26)
				);
		
		//이 부분이 문제
		double avg = list.stream()
				.mapToInt(m->m.getAge())
				.average().getAsDouble();
		//
		System.out.println("평균 나이 :" + avg);
	}
	
	//nested class
	static class Member{
		private String name;
		private int age;
		
		public Member(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
	}
}

package chap16.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample3 {
	public static void main(String[] args) {
		
		//List에 저장되어 있는 Member를 직업별로 그룹핑해서 Map객체로 생성하기.
		//key는 직업, value 는 이름으로 구성된 List<String>
	
		List<Member> list = Arrays.asList(   
				new Member("홍길동","개발자"),
				new Member("김나라","디자이너"),
				new Member("신용권","개발자")
				);
		
		//여기서 부터 문제
		Map<String,List<String>> groupingMap = list.stream()
				.collect(
						Collectors.groupingBy(
								Member::getJob,
								Collectors.mapping(Member::getName,Collectors.toList())
								)
						);
		
		
		//
		System.out.print("[개발자] ");
		groupingMap.get("개발자").stream().forEach(s->System.out.print(s + " "));
		System.out.print("\n[디자이너] ");
		groupingMap.get("디자이너").stream().forEach(s->System.out.print(s + " "));
				
	}
	static class Member{
		private String name;
		private String job;
		
		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}
		
		public String getName() {
			return name;
		}
		
		public String getJob() {
			return job;
		}
	}
	
}

package chap16.exercise;

import java.util.Arrays;
import java.util.Iterator;
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
//		System.out.print("[개발자] ");
//		groupingMap.get("개발자").stream().forEach(s->System.out.print(s + " "));
//		System.out.print("\n[디자이너] ");
//		groupingMap.get("디자이너").stream().forEach(s->System.out.print(s + " "));
				
		
		List<Member> memberList = Arrays.asList(
				new Member(Member.Gender.MALE,30),
				new Member(Member.Gender.MALE,20),
				new Member(Member.Gender.FEMALE,10),
				new Member(Member.Gender.MALE,34),
				new Member(Member.Gender.FEMALE,24)
				);
		//스트림을 이용한 남자멤버 평균나이
		double avg = memberList.stream()
				.filter(m->m.getGender() == Member.Gender.MALE)
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		System.out.println("\n스트림 결과 : " + avg );
		
		//for문을 이용한 남자멤버 평균나이
		double avg2;
		int sum = 0;
		int count = 0;
		for(int i=0; i<memberList.size(); i++) {
			if(memberList.get(i).getGender() == Member.Gender.MALE) {
				sum += memberList.get(i).getAge();
				count ++;
			}
		}
		avg2 = (double)sum/count;
		System.out.println("\nfor문 결과 : " + avg2);
		
		//Iterator를 이용한 남자멤버 평균나이
		double avg3;
		sum = 0;
		count = 0;
		Iterator<Member> iterator = memberList.iterator();
		while(iterator.hasNext()) {
			Member m = iterator.next();
			if(m.getGender() == Member.Gender.MALE) {
				sum += m.getAge();
				count++;
			}
		}
		avg3 = (double)sum/count;
		System.out.println("\nIterator문 결과: "+avg3);
		
	}
	static class Member{
		enum Gender{
			MALE,
			FEMALE
		}
		
		
		private String name;
		private String job;
		private int age;
		private Gender gender;
		
		
		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}
		
		public Member(Gender gender, int age) {
			this.gender = gender;
			this.age = age;
		}
		
		
		public String getName() {
			return name;
		}
		
		public String getJob() {
			return job;
		}
		
		public Gender getGender() {
			return gender;
		}
		public int getAge() {
			return age;
		}
	}
	
}

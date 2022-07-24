package chap16.exercise;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample3 {
	public static void main(String[] args) {
		
		//List�� ����Ǿ� �ִ� Member�� �������� �׷����ؼ� Map��ü�� �����ϱ�.
		//key�� ����, value �� �̸����� ������ List<String>
	
		List<Member> list = Arrays.asList(   
				new Member("ȫ�浿","������"),
				new Member("�質��","�����̳�"),
				new Member("�ſ��","������")
				);
		
		//���⼭ ���� ����
		Map<String,List<String>> groupingMap = list.stream()
				.collect(
						Collectors.groupingBy(
								Member::getJob,
								Collectors.mapping(Member::getName,Collectors.toList())
								)
						);
		
		
		//
//		System.out.print("[������] ");
//		groupingMap.get("������").stream().forEach(s->System.out.print(s + " "));
//		System.out.print("\n[�����̳�] ");
//		groupingMap.get("�����̳�").stream().forEach(s->System.out.print(s + " "));
				
		
		List<Member> memberList = Arrays.asList(
				new Member(Member.Gender.MALE,30),
				new Member(Member.Gender.MALE,20),
				new Member(Member.Gender.FEMALE,10),
				new Member(Member.Gender.MALE,34),
				new Member(Member.Gender.FEMALE,24)
				);
		//��Ʈ���� �̿��� ���ڸ�� ��ճ���
		double avg = memberList.stream()
				.filter(m->m.getGender() == Member.Gender.MALE)
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		System.out.println("\n��Ʈ�� ��� : " + avg );
		
		//for���� �̿��� ���ڸ�� ��ճ���
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
		System.out.println("\nfor�� ��� : " + avg2);
		
		//Iterator�� �̿��� ���ڸ�� ��ճ���
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
		System.out.println("\nIterator�� ���: "+avg3);
		
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

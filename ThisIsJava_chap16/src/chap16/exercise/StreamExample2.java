package chap16.exercise;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		//List�� ����Ǿ� �ִ� Member�� ��� ���̸� ����ϱ�
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿",30),
				new Member("�ſ��",40),
				new Member("���ڹ�",26)
				);
		
		//�� �κ��� ����
		double avg = list.stream()
				.mapToInt(m->m.getAge())
				.average().getAsDouble();
		//
		System.out.println("��� ���� :" + avg);
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

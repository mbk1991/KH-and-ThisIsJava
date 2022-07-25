package chap16.streamexam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList( /// �Ű����� ... �� �ذ� �־���. ���� ������ �ָ� ��ü������ �迭�θ���� ó���ϴ� ����
				new Student("ȫ�浿", 90), 
				new Student("�ſ��", 92), 
				new Student("���ڹ�", 95)
				);

		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
		
		List<Student> list2 = Arrays.asList(
				new Student("����",10), new Student("������",20),new Student("�ڹڹ�",30));
		///asList�� arrayList�� ��ȯ�Ѵ�.
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i).getName() + "-" + list2.get(i).getScore());
		}
		
				
		
		
		
	}
}

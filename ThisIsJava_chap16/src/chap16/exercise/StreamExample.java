package chap16.exercise;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		// List�� ����Ǿ� �ִ� String��ҿ��� ��ҹ��ڿ� �������"java"��� �ܾ ���Ե� ���ڿ���
		//���͸��ؼ� ����ϱ�
		
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		//�� �κ��� ���� :
		list.stream()
		.filter(s->s.toLowerCase().contains("java"))
		
		//
		.forEach(a->System.out.println(a));
		
	}
}

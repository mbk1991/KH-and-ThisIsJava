package sec06.stream_sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] { 5, 3, 2, 1, 4 });
		
		
		//��ü��Ұ� Comparable�� �����ϰ� �ִ°�? 
		//yes ->
		//sorted()
		//sorted((a,b)-> -> a.compareTo(b)) or sorted((b,a) -> b.compareTo(a))
		//->sorted(Comparator.naturalOrder())  or sorted(Comparator.reverseOrder())
		
		//no ->
		//sorted((a,b) -> { -1,0,1�� �����ϴ� ����})
		
		
		intStream
			.sorted()
			.forEach(System.out::println);
		
		System.out.println();
		
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 30),
				new Student("�ſ��", 10),
				new Student("���̼�", 20)
				);
		
		studentList.stream()
			.sorted()
			.forEach(s->System.out.println(s.getScore() + ","));
		
		System.out.println();
		
		studentList.stream()
			.sorted(Comparator.reverseOrder())  // �ݴ�� ����. 
			.forEach(s->System.out.println(s.getScore() + ","));
		
		
	}
}

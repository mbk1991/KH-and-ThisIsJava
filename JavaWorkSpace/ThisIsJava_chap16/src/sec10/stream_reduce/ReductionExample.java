package sec10.stream_reduce;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		
		
		//reduce�� �̿��� ������ ���� ���� ó��!!
		
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿",92),
				new Student("�ſ��",95),
				new Student("���ڹ�",70)
				);
	
		int sum1 = studentList.stream()
				.mapToInt(s->s.getScore())
				.sum();
		
		int sum2 = studentList.stream()
				.mapToInt(Student::getScore)
				.reduce((a,b) -> a+b)
				.getAsInt();
		
		int sum3 = studentList.stream()
				.mapToInt(Student::getScore)
				.reduce(0,(a,b)->a+b);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
	}
}

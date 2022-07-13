package chap16.streamexam;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList( /// �Ű����� ... �� �ذ� �־���. ���� ������ �ָ� ��ü������ �迭�θ���� ó���ϴ� ����
				new Student("ȫ�浿", 90), 
				new Student("�ſ��", 92), 
				new Student("���ڹ�", 95)
				);
		
//		list.stream().mapToInt(s->s.getScore())
		double avg =  list.stream()  // StudentŸ���� stream�� �����
				.mapToInt(Student::getScore)  //(�߰�ó��) Student�� �޼ҵ� getScore�� �����Ͽ� Int�߰�Stream�� �����
				.average()  // (����ó��) ����� ���ϴ� ����ó���� ��. OptionalDoubleŸ�� ��ȯ OptionalDouble? Ŭ������.
				.getAsDouble();
		
		System.out.println("��� ���� : " + avg);
		
	}
}

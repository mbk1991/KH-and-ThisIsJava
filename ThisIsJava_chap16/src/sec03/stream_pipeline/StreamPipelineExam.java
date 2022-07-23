package sec03.stream_pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipelineExam {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(  //asList �� �迭�� �޾� ArrayList�� ��ȯ.
				new Member("ȫ�浿",Member.MALE,30),
				new Member("�質��",Member.FEMALE,20),
				new Member("�ſ��",Member.MALE,45),
				new Member("�ڼ���",Member.FEMALE,27)
				);
		
		// 1. ��Ʈ���� ���� 2.�߰�ó���Ͽ� �߰���Ʈ���� ���� 3. ����ó���Ͽ� ���� ����.// lazy ���� ���: ����ó���� ���۵Ǿ�� �߰�ó���� �����.
		// �� ������ ���� SQL�� �����Լ��� ����ϴ� ������ ������ �� ����.
		
		Stream<Member> maleFemaleStream = list.stream(); //list�÷������� stream��ü�� ���
		Stream<Member> maleStream = maleFemaleStream.filter(m->m.getSex() == Member.MALE); //m.getSex�� ������ ��츸 ���͸��Ͽ� ��Ʈ������
		IntStream ageStream = maleStream.mapToInt(m->m.getAge());  // getAge ������ IntStream���� �̾Ƴ�
		OptionalDouble optionalDouble = ageStream.average(); // �̾Ƴ� �͵��� ������� ����ó���Ͽ� OptionalDouble Ÿ������ 
		double avg = optionalDouble.getAsDouble(); // �̸� �ٽ� double ���� ��ȯ
		
		System.out.println(avg);
		
		//�̸� ���ʿ��� ���� ������ ���� �޼ҵ�ü�̴��ϸ�
		
		double avg2 = list.stream().filter(m->m.getSex() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble();
		System.out.println(avg2);
		
		
		
		
	}
	
}

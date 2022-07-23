package sec09.stream_aggregate;

import java.util.Arrays;

public class AgrregateExample {
	
	//stream��  ����ó�� : ����
	// SQL�� �����Լ�ó�� �뷮�� �����͸� �ϳ��� ������ �������
	// �̸� ������ (Reduction)�̶�� �Ѵ�.
	//Optional Ŭ����
	//���� �޼ҵ��� ���� Ÿ������ ���Ǿ� ���谪�� ������ ����
	//���� �������� �ʴ� ��� ����Ʈ ���� ������ ���� �ִ�.
	//���� ���� ó���ϴ� Consumer�� ����� �� �ִ�.

	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5})
		.filter(n->n%2==0)
		.count();
		System.out.println(count);
		
		long sum = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n->n%2 ==0)
				.sum();
		System.out.println(sum);
		
		int max = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n->n%2==0)
				.max()
				.getAsInt();
		
		System.out.println(max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n->n%2==0)
				.min()
				.getAsInt();
		System.out.println(min);
		
		int first = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n->n%2==0)
				.findFirst()
				.getAsInt();
		System.out.println(first);
		
	}

}

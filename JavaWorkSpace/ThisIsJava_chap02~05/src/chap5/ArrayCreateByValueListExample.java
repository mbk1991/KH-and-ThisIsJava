package chap5;

public class ArrayCreateByValueListExample {
	//���� ����Ʈ�� �迭 ����
	public static void main(String [] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		//scores = {10, 20, 30}; ������ ����, ���� ����Ʈ�� �迭 ������ new �����ڷ� �ʱ�ȭ �ʿ�
		int sum1 = 0;
		for(int i =0; i <= scores.length -1 ; i ++) {
			sum1 += scores[i];
		}
		System.out.println("���� : " + sum1);
		
		int sum2 = 0;
		sum2 = add(scores);
		System.out.println("����2 : " + sum2);
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i =0; i<=scores.length-1; i++) {
			sum += scores[i];
		}
		return sum;
	}
}

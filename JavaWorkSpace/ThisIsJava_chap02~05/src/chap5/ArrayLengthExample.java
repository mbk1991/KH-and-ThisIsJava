package chap5;

public class ArrayLengthExample {
	// �迭�� length �ʵ�
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum = 0;
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("���� : " + sum);
		
		double avg =  sum / (double) scores.length;
		System.out.println("��� : " + avg);
	}
}

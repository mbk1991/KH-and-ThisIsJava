package chap5;

public class ArrayCreateByValueListExample1 {
 //�� ������� �迭 ����
	public static void main(String[] args) {
		int [] score = {83, 90, 87};
		
		System.out.println("Score[0] : " + score[0]);
		System.out.println("Score[1] :" + score[1]);
		System.out.println("Score[2] :" + score[2]);
		
		int sum = 0;
		for(int i = 0 ; i<3 ; i++) {
			sum += score[i];
		}
		
		System.out.println("���� : " + sum);
		double avg = (double) sum/3;
		
		System.out.println("��� : " + avg);
		
		
	}
}

package chap5;

public class AdvancedForExample {
	//���� for��
	public static void main(String[] args) {
		int[] scores = {95, 71,  84, 93, 87};
		
		int sum =0;
		for(int score:scores) {
			sum += score;
		}
		System.out.println("���� : " +sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("��� : " +avg);
	}
}

package chap4;

public class BreakOutterExample {
	// �ٱ� �� �ݺ��� ����
	public static void main(String[] args) {
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') continue Outter;
			}
		}
	System.out.println("���α׷� ���� ����");
	}
}

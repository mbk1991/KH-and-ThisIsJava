package chap4;

public class IfDiceExample {
	// �ֻ����� ��ȣ�� �̴� ����
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6)+1; // 0.0<= random < 1.0

		if (num == 1) {
			System.out.println(num + "���� ���Խ��ϴ�.");
		} else if (num == 2) {
			System.out.println(num + "���� ���Խ��ϴ�.");
		} else if (num == 3) {
			System.out.println(num + "���� ���Խ��ϴ�.");
		} else if (num == 4) {
			System.out.println(num + "���� ���Խ��ϴ�.");
		} else if (num == 5) {
			System.out.println(num + "���� ���Խ��ϴ�.");
		} else if (num == 6) {
			System.out.println(num + "���� ���Խ��ϴ�.");
		}
	}
}

package chap11.exercise;

public class FindAndReplaceExample {
	public static void main(String[] args) {
		String str  = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str.indexOf(str);
		if(index == -1) {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
		} else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
			str = str.replace("�ڹ�", "JAVA");
			System.out.println("=>" + str);
		}
	}
}

package chap11.clone;

public class StudentExample {
	public static void main(String[] args) {
		Student original = new Student("���ϵ�", "��", 3);
		
		Student cloned = original.getMember();
		
	}
}

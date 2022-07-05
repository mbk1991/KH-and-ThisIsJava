package chap11.clone;

public class StudentExample {
	public static void main(String[] args) {
		Student original = new Student("±Ë¿œµµ", "≥≤", 3);
		
		Student cloned = original.getMember();
		
	}
}

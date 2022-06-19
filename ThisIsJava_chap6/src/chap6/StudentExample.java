package chap6;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student객체를 참조합니다.");
		System.out.println(s1);
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student객체를 참조합니다.");
		System.out.println(s2);
		
	}
}

//같은 패키지일 경우 import를 하지 않아도 객체 생성 가능
// 다른 패키지일 경우 import 시 가능. 단 public일 경우
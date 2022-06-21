package chap6;
//import chap6;  // 같은 패키지라 import하지 않아도 사용이 가능하다.


public class PersonExample {
	//final필드 테스트
	
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "미륵");
		
		System.out.println(p1.ssn);
		System.out.println(p1.nation);
		System.out.println(p1.name);
		
//		p1.nation = "USA"; //The final field Person.nation cannot be assigned
//		p1.ssn = "987654-1234567";// final 필드 Person.nation은 변경할 수 없다.
		p1.name = "계륵"; // final이 아닌 필드는 변경이 가능!
	}
	
}

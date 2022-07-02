package chap9.nestedclassex;

public class Main {
	public static void main(String[] args) {
		A a = new A();

		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B(); // 희안하다. A클래스.B클래스, a객체.new B() // 처음보면 생소할듯.
		
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method(); 
		
	
	}
}
package chap9.nestedclassex;

public class A {
	A(){System.out.println("A 객체가 생성됨");	}
	//인스턴스 멤버 클래스//
	class B{
		B(){System.out.println("B 객체가 생성됨");}
		int field1;
		//static int filed2;  네스티드클래스는 스태틱 필드를 선언할 수 없다.
		void method1() {}
//		static void method2() {}
	}
	
	//정적 멤버 클래스//
	static class C{
		C(){System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}  //static멤버클래스는 static 필드와 메소드 선언 가능.
		
	}
	
	
	
	void method() {
		//로컬 클래스//
		class D{
			D(){System.out.println("D 객체가 생성됨");}
			int field1;
//			static int field2;
			void method1() {}
//			static void method2() {}
			
		}
		D d= new D();
		d.field1 = 3;
		d.method1();
		
	}
}

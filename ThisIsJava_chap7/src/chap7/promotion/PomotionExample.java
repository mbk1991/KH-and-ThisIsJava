package chap7.promotion;

public class PomotionExample {
	public static void main(String[] args) {
		A a = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		A a5 = new E();
		
		B b = new B();
		B b2 = new D();
		
		C c = new C();
		C c2 = new E();
		
		D d = new D();
		E e = new E();
		
		//B b3 = new E(); 자식이 아니면 불가.
		
	}
}

class A{}

class B extends A{}

class C extends A{}

class D extends B{}

class E extends C{}


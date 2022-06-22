package chap6.a;

public class B {
//	A a = new A();
//	B b = new B();
	String str = "";
	public static int intnum = 0;
	public static void main(String[] args) {
		B b = new B();
		System.out.println(intnum);
		System.out.println(b.str);
//		aa();
	}
	
	public void aa() {};
}


//같은 패키지에서는 패키지를 import 하지 않아도 됨. 패키지는 클래스의 식별자 역할이므로 같은 패키지 내에서 import를 하는 것은 의미가 없음.

package chap6.b;

import chap6.a.*;

public class C {
//	A a;
	B b;   // 객체를 필드로 선언할 경우 해당 클래스 내의 메소드에서 접근 가능하구나.
	
	public void a() {
		System.out.println(b.intnum);
		b.aa();
	}
}

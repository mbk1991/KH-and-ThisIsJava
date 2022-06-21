package chap6.a;

import chap6.b.*;

  class A {
	B b;
	A a;
	C c;
	int num = 0;
	public void a() {
		B b = new B();
		System.out.println(b.intnum);  //The static field B.intnum should be accessed in a static way
		System.out.println(B.intnum);
	}
}

class D{
	A a;
	B b;
	
	
}
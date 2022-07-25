package chap6.constructor_access.package2;

import chap6.constructor_access.package1.A;

public class C {
	//필드
	A a1 = new A(true);
	//A a2 = new A(1);  //자식이 아닌 다른 클래스이므로 불가
	//A a3 = new A("문자열"); // private이므로 불가
	

}

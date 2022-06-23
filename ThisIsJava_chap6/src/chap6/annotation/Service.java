\

package chap6.annotation;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용 1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용 2");
	}
	
	@PrintAnnotation(value="%", number=30)
	public void method3() {
		System.out.println("실행 내용 3");
	}
}

package chap7.castingexam;

public class InstanceofExample {
	public static void method(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1-Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2-Child로 변환 성공"); // ClassCastException 발생 가능성 존재
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method(parentB);
		method2(parentB);
		
		
	}
	
}

package chap7.castingexam;

public class InstanceofExample {
	public static void method(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		}else {
			System.out.println("method1-Child�� ��ȯ���� ����");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2-Child�� ��ȯ ����"); // ClassCastException �߻� ���ɼ� ����
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

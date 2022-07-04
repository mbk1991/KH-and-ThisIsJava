package chap9.exercise;

public class Car {
	class Tire {
		// 인스턴스멤버클래스
		public void method1() {
			System.out.println("Tire의 메소드 1을 실행합니다.");
		}
	}

	
	static class Engine {
		// 스태틱멤버클래스
		public static void method2() {
			System.out.println("Engine의 메소드 1을 실행합니다.");
		}
	} 
}

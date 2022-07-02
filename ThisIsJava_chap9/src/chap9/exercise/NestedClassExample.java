package chap9.exercise;

public class NestedClassExample {
	//멤버클래스의 객체를 생성하는 코드 작성.
	public static void main(String[] args) {
	
	Car car = new Car();
	
	Car.Tire tire = car.new Tire();
	
	Car.Engine engine = new Car.Engine();
	
	tire.method1();
	Car.Engine.method2();
	engine.method2();
	
	}
}

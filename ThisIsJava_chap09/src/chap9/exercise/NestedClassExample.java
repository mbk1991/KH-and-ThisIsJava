package chap9.exercise;

public class NestedClassExample {
	//���Ŭ������ ��ü�� �����ϴ� �ڵ� �ۼ�.
	public static void main(String[] args) {
	
	Car car = new Car();
	
	Car.Tire tire = car.new Tire();
	
	Car.Engine engine = new Car.Engine();
	
	tire.method1();
	Car.Engine.method2();
	engine.method2();
	
	}
}

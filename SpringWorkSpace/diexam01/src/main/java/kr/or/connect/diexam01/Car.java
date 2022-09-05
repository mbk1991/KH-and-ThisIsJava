package kr.or.connect.diexam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired  //알아서 엔지타입의 객체가 있으면 주입해줘라는 의미.
	private Engine v8;
	
	public Car() {
		System.out.println("Car 생성자");
	}
	
	
	public void run() {
		System.out.println("엔진을 이용하여 달립니다.");
		v8.exec();
	}

	public static void main(String[] args) {
		Engine e = new Engine();
		Car c = new Car();
		c.run();
	}
}
package chap6;

public class CarExample {
	// 외부 클래스에서 Car필드값 읽기와 변경
	public static void main(String[] args) {
		// 객체 생성
//		Car myCar = new Car();
//
//		// 필드값 읽기
//		System.out.println("제작회사: " + myCar.company);
//		System.out.println("모델명: " + myCar.model);
//		System.out.println("색상: " + myCar.color);
//		System.out.println("최고속도: " + myCar.maxSpeed);
//		System.out.println("현재속도: " + myCar.speed);
//		
//		//필드값 변경
//		myCar.maxSpeed = 60;
//		System.out.println("수정된 속도: "+ myCar.speed);

		Car car1 = new Car();
		Car car2 = new Car("파란색", 3500);
		Car car3 = new Car("캐스퍼", "초록색");
		Car car4 = new Car("투싼", "빨간색", 280);

		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		System.out.println("car1.speed : " + car1.speed);
		System.out.println("car1.cc : " + car1.cc);
		System.out.println();
		System.out.println("=====");

		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);
		System.out.println("car2.speed : " + car2.speed);
		System.out.println("car2.cc : " + car2.cc);
		System.out.println();
		System.out.println("=====");

		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println("car3.speed : " + car3.speed);
		System.out.println("car3.cc : " + car3.cc);
		System.out.println();
		System.out.println("=====");

		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println("car4.speed : " + car4.speed);
		System.out.println("car4.cc : " + car4.cc);
		System.out.println();
		System.out.println("=====");

	}
}

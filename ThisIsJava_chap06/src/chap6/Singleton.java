package chap6;

public class Singleton {
	
	//싱글톤, 오직 하나의 객체만 생성하도록 설계한 것
	//new연산자를 통해서 맘대로 객체를 만들지 못하도록 한 것.
	//하나의 객체만 생성한다는 것은 하나의 주소만을 참조하는 변수만 있다는 것.
	//이건 언제 쓰지?
	
	//정적 필드
	private static Singleton singleton = new Singleton();
	//static은 객체 생성없이 쓸 수 있다.
	
	//생성자
	private  Singleton() {}
	
	
	//정적 메소드
	 static Singleton getInstance() {
		
		return singleton;
	}
}

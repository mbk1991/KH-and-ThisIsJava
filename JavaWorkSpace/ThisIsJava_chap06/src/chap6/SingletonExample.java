package chap6;

public class SingletonExample {
	public static void main(String[] args) {
		
//		Singeton obj1 = new Singleton(); // 컴파일 에러 The constructor Singleton() is not visible
//		Singeton onj2 = new Singetone(); // 컴파일 에러 private이기 때문
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}
}

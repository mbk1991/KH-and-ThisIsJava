package chap6;

public class SingletonExample {
	public static void main(String[] args) {
		
//		Singeton obj1 = new Singleton(); // ������ ���� The constructor Singleton() is not visible
//		Singeton onj2 = new Singetone(); // ������ ���� private�̱� ����
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
		
	}
}

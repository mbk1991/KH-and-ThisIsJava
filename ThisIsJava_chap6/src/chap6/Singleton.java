package chap6;

public class Singleton {
	
	//�̱���, ���� �ϳ��� ��ü�� �����ϵ��� ������ ��
	//new�����ڸ� ���ؼ� ����� ��ü�� ������ ���ϵ��� �� ��.
	//�ϳ��� ��ü�� �����Ѵٴ� ���� �ϳ��� �ּҸ��� �����ϴ� ������ �ִٴ� ��.
	//�̰� ���� ����?
	
	//���� �ʵ�
	private static Singleton singleton = new Singleton();
	//static�� ��ü �������� �� �� �ִ�.
	
	//������
	private  Singleton() {}
	
	
	//���� �޼ҵ�
	 static Singleton getInstance() {
		
		return singleton;
	}
}

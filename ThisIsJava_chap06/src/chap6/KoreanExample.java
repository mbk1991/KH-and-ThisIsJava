package chap6;

public class KoreanExample {
	//��ü ���� �� �ʵ尪 ���
	public static void main(String[] args) {
		Korean k1 = new Korean("��������", "300830-5xxxxxx");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("�Ӳ���","020505-3111111");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		
	}
}

package chap6;
//import chap6;  // ���� ��Ű���� import���� �ʾƵ� ����� �����ϴ�.


public class PersonExample {
	//final�ʵ� �׽�Ʈ
	
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "�̸�");
		
		System.out.println(p1.ssn);
		System.out.println(p1.nation);
		System.out.println(p1.name);
		
//		p1.nation = "USA"; //The final field Person.nation cannot be assigned
//		p1.ssn = "987654-1234567";// final �ʵ� Person.nation�� ������ �� ����.
		p1.name = "�踤"; // final�� �ƴ� �ʵ�� ������ ����!
	}
	
}

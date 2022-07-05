package chap11.clone;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	//�ʵ尪�� �⺻���� �ֱ� ������ ���� ������ �Ͽ��� �ʵ尪�� ���簡 ��
	// ������ �������̶�� ���������� �ּҰ��� �����ϱ� ������ ���� ��ü��
	//�ǵ帮�� �Ǿ� ������ �ǹ̰� �������� �Ǿ������.
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			
			cloned = (Member) this.clone(); // clone()�޼ҵ��� ���� Ÿ���� Object�̹Ƿ� MemberŸ������ ĳ�����ؾ���
			System.out.println("���� ����ü ����");
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
	}

}

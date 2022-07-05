package chap11.clone;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	//필드값이 기본형만 있기 때문에 얕은 복제를 하여도 필드값이 복사가 됨
	// 하지만 참조형이라면 얕은복제시 주소값만 복사하기 때문에 같은 객체를
	//건드리게 되어 복사의 의미가 없어지게 되어버린다.
	
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
			
			cloned = (Member) this.clone(); // clone()메소드의 리턴 타입은 Object이므로 Member타입으로 캐스팅해야함
			System.out.println("얕은 복사체 생성");
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
	}

}

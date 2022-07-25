package chap11.cloneex.deep;

import java.util.Arrays;

public class Member implements Cloneable{
	public String name;
	public int age;
	public int[] scores; //
	public Car car;   // 참조 타입 필드는 깊은복제를 해야 한다.
	
	public Member(String name, int age, int[] scores, Car car) {
		this. name = name;
		this. age = age;
		this. scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 목사를 해서 name, age를 복제한다.
		Member cloned = (Member)super.clone();  // Object의 clone()호출
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores,this.scores.length);
		//car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		//깊은 복제한 Member 객체를 리턴.
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) this.clone();
			
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
	}

}

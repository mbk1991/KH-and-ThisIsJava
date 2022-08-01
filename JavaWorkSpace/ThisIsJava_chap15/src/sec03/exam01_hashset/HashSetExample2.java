package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member>set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		//객체가 다르지만 필드값을 비교하도록 하였으므로 하나만 저장되어야함
		
		System.out.println("총 객체수 : " + set.size());
	}

}

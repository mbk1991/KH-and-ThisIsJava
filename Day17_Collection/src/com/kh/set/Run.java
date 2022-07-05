package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.domain.Student;

public class Run {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("two");
		System.out.println("저장된 데이터의 수 : " + set.size());
		set.clear();
		System.out.println("저장된 데이터의 수 :" + set.size());
		set.add("1");
		set.add("2");
		System.out.println("데이터가 있는지 (Null Check) : " + set.isEmpty());

		Set<Student> stdSet = new HashSet<Student>();
		Student stdOne = new Student();
		stdOne.setName("강동원");
		stdOne.setScore(100);
		stdSet.add(stdOne);
		stdSet.add(new Student("소지섭", 99));
		stdSet.add(new Student("조인성", 98));
		stdSet.add(new Student("정우성", 100));
		stdSet.add(new Student("정우성",100));
		
		
		
				Iterator<Student> it = stdSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
		Set<Integer> integerSet = new HashSet<Integer>();
		String strValue = "abc";

	}
}

package com.kh.controller;

import com.kh.domain.Student;
import com.kh.listcollection.IntList;
import com.kh.listcollection.ObjectList;
import com.kh.listcollection.RList;

public class ListController {
	
	public void listExercise1() {
//		int[] nums = new int[3];
//		nums[0] = 1;
//		nums[1] = 2;
//		nums[2] = 3;
			
		IntList list = new IntList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.get(0));
		System.out.println(list.size());
		list.clear();
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}
	
	public void listExercise2() {

		
		ObjectList objList = new ObjectList();
		objList.add(6);
		objList.add("abc");
		objList.add('A');
//		objList.add(new Student());
//		objList.add(new ObjectList());
		
		//ObjectList에서 값 가져오기
		int intValue;
		String strValue;
		char charValue;
		Student student;
		ObjectList objectList;
		
		intValue = (int) objList.get(0);
		strValue = (String) objList.get(1);
		charValue = (char) objList.get(2);
//		student = (Student) objList.get(3);
//		objectList = (ObjectList) objList.get(4);
		
		System.out.println("intValue : " + intValue);
		System.out.println("strValue : " + strValue);
		System.out.println("charValue : " + charValue);
//		System.out.println("student : " + student);
//		System.out.println("objectList : " + objectList);
		
	}
	
	public void listExercise3() {
		RList<Integer> objList = new RList<Integer>();
		objList.add(11);
		objList.add(20);
		
		int num = objList.get(0);
		num = objList.get(1);
		
		objList.add(22);
		num = objList.get(2);
		System.out.println("num : " + num );
	}
	
}

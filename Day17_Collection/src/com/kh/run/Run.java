package com.kh.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.controller.ListController;

public class Run {
	public static void main(String[] args) {

//		ListController listCon = new ListController();
//		listCon.listExercise1();
//		listCon.listExercise2();
//		listCon.listExercise3();
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(6);
		list.add(13); // add()메소드, 리스트에 값 추가
	
		int size = list.size(); // size() 메소드, 리스트 크기
		System.out.println("size: " + size);
		
		list.clear();  // clear() 메소드, 리스트 모든 값 삭제
		size = list.size();
		System.out.println("size: " + size);
		
		list.add(11);
		list.add(18);
		System.out.println("1번째 : " +list.get(0));
		//get() 메소드, index에 해당하는 값 리턴
		System.out.println("2번째 : "+list.get(1));
		System.out.println("for문으로 출력");
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "번째 : " + list.get(i));
		}
		
		System.out.println("list에 데이터가 있는지 (Null Check)?"
				+ !list.isEmpty());
		
		
		
	}
}
